package chapter04;

public class Java11_Object_Instance {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 构建对象
         构造方法：专门用于构建对象
         如果一个类中没有任何的构造方法，那么 JVM 中会自动添加一个公共的，无参的构造方法，方便对象的调用

         */
        /*
        TODO   基本语法：类名(){}
         1.构造方法也是方法，但是没有 void 关键字，不需要返回什么结果
         2.方法名和类名完全相同
         3.如果类中没有构造方法，那么 JVM 中会提供默认的构造方法
         4.如果类中有构造方法，那么 JVM 中不会提供默认的构造方法
         5.构造方法也是方法，所以也可以传递参数，但是一般都是传递参数的目的是用于对象属性的赋值
         6.代码块，实在构造对象之前执行的
         */
        User11 user = new User11("jam");     //在 new 的时候调用了构造方法
        System.out.println(user.username);
    }

}
class User11 {
    String username;
    {
        System.out.println("111");      //代码块在创建新对象之前就执行了
    }

    User11(String name) {
        username = name;
        System.out.println("my name is "+ name);
    }
    {
        System.out.println("222");
    }
    {
        System.out.println("333");
    }

}