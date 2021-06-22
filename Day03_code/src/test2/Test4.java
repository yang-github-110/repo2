package test2;

/**
 * 第四题
 * 定义一个方法，传入一个int类型的参数你，要求调用该方法，计算出1-n的所有数据和（包含1和n），并将和打印出来。
 */
public class Test4 {
    public static void main(String[] args) {
        sum(10);
    }

    private static void sum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
