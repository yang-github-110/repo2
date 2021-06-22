package test;
/*第十四题
/分析以下需求，并用代码实现：
	什么是水仙花数呢?
	所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	举例：153就是一个水仙花数。
	153 = 1*1*1 + 5*5*5 + 3*3*3
	要求:
		1.定义方法 isSXH(int num)
			功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
		2.在主方法中借助1中定义的方法,打印所有的水仙花数及水仙花数的总个数**/

public class Test14 {
    public static void main(String[] args) {
        int num=153;
        boolean bool=isSXH(num);
        int count=0;
        for (int i = 100; i < 1000; i++) {
            if(bool=isSXH(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isSXH(int a){
        int ge =a%10;
        int shi =a/10%10;
        int bai=a/100;
        boolean boo;
        if(ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
            boo=true;
        }else {
            boo=false;
        }
        return boo;
    }

}
