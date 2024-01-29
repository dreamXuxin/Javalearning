package chapter04;

import java.util.SplittableRandom;

public class Java08_Object_Static_1 {
    public static void main(String[] args) {

        /*
        TODO 面向对象 -- 静态 static
         明确：先有类 再有对象
            会导致只有有了对象，就能访问类能调用的所有静态属性 静态方法
            反之不行，在静态方法中无法访问成员方法，因为只是有了类 还没 new 出来对象，成员属性和方法必须要有对象才能访问

         */
        Test t = new Test();       //构造对象
        t.sex = "女";    //静态属性通过对象也能访问
        t.test();   //通过对象去访问方法
        t.test1();  //通过对象去访问静态方法，也可以，虽然一般通过类去访问静态;因为有对象的一定有类
        Test.test1();   //通过类去访问静态方法
    }
}
class Test {

    String name;    //成员属性
    static String sex;      //静态属性

    //成员方法，与对象相关
    void test() {
        test1();    //在成员方法中调用静态方法也可以，有对象必有类
        System.out.println(sex);    //访问静态性别
        System.out.println("test");
    }
    //静态方法，与类相关
    static void test1() {
        System.out.println("test1");
    }


}