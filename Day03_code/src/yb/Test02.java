package yb;

public class Test02 {
    public static void main(String[] args) {
        int x = 2;
     //   double x = 3.14;//同一个大括号类，变量名重名
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
     //   y = x;//y没有被定义
        System.out.println("x is " + x);
    }
}
