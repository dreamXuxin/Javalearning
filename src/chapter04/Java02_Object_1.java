package chapter04;

public class Java02_Object_1 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 --例子 2
          类：都是狗
           对象：两只 一只小黑 一只小白
           行为：都对我说你好

         */
        System.out.println("---创建第一个对象 d1---");
        Dog d1 = new Dog();
        d1.color = "black";
        d1.name = "小黑";     //赋属性
        d1.SayHello();      //第一个对象的行为
        System.out.println("---创建第二个对象 d2---");
        Dog d2 = new Dog();
        d2.color = "white";
        d2.name = "小白";
        d2.SayHello();
    }
}
class Dog {
    String color;
    String name;
    void SayHello() {
        System.out.println(color + "的" + name + "对我说，你好");  //共用的行为
    }
}