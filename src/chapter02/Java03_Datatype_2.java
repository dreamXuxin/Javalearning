package chapter02;

public class Java03_Datatype_2 {
    public static void main(String[] args) {
        /*
        TODO 基本数据类型-数据类型的转换
         */
        String name = "lisi";
        int age = 30;

        //byte > short > int > long > float > double
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        float f = lon;
        double d = f;   //范围小的数据可以转换为大的数据，大的数据无法转换为大的数据

        int i1 = (int)d;  //如果想要强制将范围大的数据转换为小的，可以使用(int)强制转换，会导致溢出损失精度






    }
}
