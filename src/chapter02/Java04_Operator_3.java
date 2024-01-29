package chapter02;

public class Java04_Operator_3 {
    public static void main(String[] args) {

        /*
        TODO 运算符 -- 逻辑运算符
         所谓逻辑运算符其实就是用于描述多个条件表达式之间的关系的运算符
        TODO 基本的语法结构
         变量 = （条件表达式 1） 逻辑运算符 （条件表达式 2）
         结果的变量的类型依然是布尔类型
         */
        /*
        TODO 逻辑运算符：& 与
          与运算：只要有一个为 false 则结果为 false；只有全部为 true 最终结果才是 true
         */
        /*
        TODO 逻辑运算符：｜ 或
          或运算：只要有一个为 true 最终为 true，只有全部为 false 最终为 false
         */
        /*
        TODO 逻辑运算符：&& 短路与运算
         短路与运算：会根据第一个条件表达式的结果来判断，是否执行第二个条件表达式
         如果第一个表达式为 false 那么无需执行第二个表达式
         如果第一个表达式为 true  那么继续执行第二个
         */
        int i = 10;
        int j = 20;
        boolean result = (i < 20) && (++j > 30);
        System.out.println(result); //只要有一个 false 则为 false
        System.out.println(j);  //j=21 能走到第二个表达式 第一个为 true 情况

        /*
        TODO 逻辑运算符：|| 短路或运算

         */
        int a = 10;
        int b = 20;
        boolean result1 = (a == 10) || (++b > 30);
        System.out.println(result1); //只要有一个为 true 则为 true
        System.out.println(b);  //前面为 true 情况 走不到后面 b=20

        /*
        TODO 逻辑运算符：! 逻辑非运算 相反
         */

    }
}
