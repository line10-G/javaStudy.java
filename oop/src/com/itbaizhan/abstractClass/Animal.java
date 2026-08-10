package com.itbaizhan.abstractClass;

public abstract class Animal {
    int age;
    public abstract void rest();
    public abstract void run();
    public void shout(){
        System.out.println("Animal.shout");
        //抽象类不能实例化，既不能用new来实例化抽象类
        //Animal a = new Animal();
    };
}

class Dog extends Animal{
    @Override
    public void rest() {
        System.out.println("Dog.rest");
    }

    @Override
    public void run() {
        System.out.println("Dog.run");
    }

}

class Cat extends Animal{
    @Override
    public void rest() {
        System.out.println("Cat.rest");
    }
    @Override
    public void run() {
        System.out.println("Cat.run");
    }
}