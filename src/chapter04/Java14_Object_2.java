package chapter04;

public class Java14_Object_2 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 -- 基础数据类型
         如果byte b 方法被注，调用下列 test 方法时会自动转化比它更高一点的数据类型，显示 short
          byte:8位 1个字节
          short：16位 2字节
          int:32位 4字节
          char:16位 2字节  与 byte 无法转换 byte 存在负数
          long:64位 8字节
         */
        byte b = 10;
        test(b); //bbb  注销掉 byte 是 short；注销掉 short 就是 int

    }
//    static void test(byte b) {
//        System.out.println("bbb");
//    }
    static void test(short s) {
        System.out.println("sss");
    }
    static void test(char c) {
        System.out.println("ccc");
    }
    static void test(int i) {
        System.out.println("iii");
    }
}
