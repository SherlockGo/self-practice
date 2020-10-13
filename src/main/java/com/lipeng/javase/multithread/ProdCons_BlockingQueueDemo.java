package com.lipeng.javase.multithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: self-practice
 * @description: 阻塞队列实现的生产者-消费者模型
 * @author: LiPeng
 * @create: 2020-10-13 22:49
 **/
public class ProdCons_BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {
        MyResource resource = new MyResource(new ArrayBlockingQueue<>(10));

        new Thread(() -> {
            System.out.println("线程" + Thread.currentThread().getName() + "\t生产线程启动");
            try {
                resource.produce();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "Producer").start();

        new Thread(() -> {
            System.out.println("线程" + Thread.currentThread().getName() + "\t消费线程启动");
            System.out.println();
            try {
                resource.consume();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "Consumer").start();

        TimeUnit.SECONDS.sleep(5);

        System.out.println();

        System.out.println("5秒时间到，停止生产和消费");

        resource.stop();
    }

}

/**
 * 资源类
 */
class MyResource{
    private volatile boolean flag = true;   //总开关，控制是否生产和消费
    private AtomicInteger atomicInteger = new AtomicInteger();
    BlockingQueue<String> queue = null;

    public MyResource(BlockingQueue<String> queue){
        this.queue = queue;
    }

    //生产
    public void produce() throws Exception {
        String data;
        boolean retValue;
        while (flag){
            data = atomicInteger.incrementAndGet() + "";
            retValue = queue.offer(data, 2L, TimeUnit.SECONDS);
            if (retValue){
                System.out.println("线程" + Thread.currentThread().getName() + "\t插入队列成功" + data);
            } else {
                System.out.println("线程" + Thread.currentThread().getName() + "\t插入队列失败" + data);
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("线程" + Thread.currentThread().getName() + "\t停止生产，flag = false.");
    }

    //消费
    public void consume() throws Exception {
        String result;
        while (flag){
            result = queue.poll(2L, TimeUnit.SECONDS);
            if (null == result || result.equals("")){
                flag = false;
                System.out.println("线程" + Thread.currentThread().getName() + "\t超过2秒没有获取到元素，退出消费");
                return;
            }
            System.out.println("线程" + Thread.currentThread().getName() + "\t获取元素成功" + result);
        }
    }

    //停止
    public void stop(){
        flag = false;
    }

}