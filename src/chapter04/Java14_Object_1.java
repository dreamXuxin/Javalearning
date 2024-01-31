package chapter04;

public class Java14_Object_1 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 方法重载 - 测试 1
         如果在一个构造方法中，想要调用其他的构造方法，那么需要使用特殊的关键字：this
         */
        User141 user1 = new User141();
//        User141 user2 = new User141("Jam");
//        User141 user3 = new User141("Tom","man");
    }
}
class User141 {
    //构造方法
    User141() {
        this("Jam");

    }
    User141(String name) {
        this("xx","man");

    }
    User141(String name,String sex) {
        System.out.println(name + "," + sex);
    }
}
