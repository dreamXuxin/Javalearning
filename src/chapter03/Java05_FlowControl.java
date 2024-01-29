package chapter03;

public class Java05_FlowControl {
    public static void main(String[] args) {
        /*
        TODO 流程控制 - 重复执行 也叫循环执行
         Java 中主要用于循环的语法有 3 个：
          1. while：有条件循环
          2. do...while
          3. for
         */
        //TODO 1.while
        // while (条件表达式) {需要循环的代码}
        int age = 40;
        while (age < 40) {
            System.out.println("循环的代码");
            age++;
            System.out.println(age);
        }

        //TODO 2.do...while
        /*
        do {循环的代码}while (条件表达式)
        与 while 差异：先执行代码一次 再去判断
         */
        int i = 20;
        do {
            System.out.println("循环一次");
        }while (i > 20);

        /*
        TODO for 循环 最常见的用的最多的循环写法
         结构： for (初始化表达式; 条件表达式; 更新表达式) {循环的代码}
         1)初始化表达式用于对条件表达式中使用到的变量进行初始化
         2)循环代码执行后，会重新进行表达式的判断，如果为true 会重新执行循环代码
         */
        System.out.println("----for循环------");
//        int a = 20;
        for (int a = 20;a < 40;a++) {
            System.out.println("for循环代码");
            System.out.println("a="+a);
        }
    }

}
