package chapter04;

public class Java01_Object {
    public static void main(String[] args) {
        /*
        TODO 面向对象
         所谓面向对象，就是分析问题时，以问题所涉及到的事或物为中心的分析方式
          类和对象
            *类表示归纳和整理
            *对象标识具体的事物
         */
        /*
        TODO 类：class
         基本语法结构：
          class 类名 {
            特征（属性）
            功能（方法）
          }
           *这里的类名与变量名的标识符类似，规范：首字母大写

           创建对象的语法：
           new 类名();
         */

        /*
        举例：做一道菜，红烧排骨
        类：菜   对象：红烧排骨
        TODO 1.先声明类
             2.创建类名
             3.声明属性，所谓的属性就是类中的变量
                变量类型 变量名称 = 变量值
                属性类型 属性名称 = 属性值
             4.声明方法
                void 方法名(参数) {功能代码}
             5.执行方法
                对象.方法名()）
         */
        //创建一个对象，用一个变量来引用它
        Cooking c = new Cooking();  //引用数据类型
        System.out.println("---开始创建第一道菜----");
        c.name = "红烧排骨";
        c.food = "排骨";
        c.execute();

        //创建另一道菜,实例化另一个对象
        System.out.println("---开始创建另一道菜---");
        Cooking c1 = new Cooking();
        c1.name = "红烧鱼";
        c1.food = "草鱼";
        c1.execute();



    }
}

class Cooking {
    //特征属性
    //名字
    String name; //每道菜名字不一样 先声明 不赋值 特性
    //菜的类型
    String type = "红烧"; //可以归纳的共性
    //食材
    String food;
    //佐料
    String relish = "花椒";

    //todo 执行
    void execute() {
        System.out.println("准备食材:"+food);
        System.out.println("准备佐料:"+relish);
        System.out.println("开始烹饪");
        System.out.println(name + "烹饪结束");
    }
}