package test2;

/**
 * 第三题
 * 用if语句获取三个数的最大值。
 */
public class Test3 {
    public static void main(String[] args) {
        int a = 34;
        int b = 6;
        int c = 9;
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (a < b) {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
