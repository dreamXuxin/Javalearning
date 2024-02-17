package chapter04;

public class Java15_Object_1 {
    public static void main(String[] args) {
        /*
        TODO 面向对象 - 方法重写
         函数头一样，函数体不一样是重写
         重载是参数个数，顺序，类型不一样是重载 区分一下
         */
        CCC ccc = new CCC();
        System.out.println(ccc.sum());

    }
}
class CCC {
    int i = 10;
    int sum() {
        return i + 10;
    }
}
class DDD extends CCC {
    int i = 20;
    int sum() {
        return i + 20;  //返回值类型相同，方法名相同，参数类表相同，函数体不同
    }
}