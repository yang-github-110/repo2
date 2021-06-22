package test;

//第一题:
//  观察下列代码,找出其中的错误,并加以改正
public class Test01 {
    public static void main(String[] args) {
        byte b;
//		   System.out.println("b=" + b);//变量b未赋值,不能直接使用
        b = 3;
//        b = b + 4;        //这里b是byte类型,4默认是int类型,两者相加,结果为int类型,
// 将int类型的结果赋值给byte类型的变量b,就会出错（只有+=这样的复合运算符才会出现隐形的强制转换）
        System.out.println("b=" + b);
    }
}



