package com;
/*1.定义一个方法,能够判断传入的int类型数据是不是偶数,返回true或false
	2.借用1中定义的方法,判断1-100中那些数字是偶数,并打印出来,求和.*/
public class Test05 {
    public static void main(String[] args) {
        //因为要求和  所以要定义求和变量
        int sum = 0;
        //先得到1-100的数字
        for (int i = 1; i <= 100; i++) {
            //通过下面定义的方法,判断我们当前遍历的数字(i),是不是偶数
            boolean bool = isEven(i);
            if(bool==true){
                //是偶数 就打印  求和
                sum += i;
            }
        }
        //在for循环结束后才能得到最终的和
        System.out.println("和为: "+sum);
    }

    //能够判断传入的int类型数据是不是偶数,返回true或false
    //1.参数:一个  就是传入的要我们判断的参数 int类型
    //2.返回值: 有返回值,因为题目要求返回true或者false ,类型是boolean类型
    public static boolean isEven(int a){
        //判断传入的参数a 是不是偶数
        if(a%2 == 0){
            //是偶数  返回true
            return true;
        }else{
            //是奇数  返回false
            return false;
        }
    }

}
