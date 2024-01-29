package chapter04;

public class Java07_Object_Method_Param {
    public static void main(String[] args) {

        /*
        TODO 面向对象 -- 方法 -- 外部的影响内部
         使用外部数据控制方法内部实现的操作，使用的是参数语法实现，也叫方法参数
          语法：     方法名( 参数类型 参数名称)
          多个参数：  方法名(参数类型1 参数名称1,参数类型2 参数名称2 )---参数列表：小括号里面的多个参数的概念
         */
        User1 user1 = new User1();  //实例化一个 user1
        User1 user2 = new User1();
        User1 user3 = new User1();
        String name = "张三";
        int age = 23;
        //传递参数
//        user1.sayHello(name,age);   //需要从外部知道 hello 的名字
        //传递多个参数时，需要注意：
        //1.参数个数需要匹配
        //2.参数类型需要匹配
        //3.参数顺序需要匹配
        //4.当参数的个数不确定，但是类型相同时，可以采用特殊的参数语法声明；可变参数
        //可变参数的语法：参数类型...参数名称  --个数不确定 类型相同
        //如果参数中还包括其他类型的参数，可变参数放在最后

//        user2.test("as","sd");  //这里的 name 和 name1是 idea 自带的提示 非代码 直接打双引号自动出来
        user3.test_update();
        user3.test_update("zhangsan","lisi","wangwu");
    }
}
class User1 {
    void sayHello(String name,int age) {
        //使用参数
        System.out.println("hello" + name + "," + age);     //先内部声明参数，然后外部传一个内部就能使用了
    }

    void test(String name,String name1) {
        System.out.println(name+","+name1);
    }

    void test_update(String... name) {
        System.out.println(name);
    }
}