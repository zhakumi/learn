package com.wang.learn.consumer.sync;

/**
 * 静态方法 锁类
 */
public class SyncStaticTest implements Runnable{
    @Override
    public void run() {
        syncStatic();
    }


    /**
     * synchronized用在静态方法上，默认锁的就是当前所在的Class类，
     * 所以无论是哪个线程访问它，需要的锁都只有一把
     */
    public static synchronized void syncStatic(){
        System.out.println(Thread.currentThread().getName() + "执行了");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束了");
    }

    public static void main(String[] args) {
        SyncStaticTest t1 = new SyncStaticTest();
        SyncStaticTest t2 = new SyncStaticTest();
        new Thread(t1,"线程1").start();
        new Thread(t2,"线程2").start();
    }


}
