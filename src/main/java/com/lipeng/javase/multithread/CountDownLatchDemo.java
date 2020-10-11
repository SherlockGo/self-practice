package com.lipeng.javase.multithread;

import java.util.concurrent.CountDownLatch;

/**
 * @program: self-practice
 * @description: 其他线程都执行完成之后，才继续执行当前线程
 * @author: LiPeng
 * @create: 2020-10-11 10:14
 **/
public class CountDownLatchDemo {

    private static CountDownLatch countDownLatch = new CountDownLatch(6);

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++){
            int temp = i;
            new Thread(() -> {
                System.out.println("线程" + temp + "执行，" + Thread.currentThread().getName() + "国灭亡");
                countDownLatch.countDown();
            }, CountryEnum.getCountry(i).getCountryName()).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "线程执行，秦朝统一天下");

    }

}
