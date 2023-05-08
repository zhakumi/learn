package com.wang.learn.consumer.jvmT;

/**
 * 动态分配
 */
public class DynamicDispatchTest {

    public static void main(String[] args) {
        Father father = new Son();
        father.say();
        father = new Father();
        father.say();
        //对于方法重写 java采用动态分配
    }
}
