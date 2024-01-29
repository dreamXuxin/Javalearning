package chapter04;

public class Java12_Object_Extends_1 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 -extends -继承
         如果父类和子类有相同的属性，那么可以采用特殊的关键字进行区分
          super 和 this 来区分
            1.super：上一级
            2.this：当前
         */
        Child1 c = new Child1();
//        System.out.println(c.name);
        c.test();
    }
}
class Parent1 {
    String name = "Jam";
}
class Child1 extends Parent1 {
    String name = "Wind";
    void test() {
        System.out.println(super.name);
        System.out.println(this.name);  //this 是默认调用的
    }

}