package chapter04;

import java.util.ArrayList;
import java.util.Date;  //创建对象的时候会自动导入

public class Java10_Object_Import {
    public static void main(String[] args) {

        /*
        TODO 面向对象 - import
         当前：chapter04.Java10_Object_Import
         import 只能放在 package 后 class 前
         如果同一个包中需要导入大量的类，可以简化成类似：import java.util.* 通配符
         如果 import 的包有两个相同的类，那么在 new 的时候要指定用哪个包下面的
         */
        java.lang.String name = "jam";  //lang用的太多简化开发不要写 lang:language
        String name1 = "sam";   //只有 Java.lang这个包可以不要写 会自动给你补上，其他的都要写
        new chapter04.Java10_Object_Import();
        new Java10_Object_Import();
        Date d = new Date();
        new ArrayList<>();

    }
}
