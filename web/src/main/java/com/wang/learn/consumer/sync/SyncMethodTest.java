package com.wang.learn.consumer.sync;

/**
 * 同步方法 对象锁 锁定当前方法调用者
 */
public class SyncMethodTest implements Runnable{

    /**
     * synchronized用在普通方法上，默认的所就是this，当前实例
     */
    @Override
        public synchronized void run() {
                System.out.println(Thread.currentThread().getName() + "开始执行");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "执行结束");
        }

        public static void main(String[] args) {
            SyncMethodTest demo = new SyncMethodTest();
            SyncMethodTest demo1 = new SyncMethodTest();
            //因为锁锁的对象 所有线程1，2同时执行，线程3需要等待
            new Thread(demo,"线程1").start();
            new Thread(demo1,"线程2").start();
            new Thread(demo,"线程3").start();
        }
}
