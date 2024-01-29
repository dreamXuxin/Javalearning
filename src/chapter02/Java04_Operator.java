package chapter02;

public class Java04_Operator {
    public static void main(String[] args) {
        // TODO 运算符
        /*
        定义：所谓运算符就是参与数据运算的符号，是 Java 自己定义的 无法自定义
        TODO 表达式
        定义：所谓表达式就是运算符和数据链接在一起形成符合 Java 语法规则的指令代码
        TODO 算数运算符
        1. 二元运算符：两个元素参与运算的运算符号
         */
        // 二元常见
        System.out.println(1+2);
        System.out.println(3-2);
        System.out.println(3*5);
        System.out.println(4/2);
        System.out.println(5%2);    //取余数，模运算1
        //但是 1/2在这边结果为 0，0.5是 double 类型
        System.out.println(1/2);
        //TODO 算数表达式 = 元素 1 二元运算符 元素 2
        //这个表达式的结果是 两个元素种类最大的一种，最小为 int 类型
        //这里 1 为 int 类型 2为 int 类型 所得结果自然也是 int 类型
        System.out.println(1.0/2); //1.0是 double 类型 自然结果是 0.5取最大的

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);  //强制转换为 byte 类型 因为最小是 int 类型
        System.out.println(b3);
        /*
        TODO 一元运算符 ++ --
        相当于合并了下列的二三行
         */


        //TODO 自增操作的顺序，放后面 i++ 先赋值再运算
        int i = 0;
//        int j = i;  //j=0
//        i = i + 1;  //i=1
        int j = i++;    //i自增
        System.out.println("i=" + i);
        System.out.println("j=" + j );


        //TODO 自增操作的顺序 放前面 ++i 先运算再赋值
        int i_1 = 0;
        int j_1 = ++i_1;
        System.out.println("i_1="+i_1);
        System.out.println("j_1="+j_1);

    }
}
