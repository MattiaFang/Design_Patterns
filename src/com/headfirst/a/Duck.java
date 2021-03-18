package com.headfirst.a;
public abstract class Duck{
    //为行为接口声明两个引用变量，所有鸭子类（在同一个package中）都继承它们。
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    //委托给行为类
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("ALL duck float,even decoys");
    }

    //动态设定行为
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}