package chapter04;

public class Java12_Object_Extends_2 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - Extends - 继承
         构造方法
         默认情况下，子类对象构建时，会默认调用父类的构造方法完成父类对象的创建，使用的是
         super 的方式，只不过JVM 自动完成
         如果父类提供构造方法，那么 JVM 不会提供默认的构造方法，那么子类显示调用 super()方法构建父类对象
         */
        Child2 c1 = new Child2();
        Child2 c2 = new Child2();
        Child2 c3 = new Child2();
        //父类对象也执行了三次；由此得出父类对象在子类对象创建前完成

        /*
        TODO new：只会构建一个对象
         子类都会去调用父类完成初始化操作
         constructor：构建器；其实是对象构建完成后在内存中开辟了内存空间后，才会执行所谓的构造方法
         顺序：先有对象开辟内存空间 再去执行这个方法；所以构造方法的主要目的就是：完成内存空间属性的初始化操作
         所以从父类继承过来的属性要提前给它初始化，这也就是为什么子类的构造方法都要去调用父类的构造方法的原因，就是给父类的初始化；==》结论：构造方法就是为了初始化
         */

    }
}
class Parent2 {
    String username;    //属性
    Parent2(String name) {  //构造方法也是方法 可以传参数 传参目的：给属性赋值
        username = name;
        System.out.println("parent：" + username);
    }

}
class Child2 extends Parent2 {
    //构造方法
    Child2() {
        super("Jam");
        System.out.println("child:" + username);
    }

}