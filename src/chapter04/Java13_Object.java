package chapter04;

public class Java13_Object {
    public static void main(String[] args) {
        /*
        TODO 面向对象 -- 多态
         所谓多态就是一个对象在不同场景下表现出来的不同状态和形态
          多态语法其实就是对对象的使用场景进行了约束
           以父类声明创建的子类对象只能使用父类中的方法
         */
        Person p = new Person();
        p.testPerson();
        Person p1 = new Boy();
        p1.testPerson();
        //p1.testBoy();   //以父类声明的子类对象只能使用父类中的方法
        Person p2 = new Girl();
        p2.testPerson();

        Boy boy = new Boy();
        boy.testBoy();
    }
}
class Person {
    void testPerson() {
        System.out.println("test person");
    }
}
class Boy extends Person {
    void testBoy() {
        System.out.println("test boy");
    }
}
class Girl extends Person {
    void testGril() {
        System.out.println("test gril");
    }
}