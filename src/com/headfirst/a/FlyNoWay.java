package com.headfirst.a;

//这是飞行行为的实现，给”不会“飞的鸭子用
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}