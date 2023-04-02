package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/16 14:02
 * @Description
 */
public class UserDemo {
    public static void main(String[] args) {
        User user = new User(1001,"zhangsan","zhangsan@hotmail.com");
        User user1 = new User(1002,"lisi");
        System.out.println(user);
        System.out.println(user1);
    }
}
class User{
    int id;
    String username;
    String email;

    public User(){

    }
    public User(int id,String username,String email){
        this.id = id;
        this.username = username;
        this.email = email;
    }
    public User(int id,String username){
//        this.id = id;
//        this.username = username;
//        this.email = id+"@gameschool.com";
        this(id,username,id+"@gameschool.com");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
