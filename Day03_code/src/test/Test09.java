package test;
/*第九题:，
	分别定义两个int类型的变量a,b
		1.定义一个方法,求两个数的和,并打印出来
		2.定义一个方法,求两个数的平均数,并打印出来
		3.定义一个方法,看两个数的和是否大于30,如果大于30,就输出 true 否则就输出 false
	调用上述定义的三个方法,分别将a,b当做参数传入,打印出ab变量的和,平均值及 ab的和是否大于30*/

public class Test09 {
    public static void main(String[] args) {
        int a=21;
        int b=18;
        sum(21,18);
        avg(21,18);
        bi(21,18);

    }
    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }

    public static void avg(int a,int b){
        int sum=a+b;
        double avg=sum*1.0/2;
        System.out.println(avg);
    }

    public static void bi(int a,int b){
        int sum=a+b;
        if(sum>30){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
