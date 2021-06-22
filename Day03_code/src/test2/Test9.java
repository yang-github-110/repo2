package test2;

/**
 * 第九题:，
 分别定义两个int类型的变量a,b
 1.定义一个方法,求两个数的和,并打印出来
 2.定义一个方法,求两个数的平均数,并打印出来
 3.定义一个方法,看两个数的和是否大于30,如果大于30,就输出 true 否则就输出 false
 调用上述定义的三个方法,分别将a,b当做参数传入,打印出ab变量的和,平均值及 ab的和是否大于30
 */
public class Test9 {
    public static void main(String[] args) {
        int a=22;
        int b=11;
        sum(a,b);
        avg(a,b);
        print(a,b);
    }
    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println("和是"+sum);
    }

    public static void avg(int a,int b){
        double avg=(a+b)*1.0/2;
        System.out.println("平均数是"+avg);
    }

    public static void print(int a,int b){
        if ((a+b)>30){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

