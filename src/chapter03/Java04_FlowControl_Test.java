package chapter03;

public class Java04_FlowControl_Test {
    public static void main(String[] args) {
        /*
        TODO 流程控制 -分支执行-小练习
        题目：
         0-6：儿童
         7-17：少年
         18-40：青年
         41-65：中年
         >66:老年
         */
        int age = 30;
//        if (age < 7){
//            System.out.println("儿童");
//        } else if (age >= 7 && age < 18) {  //最好用&&,用&的话要多执行一步后面
//            System.out.println("少年");
//        } else if (age >= 18 && age < 41) {
//            System.out.println("青年");
//        } else if (age >= 41 && age <66) {
//            System.out.println("中年");
//        } else {
//            System.out.println("老年");
//        }

        //TODO 优化一下
        if (age < 7){
            System.out.println("儿童");
        } else if (age < 18) {  //能走到第二步 肯定是不满足第一步就可以去掉前面的
            System.out.println("少年");
        } else if (age < 41) {
            System.out.println("青年");
        } else if (age <66) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
}
