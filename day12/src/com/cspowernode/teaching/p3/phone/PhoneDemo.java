package com.cspowernode.teaching.p3.phone;

import com.sun.deploy.ref.AppModel;

/**
 * @Author 汪洋
 * @Date 2023/3/18 14:22
 * @Description
 * 案例：定义一个手机的继承体系类，每个手机类里面提供一个use方法，代表使用这个手机，然后再创建一个手机
 * 销售员的类，该类用来售卖不同的手机
 * 方案1：在销售员的类中，为每个手机都单独创建一个销售的方法；--->命名污染，方法过多
 * 方案2：在销售员的类中，把原来的方法的返回类型先统一为父类；--->方便处理，类型统一，命名仍然污染
 * 方案3：只保留一个方法，返回类型使用父类，参数列表上面要根据不同的字符串来返回不同的
 * 子类对象；--->此时我们仍然需要保证你输入的名字不能有误，否则会报空指针
 * 方案4：额外增加一个Const类，在该里面定义我们要使用到的常量，修改手机销售类中的销售方法，使用
 * 常量来判断；
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //方案1
        /*PhoneSeller seller = new PhoneSeller();
        HuaWeiPhone huaWeiPhone = seller.sellHuaWei();
        XiaoMiPhone xiaoMiPhone = seller.sellXiaoMi();
        ApplePhone applePhone = seller.sellApple();*/
        //方案2
        /*PhoneSeller seller = new PhoneSeller();
        Phone huaWeiPhone = seller.sellHuaWei();
        Phone xiaoMiPhone = seller.sellXiaoMi();
        Phone applePhone = seller.sellApple();*/
        //方案3
        /*PhoneSeller seller = new PhoneSeller();
        Phone xiaomi = seller.sellPhone("xiaomi");
        xiaomi.use();
        Phone huawei = seller.sellPhone("huawei");
        huawei.use();
        Phone apple = seller.sellPhone("iphone");
        apple.use();*/
        //方案4
        PhoneSeller seller = new PhoneSeller();
        Phone xiaomi = seller.sellPhone(Const.XIAOMI_PHONE);
        xiaomi.use();
        Phone huawei = seller.sellPhone(Const.HUAWEI_PHONE);
        huawei.use();
        Phone apple = seller.sellPhone(Const.APPLE_PHONE);
        apple.use();
    }
}
class PhoneSeller{
    public Phone sellPhone(int phoneType){
        if(Const.HUAWEI_PHONE==phoneType){
            return new HuaWeiPhone();
        }else if(Const.XIAOMI_PHONE==phoneType){
            return new XiaoMiPhone();
        }else if(Const.APPLE_PHONE==phoneType){
            return new ApplePhone();
        }
        return null;
    }
}
class PhoneSeller3{
    public Phone sellPhone(String phoneType){
        if("huawei".equals(phoneType)){
            return new HuaWeiPhone();
        }else if("xiaomi".equals(phoneType)){
            return new XiaoMiPhone();
        }else if("iphone".equals(phoneType)){
            return new ApplePhone();
        }
        return null;
    }
}
class PhoneSeller2{
    public Phone sellHuaWei(){
        return new HuaWeiPhone();
    }
    public Phone sellXiaoMi(){
        return new XiaoMiPhone();
    }
    public Phone sellApple(){
        return new ApplePhone();
    }
}
class PhoneSeller1{
    public HuaWeiPhone sellHuaWei(){
        return new HuaWeiPhone();
    }
    public XiaoMiPhone sellXiaoMi(){
        return new XiaoMiPhone();
    }
    public ApplePhone sellApple(){
        return new ApplePhone();
    }
}
class Phone{
    public void use(){
    }
}
class XiaoMiPhone extends Phone {
    public void use(){
        System.out.println("小米手机一年一换");
    }
}
class HuaWeiPhone extends Phone {
    public void use(){
        System.out.println("华为手机很好用，就是太贵");
    }
}
class ApplePhone extends Phone {
    public void use(){
        System.out.println("苹果手机拍照非常棒");
    }
}
