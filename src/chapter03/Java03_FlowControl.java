package chapter03;

public class Java03_FlowControl {
    public static void main(String[] args) {
        /*
        TODO 流程控制 -分支：特殊的分支结构--等值分支判断：switch(){case1,case2}
         如果第一个满足 依次往下走 不管前面的满不满足
         如果一个分支都无法匹配，那么一个分支都不会执行
         如果想要无法匹配也需要执行分支，那么可以增加 default 关键字，相当于 else
         如果执行某一个分支后，不想要执行其他分支，那么可以使用 break 关键字，跳出分支结构
         */
        System.out.println("第一步");
        System.out.println("第二步");
        int i = 10;
        switch (i){
            case 10 :
                System.out.println("分支 1");
                break;
            case 20 :
                System.out.println("分支 2");
            case 30 :
                System.out.println("分支 3");
            default:
                System.out.println("分支 4");

        }
        System.out.println("第三步");
        /*
        当 i=10时，依次执行打印分支 1，2，,3
        当 i=20时，不打印分支 1，打印 2，3
         */
    }
}
