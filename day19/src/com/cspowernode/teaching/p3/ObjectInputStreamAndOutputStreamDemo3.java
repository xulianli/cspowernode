package com.cspowernode.teaching.p3;

import java.io.*;

/**
 * @Author 汪洋
 * @Date 2023/3/28 16:46
 * @Description
 * 如果我们的对象里面拥有一些不想被保存的数据，我们该怎么办
 * a.把属性使用transient来修饰，这样被transient修饰的属性就不参与序列化了
 * b.让属性被static修饰，因为static修饰的属性不属于对象资源，所以也不参与序列化
 */
public class ObjectInputStreamAndOutputStreamDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.先完成序列化操作
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        User user = new User(101,"root","root123","admin");
        out.writeObject(user);
        out.close();
        //2.反序列化操作
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
        User other = (User) in.readObject();
        System.out.println(other);
        in.close();
    }
}
class User implements Serializable{
    private static final long serialVersionUID = -6192110185857321643L;
    int uid;
    String username;
    //瞬态：transient
    transient String password;
    //静态也不参与序列化
    static String power;

    public User(int uid, String username, String password,String power) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.power = power;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
