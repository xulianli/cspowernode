package com.cspowernode.teaching.p3.animal;

/**
 * @Author 汪洋
 * @Date 2023/3/18 14:04
 * @Description
 * 案例：要求在原有的Animal体系中，增加一个饲养员的类(AnimalAdmin)，该类的作用就是为这些
 * Animal的子类进行喂食(feed)，然后怎么才能把这个要求完成的比较好；
 * a.在AnimalAdmin的类里面为每个不同的动物都提供一个饲养的方法；
 *  --->方法过多，造成命名污染，而且后期要额外增加动物，该方法还得加不同的对应方法
 * b.把原来的方法都使用方法重载的形式来修改，这样避免命名污染；
 *  --->虽然命名污染问题解决了，但是从本质上来说，仍然是每次新增动物类，这里都要额外新增方法才行
 * c.使用一个方法即可，参数上使用父类来指向子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        /*AnimalAdmin admin = new AnimalAdmin();
        admin.feedBird(new Bird());
        admin.feedDog(new Dog());
        admin.feedFish(new Fish());
        admin.feedSnake(new Snake());*/
        AnimalAdmin admin = new AnimalAdmin();
        admin.feed(new Bird());
        admin.feed(new Dog());
        admin.feed(new Fish());
        admin.feed(new Snake());
    }
}
//方法3：使用多态
class AnimalAdmin{
    public void feed(Animal animal){//使用父类来指向子类对象：Animal animal = new Dog();
        animal.eat();
    }
}
//方法2：使用方法的重载来解决命名污染的问题，但是仍然存在方法过多，每次新增动物都要额外写方法的问题
class AnimalAdmin2{
    public void feed(Dog dog){
        dog.eat();
    }
    public void feed(Bird dog){
        dog.eat();
    }
    public void feed(Snake dog){
        dog.eat();
    }
    public void feed(Fish dog){
        dog.eat();
    }
}
//方法1：为每个动物增加一个喂养的方法
class AnimalAdmin1{
    public void feedDog(Dog dog){
        dog.eat();
    }
    public void feedBird(Bird dog){
        dog.eat();
    }
    public void feedSnake(Snake dog){
        dog.eat();
    }
    public void feedFish(Fish dog){
        dog.eat();
    }
}
class Animal{
    public void eat(){
        System.out.println("这是animal的eat方法");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("这是Dog的eat方法");
    }
}
class Bird extends Animal{
    public void eat(){
        System.out.println("这是Bird的eat方法");
    }
}
class Fish extends Animal{
    public void eat(){
        System.out.println("这是Fish的eat方法");
    }
}
class Snake extends Animal{
    public void eat(){
        System.out.println("这是Snake的eat方法");
    }
}
