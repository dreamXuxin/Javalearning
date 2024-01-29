package chapter04;

public class Java05_Object_Field {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 属性
         所谓属性 其实就是类的对象的相同的特征
         语法和变量的声明很像
         属性类型 属性名称 = 属性值
         String name = "张三"
         如果再声明属性的同时进行了初始化赋值，那么所有对象的属性就完全相同
         如果希望每个对象的属性不一致，可以不给它赋值，只是声明初始化一下
         属性会在构造对象的时候默认初始化，而默认初始化的值取决于属性的类型
            整型：byte,short,int,long =>0
            浮点型：float,double =>0.0
            布尔类型：boolean,flag =>false
            char类型：空字符
            引用数据类型：null

        TODO    属性和变量的区别
            变量的作用域只在大括号内起作用
            属性不仅仅在当前类中有效 而且可以随着对象在其他地方使用
            变量在使用前 必须初始化；属性可以不用初始化，因为 JVM 可以自动帮我们初始化
         */

    }
}
