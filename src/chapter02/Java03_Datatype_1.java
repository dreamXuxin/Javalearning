package chapter02;

public class Java03_Datatype_1 {
    public static void main(String[] args) {
        /*
        TODO 基本数据类型
        todo 1.整数类型
        byte    8
        short   16
        int     32
        long    64
         */
        byte b = 10;
        short s = 10;
        int i = 10;
        long lon = 10;
        /*
        todo 2.浮点类型 含有小数点的数据类型
        根据计算精度划分
        float:单精度浮点类型
        double:双精度浮点类型
        tips:默认情况下，小数点的数据会被识别为精度较高的双精度double 类型
        float：单精度浮点类型需要后面加F 或者 f 来结尾
         */
        float f = 1.0f;
        double d = 2.0;
        /*
        todo 3.字符类型
        字符类型就是用符号标识文本内容
        字符串就是一连串的字符组成
         */
        char c = 'h';   //必须单引号
        /*
        todo 4.布尔类型
        true or false
         */
        boolean bln = true;
    }
}
