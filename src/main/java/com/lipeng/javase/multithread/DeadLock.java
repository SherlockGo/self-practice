package com.lipeng.javase.multithread;

/**
 * @program: self-practice
 * @description:
 * @author: LiPeng
 * @create: 2020-09-19 12:54
 **/
public class DeadLock {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";

    public static void main(String[] args) {
        Thread a = new Thread(new Lock1());
        Thread b = new Thread(new Lock2());
        a.start();
        b.start();
    }

    static class Lock1 implements Runnable{
        @Override
        public void run() {
            try {
                System.out.println("Lock1 running");
                while (true){
                    synchronized (DeadLock.obj1){
                        System.out.println("Lock1 lock obj1");
                        Thread.sleep(3000);
                        synchronized (DeadLock.obj2){
                            System.out.println("Lock1 lock obj2");
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Lock2 implements Runnable{
        @Override
        public void run() {
            try {
                System.out.println("Lock2 running");
                while (true){
                    synchronized (DeadLock.obj2){
                        System.out.println("Lock2 lock obj2");
                        Thread.sleep(3000);
                        synchronized (DeadLock.obj1){
                            System.out.println("Lock2 lock obj1");
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
