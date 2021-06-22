package test;

/*第八题
统计1-100中,不包含3且为奇数的数字,他们的平均数为多少?*/
public class Test08 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10;
            if (ge != 3 && shi != 3 && i % 2 == 1) {
                sum+=i;
                count++;
            }

        }
        double avg=sum*1.0/count;
        System.out.println(avg);
    }
}
