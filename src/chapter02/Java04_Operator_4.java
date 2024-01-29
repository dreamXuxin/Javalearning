package chapter02;

public class Java04_Operator_4 {
    public static void main(String[] args) {
        /*
        TODO 运算符 -- 三元运算符
         所谓三元运算符其实是三个元素参与运算的运算符
         基本语法结构： 变量 = （条件表达式）?（任意表达式 1）：（任意表达式 2）
          如果条件表达式为 true 执行问号后面的表达式1，如果为 false 执行冒号后面的表达式 2

         */
        int i = 10;
        int j = 20;
        int k = (i == 10)?1+1:2+2;
        System.out.println(k);  //结果为 2

        int a = 10;
        int b = 20;
        int c = (i == 20)?1+1:2+2;
        System.out.println(c); //结果为 4

    }
}
