package com.youluyao;

/**
 * Created by Administrator on 2017/7/21.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("第一次提交");
        System.out.println("第二次提交");
        System.out.println("第三次提交");
        HelloWorld helloWorld=new HelloWorld();
        helloWorld.setName("youluyao");
        System.out.println(helloWorld.getName());
    }

}
