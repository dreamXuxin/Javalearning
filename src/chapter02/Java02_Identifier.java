package chapter02;

public class Java02_Identifier {
    public static void main(String[] args) {
        //TODO 标识符 标识数据的符号称之为标识符
        //变量的名称就是标识符，例如 String name中的 name就是标识符
        //标识符主要用于起名

        //TODO 标识符命名规则
        //1.英文拉丁字母
        //2.符号
        //！@ # $ % ...中只有下划线_和$符号可以使用起名
        String _name = "lili";
        String $name = "kk";
        //3.数字
        //阿拉伯数字0-9可以作为标识符 但是不能作为开头 开头会被识别为数字
        //4.在当前代码的大括号内，标识符不能重复
//        String _name ="ll"; 提示作用域中重复
        //TODO java中标识符是区分大小写的 源码中区分 转换后两个不同
        //5.Java中预定了一些保留字，关键字 不推荐使用
        //6.小驼峰标识 规范 两个单词拼接时 第二个单词大写
        String userName;
        //7.标识符没有长度限制
    }
}
