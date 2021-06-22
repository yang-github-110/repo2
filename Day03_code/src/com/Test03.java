package com;
/*	分析以下需求，并用代码实现：
	什么是水仙花数呢?
	所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	举例：153就是一个水仙花数。
	153 = 1*1*1 + 5*5*5 + 3*3*3
	要求:
		1.定义方法 isSXH(int num)
			功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
		2.在主方法中借助1中定义的方法,打印所有的水仙花数及水仙花数的总个数*/
public class Test03 {
    public static void main(String[] args) {
        //因为要统计水仙花数总个数,所以要用到计数器
        int count = 0;
        //要想得到所有的水仙花数  先遍历所有的三位数
        for (int i = 100; i < 1000; i++) {
            //利用我们下面定义的方法,来判断我们当前的i是不是水仙花数
            boolean bool = isSXH(i);
            //我们就能够通过返回的是true还是false来判断这个i是不是水仙花数
            if(bool==true){
                //如果是水仙花数  就打印计数
                System.out.println(i);
                count++;
            }
        }
        //在for循环结束后才能得到最终的个数
        System.out.println("水仙花数的总个数: "+count);
    }


    //判断数字num是否是水仙花数,如果是返回true,如果不是返回false
    //1.参数:一个  就是我们要判断的这个数 类型是默认int类型
    //2.返回值: 有返回值,因为题目要求返回true或者false ,类型是boolean类型
    public static boolean isSXH(int num){
        //将传入的数值 分解得到个位,十位,百位
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/10/10%10;
        //根据 个位的三次方+十位的三次方+百位的三次方等于他本身 来判断这个数是不是水仙花数
        if(ge*ge*ge + shi*shi*shi + bai*bai*bai == num){
            //如果是水仙花数  就返回true
            return true;
        }else{
            //如果不是水仙花数  就返回false
            return false;
        }
    }
}
