package chapter03;

public class Java06_FlowControl_Test {
    public static void main(String[] args) {
        /*
        TODO 流程控制-九层塔练习
        *
       ***
      *****
     *******
    .........
         */
        //打印第一层
//        for (int i = 0;i < 1;i++) {
//            System.out.print("*");
//        }
//        System.out.println("");     //换行
//        //打印第二层
//        //println 方法打印字符串之后，会自动添加换行符
//        //print 方法打印字符串后 不会换行
//        for (int i = 0;i < 3;i++) {
//            System.out.print("*");
//        }
//        System.out.println("");
//        //打印第三层
//        for (int i = 0;i < 5;i++) {
//            System.out.print("*");
//        }
//        System.out.println("");

        //TODO 前面是笨的方法
        /*
        一层：i=1
        二层：i=3
        三层：i=5
        ...
        j层数与 i的关系：2j+1 j是从 0 开始算第一层的 0-8
         */
        int level = 19;
        for (int j = 0;j < level;j++) {//九层妖塔 循环九遍，j是控制次数
            for (int i = 0;i < (level-1)-j;i++) {
                System.out.print(" ");
            }
            for (int i = 0;i < 2*j+1;i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
        打印空格问题：塔总高 4 层的话
        4 -》 0 -》3个空格
        4 -》 1 -》2个空格
        4 -》 2 -》1个空格
        4层只要打印前 3 层，9层只要打印前 8 层
         */
    }
}
