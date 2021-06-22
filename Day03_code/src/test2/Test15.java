package test2;

/**
 * 第十四题
 /分析以下需求，并用代码实现：
 什么是水仙花数呢?
 所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
 举例：153就是一个水仙花数。
 153 = 1*1*1 + 5*5*5 + 3*3*3
 要求:
 1.定义方法 isSXH(int num)
 功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
 2.在主方法中借助1中定义的方法,打印所有的水仙花数及水仙花数的总个数
 */
public class Test15 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 100; i <1000 ; i++) {
            boolean sxh = isSXH(i);
            if(sxh==true){
                count++;
                System.out.println(i);
            }


        }
        System.out.println(count);


    }

    public static boolean isSXH(int num) {
        int ge=num%10;
        int shi =num/10%10;
        int bai =num/10/10;
        if(ge*ge*ge+shi*shi*shi+bai*bai*bai==num){
            return true;
        }else {
            return false;
        }

    }
}
