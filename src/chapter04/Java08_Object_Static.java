package chapter04;

public class Java08_Object_Static {
    public static void main(String[] args) {

        /*
        TODO 面向对象
         针对于具体对象的属性称之为对象属性，或者成员属性，或者实例属性
         针对于具体对象的方法称之为对象方法，或者成员方法，或者实例方法
          静态：和对象无关，只和类相关的称之为静态 (比如鸟这个类，飞这个行为只和鸟这个类有关，和具体的成员无关，因为是鸟因该都会飞)
          和类相关的属性称之为静态属性
          和类相关的方法称之为静态方法
          静态语法就是在属性和方法前增加 static 关键字
         */
        Chinese c = new Chinese();
        c.name = "zhangsan";
        System.out.println("Hello" + c.name);

        System.out.println("----静态通过类访问-----");
        Bird.fly();     //既然静态与成员无关，只与类有关 那么就通过类去访问 通过类名调用
        System.out.println(Bird.type);

    }
}
class Bird {
    static String type = "鸟";
    static void fly() {
        System.out.println("飞飞飞");
    }
}
class Chinese {
    String name;
}