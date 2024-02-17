package chapter04;

public class Java15_Object {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 方法重写
        如果父类和子类都有相同属性的话，区分用 this 和 super
         方法的重写：父类对象的方法其实主要体现共通性，无法在特殊的场合下使用
         如果子类对象需要在特殊的场合下使用，那么需要重写方法的逻辑，这个操作在 java 中称之为方法的重写
         这里的重写，并不意味着父类的方法被覆盖掉，只是在当前场合下不使用。如果使用 super 关键字还是可以访问
         方法的重写要求，子类的方法和父类的方法，方法名相同，返回值类型相同，参数列表要相同
         */
        Child15 child = new Child15();
        child.test();
    }
}
class Parent15 {
    String name = "jam";

    void test() {
        System.out.println("父类");
    }
}
class Child15 extends Parent15 {
    String name = "lili";

    void test() {
//        System.out.println(this.name);  //lili
//        System.out.println(super.name); //jam
        super.test();   //super代指父类
        //TODO 方法的重写 就是因为父类的方法具有共通性，所有子类都可以用，无法针对个别子类，这里要重写一下方法

        System.out.println("子类");
    }
}