package test2;

/**
 * 第十六题:
 * 1.定义一个方法,功能为:计算1~n之间的奇数的平均数,并将其结果返回.
 * 2.在主方法中调用该方法,随便传入一个整数,将返回的结果打印出来
 */
public class Test17 {
    public static void main(String[] args) {
        double avg = avg(10);
        System.out.println(avg);
    }

    public static double avg(int num) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                count++;
                sum += i;
            }
        }

        System.out.println(count);
        System.out.println(sum);
        double avg = sum * 1.0 / count;
        return avg;

    }
}
