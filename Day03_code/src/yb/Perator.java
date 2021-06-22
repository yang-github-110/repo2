package yb;
//三个数字比较
public class Perator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a > b ? a : b;
        System.out.println(c);

        int d = 30;
        int max = c > d ? c : d;
        System.out.println(max);
        //一步到位法
        int max2 = a > b ? (a > d ? a : d):(b > d ? b : d);
        System.out.println(max2);

    }
}