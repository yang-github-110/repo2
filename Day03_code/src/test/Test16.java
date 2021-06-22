package test;
/*
第十六题:
	1.定义一个方法,功能为:计算1~n之间的奇数的平均数,并将其结果返回.
	2.在主方法中调用该方法,随便传入一个整数,将返回的结果打印出来
*/

public class Test16 {
    public static void main(String[] args) {
        double a=avg(20);
        System.out.println(a);
    }
    public static double avg(int n){
        int sum=0;
        int count=0;
        for (int i = 1; i <n; i++) {
            if(i%2==1){
                sum+=i;
                count++;
            }
        }
        double avg=sum*1.0/count;
        return avg;
    }
}
