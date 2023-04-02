package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/4/1 16:44
 * @Description
 * 泛型的应用场合3--写在接口上
 * 1.泛型写在接口上的话，写法其实和类是一样的，但是它的子类却有2种写法
 *  a.子类也继续使用泛型-->ArrayList
 *      父类带泛型、子类也带泛型、使用子类对象的时候也可以用泛型,灵活性更大
 *  b.子类确定类型-->我们写的类去实现Comparable
 *      父类带泛型、子类不带泛型并且继承父类的时候就确定了父类泛型的类型、使用子类
 *      对象的时候已经不存在泛型了，针对性强
 * 2.两种场景的解释
 *  a.子类也用泛型(ArrayList):因为子类里面的元素类型追求的是灵活，要可以放任意
 *  类型，所以子类也继续使用泛型；
 *  b.子类不用泛型(Comparable的实现类):因为子类只需要完成针对类型的比较即可，不需要
 *  使用各种类型来当容器使用
 */
public class GenericsInterfaceDemo {
    public static void main(String[] args) {
        //使用了子类仍然带泛型的情况--->灵活
        Imp1<Integer> impl1 = new Imp1<>();
        Integer value1 = impl1.getValue(123);
        Imp1<String> impl2 = new Imp1<>();
        String value2 = impl2.getValue("123");
        //使用了子类已经确定泛型的情况--->针对性强，不能随便乱传
        Imp2 imp2 = new Imp2();
        String abc = imp2.getValue("abc");//只能传字符串
    }
}
//定义一个父接口，该接口声明了泛型
interface GenericsInterface<T>{
    T getValue(T value);
}
//定义一个子类也用泛型的imp1类
class Imp1<T> implements GenericsInterface<T>{
    @Override
    public T getValue(T value) {
        return value;
    }
}
//定义一个子类确定类型的imp2类
class Imp2 implements GenericsInterface<String>{
    @Override
    public String getValue(String value) {
        return value+"呵呵";
    }
}
