package test;
/*第十九题（********************）
已知水仙花数有4个，遍历100-999，取出其中的水仙花数，
 * 2.并将它们装入一个数组中。
 * 3.求出该数组的平均值*/

public class Test19 {
    public static void main(String[] args) {
        int[] array=new int[4];

        int sum=0;
        int count=0;
        for (int i = 100; i <1000 ; i++) {
            int ge =i%10;
            int shi = i/10%10;
            int bai=i/100;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                sum+=i;
                array[count]=i;
                count++;
            }
        }




        double avg=sum*1.0/count;
        System.out.println(avg);
    }
}
