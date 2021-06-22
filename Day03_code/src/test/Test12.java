package test;
/*第十二题
统计100-999水仙花个数。（计数器思想）*/

public class Test12 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i <1000 ; i++) {
            int ge =i%10;
            int shi=i/10%10;
            int bai=i/100;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                count++;
            }
        }
        System.out.println(count);
    }
}
