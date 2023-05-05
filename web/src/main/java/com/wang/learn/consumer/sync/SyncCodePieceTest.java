package com.wang.learn.consumer.sync;

/**
 * 同步代码块 对象锁
 */
public class SyncCodePieceTest implements Runnable{

        @Override
        public void run() {
            /**
             * 同步代码块形式--->锁为this，两个线程使用的锁是一样的，
             * 线程1必须要等到线程2释放了该锁后，才能执行 MONITORENTER MONITOREXIT 实现
             */
//            synchronized (this) {
            //也可以改成锁类
            synchronized (SyncCodePieceTest.class) {
                System.out.println(Thread.currentThread().getName() + "开始执行");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "执行结束");
            }
        }

        public static void main(String[] args) {
            SyncCodePieceTest demo = new SyncCodePieceTest();
            new Thread(demo,"线程1").start();
            new Thread(demo,"线程2").start();
        }
}
