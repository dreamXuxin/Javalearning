package chapter04;

public class Java02_Object {
    public static void main(String[] args) {
        /*
        TODO 面向对象 --例子 1
          类：动物
          对象：动物 a1;动物 a2
            所属种类：猫，狗
            姓名：
            颜色
            ...
          行为：

         */
        System.out.println("---第一个对象---");
        Animal a1 = new Animal();   //先创建一个新的动物的对象，a1 来引用这个对象
        a1.type = "猫";
        a1.name = "小黑";
        a1.run();

        System.out.println("---第二个对象---");
        Animal a2 = new Animal();
        a2.type = "狗";
        a2.name = "大黄";
        a2.run();
    }
}
class Animal {
    String type;
    String name;

    void run() {
        System.out.println(type + " "+name +"跑开了");
    }

}