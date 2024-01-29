package chapter04;

public class Java14_Object_1 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 方法重载 - 测试 1
         */
        User141 user1 = new User141();
        User141 user2 = new User141("Jam");
        User141 user3 = new User141("Tom","man");
    }
}
class User141 {
    //构造方法
    User141() {

    }
    User141(String name) {

    }
    User141(String name,String sex) {

    }
}
