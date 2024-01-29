package chapter04;

public class Java12_Object_Extends {
    public static void main(String[] args) {

        /*
        TODO 面向对象 -extends -继承
         面向对象编程中有 3 个非常重要的特征：继承，封装，多态
         */
        /*
        TODO 继承
         类存在父子关系，子类可以直接获取到父类的成员属性和成员方法
          类的继承只能是单继承；一个类只能有一个父类，不存在多个父类
           一个父类可以有多个子类 相当于树：一个父类下面可能有子类 1；子类 2；子类 3...
         */
        /*
        TODO 继承语法：extends关键字
         子类 extends 父类
         */
        Child c = new Child();
        System.out.println(c.name);
        c.test();
    }
}
class Parent {
    String name = "Jam";
    void test() {
        System.out.println("test");
    }
}
class Child extends Parent{

}