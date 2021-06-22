package test;
/*第十一题:
	求出1-100之间，奇数的个数和所有奇数之和。并在控制台上进行打印*/
public class Test11 {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i = 0; i <=100 ; i++) {
            if(i%2==1){
                sum+=i;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);

        a(10);
    }
    public static void a(int n){
        for (int i = 1; i <=n; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }

}
