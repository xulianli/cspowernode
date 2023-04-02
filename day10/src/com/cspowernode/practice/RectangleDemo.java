package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/16 15:14
 * @Description
 * 增加一个Rectangle类，该类也要有求面积、求周长、求点是否在图形内的方法，请
 * 思考该类应该要有哪些属性，注意，我们在判断点是否在该图形内的方法里，默认该类在第一象限内；
 */
public class RectangleDemo {
}

class Rectangle{
    Point p1;
    Point p2;
    double longSide;
    double wideSide;

    public Rectangle() {
    }

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        longSide=Math.max(p1.x,p2.x)-Math.min(p1.x,p2.x);
        wideSide=Math.max(p1.y,p2.y)-Math.min(p1.y,p2.y);
    }

    double getArea(){
        return longSide*wideSide;
    }

    double getPerimeter(){
        return (longSide+wideSide)*2;
    }

    boolean isInsideRec(Point p3){
        return (Math.min(p1.x,p2.x)<=p3.x && p3.x<=Math.max(p1.x,p2.x))&&(Math.min(p1.y,p2.y)<=p3.y && p3.y<=Math.max(p1.y,p2.y))? true:false;
    }
}
