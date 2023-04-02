package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/4/1 16:14
 * @Description
 * 泛型的定义场景1--定义在自己定义的类上面
 * 1.与之对应的带泛型的类太多了，比如ArrayList,我们可以通过ArrayList类中泛型的定义
 * 以及里面方法的定义来了解到泛型定义在类中的使用方式
 * 2.如何定义在类中的泛型
 *  a.首先在类名后面加尖括号，尖括号里面写一个名词，该名词代表此时你设置的某个类型；
 *  该类型是你在用该类的时候才确定的类型；
 *  b.然后你可以用该类型来声明属性
 *  c.也可以用该类型来声明方法的形参类型或者是返回值
 *  注意：当你定义好该类以及对应的属性和方法之后，那么你在初始化该类的时候设置了什么
 *  类型的泛型，那么对应的属性和方法中的类型就跟着确定下来了；
 */
public class GenericsClassDemo {
    public static void main(String[] args) {
        NoGenericsClass noGenericsClass = new NoGenericsClass();
        //此时，如果我想让我放入的元素类型和取出的元素类型保持一致，这种写法是做不到的
        noGenericsClass.setObj(100);
        Object obj1 = noGenericsClass.getObj();
        noGenericsClass.setObj("abc");
        Object obj2 = noGenericsClass.getObj();
        //使用定义了泛型的类来构建对象
        GenericsClass<Integer> genericsClass1 = new GenericsClass<>();
        genericsClass1.setObj(100);
        int obj3 = genericsClass1.getObj();
        GenericsClass<String> genericsClass2 = new GenericsClass<>();
        genericsClass2.setObj("abc");
        String obj4 = genericsClass2.getObj();
    }
}
//为了对比带泛型和不带泛型类的区别，所以在这里先构建一个不带泛型，而是使用Object作为类型的类
class NoGenericsClass{
    Object obj;
    public void setObj(Object obj){
        this.obj = obj;
    }
    public Object getObj(){
        return obj;
    }
}
//跟上面不带泛型的类进行横向对比
class GenericsClass<Type>{
    Type obj;
    public void setObj(Type obj){
        this.obj = obj;
    }
    public Type getObj(){
        return obj;
    }
}
