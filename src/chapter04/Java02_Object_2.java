package chapter04;

public class Java02_Object_2 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 --例子 3
         类：老师 学生
         属性特征：姓名
         行为：老师-讲课；学生-听课
         */
        System.out.println("创建第一个对象--老师");
        Teacher t = new Teacher();
        t.name = "zhangsan";    //赋指定对象的值
        t.teach();

        System.out.println("创建第二个对象--学生");
        Student s = new Student();
        s.name = " lisi";
        s.study();
    }
}
class Teacher {
    String name;
    void teach() {
        System.out.println(name + "老师在讲课");
    }

}
class Student {
    String name;
    void study() {
        System.out.println(name + "在听课");
    }
}