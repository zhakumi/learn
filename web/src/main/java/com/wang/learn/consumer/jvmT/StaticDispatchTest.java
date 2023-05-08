package com.wang.learn.consumer.jvmT;

/**
 * Java静态分配
 */
public class StaticDispatchTest {
    static void print(Father father) {
        System.out.println("this is father");
    }
    static void print(Son son) {
        System.out.println("this is son");
    }
    public static void main(String[] args) {
        Father father = new Son();
        print(father);
        //输出this is father
        // 由于father变量类型被声明为Father。因此在编译阶段就已经确定了调用的是参数为Father的方法，
        // 与具体的实例化对象无关
    }

}
