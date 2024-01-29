package chapter03;

public class Java02_FlowControl {
    public static void main(String[] args) {
        /*
        TODO 流程控制 -- 分支结构
         */
        //TODO 1.可选分支 也叫单分支结构

        System.out.println("第一步");
        System.out.println("第二步");
        //判断：条件表达式结果是否为 true，是则执行分支逻辑；false 则继续执行
        //判断的语法使用 if 关键字;如果为 true 分支逻辑在后续的大括号里执行
        int i = 10;
        if (i == 10){
            System.out.println("分支");
        }
        System.out.println("第三步");

        //TODO 2.必选分支：双分支结构（二选一）
        System.out.println("一");
        System.out.println("二");
        int a = 10;
        if (a == 10){
            System.out.println("分支 1");
        } else {
            System.out.println("分支 2");
        }
        System.out.println("三");

        //TODO 3.多分支 ：多重判断
        //if ...else if ...else
        System.out.println("--------");
        int e = 30;
        if (e == 20){
            System.out.println("分支23");
        } else if (e == 10) {
            System.out.println("分支33");
        }else {
            System.out.println("分支44");
        }
        System.out.println("分支55");
    }
}
