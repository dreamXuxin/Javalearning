package chapter03;

public class Java05_FlowControl_1 {
    public static void main(String[] args) {
        /*
        TODO 流程控制--重复执行
         break:跳出整个循环 不再继续
         continue:跳过本次符合条件的循环

         */
//        for (int i = 0;i < 10;i++) {
//            System.out.println(i);
//        }
        for (int i = 0;i < 10;i++){
            if (i == 4) {
                //break;
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
