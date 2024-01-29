package chapter04;

public class Java14_Object {
    public static void main(String[] args) {

        /*
        TODO 面向对象 -- 方法重载
         一个类中，不能重复声明相同的方法，也不能声明相同的属性
          这里的相同的方法指的是方法名，参数列表相同，与返回值类型无关
           如果方法名相同，但是参数列表（个数、顺序、类型）不相同，会认为是不同的方法，只不过名称一样
            这个操作在 Java 称之为方法的重载
             构造方法也存在方法的重载
         */
        User14 user = new User14();
        User14 user1= new User14("zhang");
        User14 user2= new User14(23);
        user.login(123);
        user.login("jam");
        user.login("jam","xu123");
    }
}
class User14 {
    //构造方法的重载
    User14(String name) {
        System.out.println("构造方法"+ name);
    }

    User14() {
        System.out.println("构造方法");
    }

    User14(int age) {
        System.out.println("构造方法"+ age );
    }


    //通过不同的参数列表来区分相同的方法名
    void login(String account,String password) {
        System.out.println("账号密码登录");
    }
    void login(int tel) {
        System.out.println("手机验证登录");
    }
    void login(String wx) {
        System.out.println("微信登录");
    }
}