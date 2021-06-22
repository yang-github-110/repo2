package test2;

/**
 * 第十一题:
 求出1-100之间，奇数的个数和所有奇数之和。并在控制台上进行打印
 */
public class Test11 {
    public static void main(String[] args) {
        int count=0;
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==1){
                count++;
                sum+=i;
            }
        }
        double avg=sum*1.0/count;
        System.out.println("奇数有"+count+",所有奇数之和为"+sum);
    }
}
