package test2;

/**
 * 第十二题
 统计水仙花个数。（计数器思想）
 */
public class Test13 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 0; i < 10000; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                count++;

            }
        }
        System.out.println(count);
    }
}
