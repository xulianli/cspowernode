package com.cspowernode.teaching.p4;


import java.time.LocalDateTime;

/**
 * @Author 汪洋
 * @Date 2023/3/25 16:56
 * @Description
 * 案例：构建一个日志类，该类描述了错误的造成人、发生时间、错误代码、错误描述
 * a.不使用枚举，就单独构建类的形式来书写
 * b.使用枚举，把一些属性单独提取出来形成一个枚举类，然后把一些具体的数据固定在枚举类中，不需要别人额外再去传输数据来构建对象
 */
public class EnumDemo5 {
    public static void main(String[] args) {
        Log1 netError = new Log1("张三",LocalDateTime.now(),404,"网页打不开");
        Log1 memoryError = new Log1("李四",LocalDateTime.of(2023,3,25,19,24,58),
                500,"内存崩溃");
        System.out.println(netError);
        System.out.println(memoryError);
        //使用枚举的日志类
        Log2 log1 = new Log2("zhangsan",LocalDateTime.now(), Log2.ErrorState.MEMORY_ERROR);
        Log2 log2 = new Log2("lisi",LocalDateTime.now(), Log2.ErrorState.NETWORK_ERROR);
        System.out.println(log1);
    }
}
//使用枚举来封装一部分固定好的数据
class Log2{
    private String name;
    private LocalDateTime LocalDateTime;
    private ErrorState errorState;

    public Log2(String name, java.time.LocalDateTime localDateTime, ErrorState errorState) {
        this.name = name;
        LocalDateTime = localDateTime;
        this.errorState = errorState;
    }

    @Override
    public String toString() {
        return "Log2{" +
                "name='" + name + '\'' +
                ", LocalDateTime=" + LocalDateTime +
                ", errorState=" + errorState +
                '}';
    }

    enum ErrorState{
        NETWORK_ERROR(404,"网络错误"),
        MEMORY_ERROR(300,"内存错误"),
        SERVER_ERROR(500,"服务器错误"),
        ;
        private int errorCode;
        private String errorMessage;

        ErrorState(int errorCode, String errorMessage) {
            this.errorCode = errorCode;
            this.errorMessage = errorMessage;
        }
        public int errorCode() {
            return errorCode;
        }
        public String errorMessage() {
            return errorMessage;
        }
        @Override
        public String toString() {
            return "{" +
                    "errorCode:" + errorCode +
                    ", errorMessage:'" + errorMessage + '\'' +
                    '}';
        }
    }
}
class Log1{
    private String name;
    private LocalDateTime LocalDateTime;
    private int errorCode;
    private String errorMessage;

    public Log1(String name, java.time.LocalDateTime localDateTime, int errorCode, String errorMessage) {
        this.name = name;
        LocalDateTime = localDateTime;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.time.LocalDateTime getLocalDateTime() {
        return LocalDateTime;
    }

    public void setLocalDateTime(java.time.LocalDateTime localDateTime) {
        LocalDateTime = localDateTime;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Log1{" +
                "name='" + name + '\'' +
                ", LocalDateTime=" + LocalDateTime +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}