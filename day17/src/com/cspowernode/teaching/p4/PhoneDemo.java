package com.cspowernode.teaching.p4;

/**
 * @Author 汪洋
 * @Date 2023/3/25 16:46
 * @Description
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone xiaomiPhone = Phone.XIAOMI_PHONE_13;
        Phone applePhone = Phone.APPLE_PHONE_14PRO;
        System.out.println(xiaomiPhone.getBrand());
    }
    enum Phone{
        HUAWEI_PHONE_META("华为","麒麟9000",12,6.4,128,6999),
        HUAWEI_PHONE_P60("华为","骁龙8+gen2",8,6.1,256,4999),
        XIAOMI_PHONE_13("小米","骁龙8+gen1",8,6.3,128,3999),
        HUAWEI_PHONE_13PRO("小米","骁龙8+gen2",12,6.4,256,4999),
        APPLE_PHONE_14("苹果","A13",6,5.9,128,5399),
        APPLE_PHONE_14PRO("苹果","A13",8,6.1,256,6999)
        ;
        private String brand;
        private String cpu;
        private int memory;
        private double screenSize;
        private int storage;
        private double price;

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public double getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(double screenSize) {
            this.screenSize = screenSize;
        }

        public int getStorage() {
            return storage;
        }

        public void setStorage(int storage) {
            this.storage = storage;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        Phone(String brand, String cpu, int memory, double screenSize, int storage, double price) {
            this.brand = brand;
            this.cpu = cpu;
            this.memory = memory;
            this.screenSize = screenSize;
            this.storage = storage;
            this.price = price;
        }
    }
}

