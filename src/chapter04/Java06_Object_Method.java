package chapter04;

public class Java06_Object_Method {
    public static void main(String[] args) {

        /*
        TODO 面向对象 -- 方法 method
            声明的语法：void 方法名称(){ 逻辑代码 }       方法名称遵循标识符规则
            这里的 void 表示方法的结果；英文中表示空 本身表示该方法无返回值
            ***可以在声明的时候用【方法的返回值类型】 boolean 类型或者其他类型 如果没有类型就用 void
        TODO
            方法的调用方式：对象.方法名()

        TODO
            场景：使用用户账号和密码进行登录
            名词：用户，账户，密码；
                其中用户是独立性的名词 可以抽取为类
                账户和密码不是独立的 可以作为用户的属性
            动词：注册、登录
            方法内部的结果对外部是有影响的

            必须注册成功后才可以登录，所以注册的方法必须要有结果，就不能用 void 了

         */
        User user1 = new User(); //实例化一个对象 user1
        boolean registerResult = user1.register();  //user1.register().var 用一个变量去接收执行结果
        // 用 if 语句去判断一下，==true 可以简化不写
        if (registerResult) {
            System.out.println("注册成功");
            boolean loginResult = user1.login();
            if (loginResult) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
        } else {
            System.out.println("注册失败");
        }

    }
}
class User {
    String account; //不赋值 因为用户的账户密码都不一样 使用 Java 虚拟机的默认初始化
    String password;

    boolean register() {
        System.out.println("用户注册");
        //返回结果
        return true;   //外部要用使用 return 关键字传递
    }

    boolean login() {
        System.out.println("用户登录");
        return false;
    }
}