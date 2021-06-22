package test2;

/**
 * 第八题
 * 统计1-100中,不包含3且为奇数的数字,他们的平均数为多少?
 */
public class Test8 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 100; i++) {
//            int shi=i/10;
 //           int ge=i%10;

            if ( i/10 != 3 && i%10 != 3 && i % 2 == 1) {
                count++;
                sum+=i;
            }
        }
        double avg=sum*1.0/count;

        System.out.println(avg);
    }
}
