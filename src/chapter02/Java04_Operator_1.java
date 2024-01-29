package chapter02;

public class Java04_Operator_1 {
    public static void main(String[] args) {

        /*
        TODO 运算符 -- 赋值运算符：= += -= *= /=
         */
        /*
        TODO 复合运算符：+=
        元素进行运算后重新赋值给自己 可以将运算符和赋值进行简化
         */
        int i = 1;
//        i = i + 1;
        i += 1;     //这里相当于先加了1 再重新赋值给自己
        System.out.println(i);

        //TODO 如果使用了复合赋值运算符，那么数据的类型不会发生变化
        byte b1 = 10;
        //b1 = b1 + 20; 此处因为二元运算符的最小单位是 int 不符合，如果用复合运算符就没事 不会改变数据类型
        b1 += 20;
        System.out.println(b1);


    }
}
