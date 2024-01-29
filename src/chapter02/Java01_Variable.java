package chapter02;

public class Java01_Variable {
    public static void main(String[] args) {
        //TODO 变量
        //所谓变量 其实就是可以改变的向量存储
        //1.变量的声明
        String name;    //数据类型 数据名称
        //2.变量的赋值
        name = "xuxin"; //变量名称=数据
        //®3.变量的使用
        System.out.println(name);   //直接访问变量名称

        //TODO 可以简化，直接将声明和赋值放在一行代码中完成
        String username = "zhangsan";
        System.out.println(username);

        //TODO 在使用变量之前 必须给变量赋值 这个操作叫做变量的初始化
        String usr;
        usr = "xxx";
        System.out.println(usr);
    }
}
