package chapter04;

public class Java07_Object_Method_Param_1 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 -- 方法 -参数_1
         Java 中方法参数的传递为值传递
          1.基本数据类型：传的就是数值
          2.引用数据类型：传的引用地址
         */
//        int i = 10;
//        String s = "abc";
//        test(s);    //调用 test
//        System.out.println(s);
        User3 user = new User3();
        user.name = "zhangsan";
        test(user);
        System.out.println(user.name);  //值为 lisi 属性的重新赋值；之前是abc10是产生新的字符串
    }

    //声明一个 test方法
//    public static void test(int i) {
//        i = i + 10; //i为 20 执行完后弹栈
//    }

    public static void test(User3 user) {
        user.name = "lisi";
    }
}
class User3 {
    String name;
}