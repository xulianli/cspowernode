package com.cspowernode.practice;

import java.util.Arrays;

/**
 * @Author 徐联理
 * @Date 2023/3/16 11:07
 * @Description
 */
public class UserAccountDemo {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("lianli","123456");
        User user3 = new User("lianli","123456","xll@gmail.com");
        System.out.println(user2);
        System.out.println(user3);
    }
}
class User{
    String userID;
    String password;
    String email;
    private String ending="@gameschool.com";

    User(){

    }

    public User(String ID, String password){
        userID=ID;
        this.password=password;
        email = userID+ending;

    }

    public User(String ID, String password, String email){
        userID=ID;
        this.password=password;
        this.email=email;
    }

    public String toString() {
        return "userID:"+userID+",Password:"+password+",Email:"+email;
    }
}
