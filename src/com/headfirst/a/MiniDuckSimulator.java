package com.headfirst.a;
//测试类
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck maliard = new MallardDuck();
        maliard.performQuack();
        maliard.performFly();
        maliard.display();

        System.out.println("======================");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketRowered());
        model.performFly();
    }
}
