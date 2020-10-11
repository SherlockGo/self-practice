package com.lipeng.javase.multithread;

import java.util.concurrent.Semaphore;

/**
 * @program: self-practice
 * @description: Semaphore信号量作为一种流控手段，可以对特定资源的允许同时访问的操作数量进行控制，
 *               例如池化技术(连接池)中的并发数，有界阻塞容器的容量等。
 *              （多个线程访问多个资源）
 * @author: LiPeng
 * @create: 2020-10-11 10:45
 **/
public class SemaphoreDemo {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);

        for (int i = 1; i <= 6; i++){
            new Thread(() -> {
                try {
                    /**
                     * 在进行操作的时候，需要先acquire获取到许可，才可以继续执行任务，如果获取失败，则进入阻塞
                     */
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t抢到车位");
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName() + "\t停车3秒后离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    /**
                     * 处理完成之后需要release释放许可
                     */
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }

    }

}
