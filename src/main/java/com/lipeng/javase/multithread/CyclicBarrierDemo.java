package com.lipeng.javase.multithread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @program: self-practice
 * @description: 循环屏障，阻塞线程数达到一定数量后继续执行某个任务
 * @author: LiPeng
 * @create: 2020-10-11 10:55
 **/
public class CyclicBarrierDemo {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("************召唤神龙");
        });

        for (int i = 1; i <= 7; i++){
            final int temp = i;
            new Thread(() -> {
                System.out.println("线程" + Thread.currentThread().getName() + "收集到第" + temp + "颗龙珠");
                try {
                    cyclicBarrier.await(); //当前线程阻塞
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }

    }

}
