package com.headfirst.a;
//绿头鸭
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();       //叫的职责被委托给Quack对象
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}

//当MallardDuck实例化时，它的构造器会把继承来的quackBehavior和flyBehavior实例变量初始化成Quack类型和FlyWithWings的新实例。
