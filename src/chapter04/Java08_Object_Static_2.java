package chapter04;

public class Java08_Object_Static_2 {
    public static void main(String[] args) {

        // TODO 面向对象 - 静态
        // 类的信息被加载初始化完成后会自动执行静态代码块，可以完成静态属性的初始化功能
//        System.out.println("---方法---");
//        User08.test();  //也会执行静态代码快
        System.out.println("---创建对象---");
        new User08();   //也会自动执行静态代码快，但是如果之前执行过就不会执行了
        System.out.println(Bird.type);  //静态相当于全局 相同 package 下面都能调用
    }
}
class User08 {
    static {
        //TODO 静态代码快
        System.out.println("静态代码快执行1");
    }
    static void test() {
        System.out.println("test...");
    }
    static {
        System.out.println("静态代码块执行2");
    }
    static {
        System.out.println("静态代码块执行3");
    }

    {
        System.out.println("非静态，需要创建成员");   //只有创建对象才能访问非静态
    }
}