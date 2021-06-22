package com;
/*1.定义一个方法,功能为:计算1~n之间的奇数的平均数,并将其结果返回.
	2.在主方法中调用该方法,随便传入一个整数,将返回的结果打印出来*/
public class Test06 {
    public static void main(String[] args) {
        //调用方法  因为有返回值,所以需要用参数去接收
        double avg = getAvg(5);
        System.out.println("avg = " + avg);
    }

    //计算1~n之间的奇数的平均数,并将其结果返回.
    //1.参数:一个  我们知道从1开始,但在哪儿结束取决于n, n我们不知道是多少,那么他就是参数,默认int类型
    //2.返回值: 有返回值,因为题目要求返回其结果 ,因为是平均数,有可能是小数,所以我们返回double类型
    public static double getAvg(int n){
        //要求平均值 那么就要得到他们的和 和 个数
        int sum = 0;
        int count = 0;
        //首先 我们要得到1~n的数据,那么就要用到for循环
        for (int i = 1; i <= n; i++) {
            //判断当前遍历的数(i)是不是奇数
            if(i%2==1){
                //是奇数,就计数  求和
                sum+=i;
                count++;
            }
        }
        // 在for循环结束后才能得到最终的和和个数,才能求出平均数
        double avg = sum*1.0/count;
        //将其返回
        return avg;
    }
}
