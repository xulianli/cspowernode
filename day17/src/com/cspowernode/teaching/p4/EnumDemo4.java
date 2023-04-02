package com.cspowernode.teaching.p4;


/**
 * @Author 汪洋
 * @Date 2023/3/25 16:00
 * @Description
 * 案例4：优化工厂设计模式
 * 练习：在该案例的基础上来修改PhoneType，在该枚举类中增加一个手机的参数，然后使用有参的构造函数配合枚举
 * 常量的形式来完成不同的名称得到不同参数的手机对象，可以创建其他的Phone类
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        Phone xiaomi = PhoneSeller.sellPhone(PhoneType.XIAOMI_PHONE);
        xiaomi.use();
        Phone huawei = PhoneSeller.sellPhone(PhoneType.HUAWEI_PHONE);
        huawei.use();
        Phone apple = PhoneSeller.sellPhone(PhoneType.APPLE_PHONE);
        apple.use();
    }
}
//增加一个手机类型的枚举类
enum PhoneType{
    HUAWEI_PHONE,XIAOMI_PHONE,APPLE_PHONE;
}
class PhoneSeller{
    public static Phone sellPhone(PhoneType phoneType){
        if(PhoneType.APPLE_PHONE==phoneType){
            return new ApplePhone();
        }else if (PhoneType.HUAWEI_PHONE==phoneType){
            return new HuaWeiPhone();
        }else if (PhoneType.XIAOMI_PHONE==phoneType){
            return new XiaoMiPhone();
        }
        return null;
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
