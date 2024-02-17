package chapter04;

public class Java14_Object_3 {
    public static void main(String[] args) {
        /*
        TODO 面向对象
         多态其实就是约束了对象的使用场景
         AAA -> Object
         BBB -> AAA -> Object
         一步一步去找父类
         */
//        AAA aaa = new AAA();    //aaa
//        BBB aa = new BBB();    //bbb
        AAA aaa = new BBB();  //aaa - 多态
        test(aaa);
    }
    static void test(AAA aaa) {
        System.out.println("aaa");
    }
    static void test(BBB bbb) {
        System.out.println("bbb");
    }
}
class AAA {

}
class BBB extends AAA {

}