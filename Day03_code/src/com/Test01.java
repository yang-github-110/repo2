package com;
/*分析以下需求，并用代码实现(每个小需求都需要封装成方法,并在main方法中调用)
	1.求两个数据之和(整数 小数),在main方法中打印出来
	2.判断两个数据是否相等(整数 整数),在控制台上打印出来
	3.获取两个数中较大的值(整数 小数),在控制台上打印出来
	4.获取两个数中较小的值(整数 整数),在main方法中打印出来*/
public class Test01 {
    public static void main(String[] args) {
        //调用求和方法 有返回值,所以需要用参数接受
        double he = sum(1, 2.2);
        System.out.println("he = " + he);

        //调用比较相等方法 没有返回值,所以前面不需要参数接受
        equal(10,11);

        //调用获取最大值方法 没有返回值,所以前面不需要参数接受
        getMax(10,9.9);

        //调用获取最小值方法 有返回值,所以需要用参数接受
        int min = getMin(10, 20);
        System.out.println("min = " + min);
    }

    //求两个数据之和(整数 小数),在main方法中打印出来
    //1.参数:两个  一个int  一个double
    //2.返回值: 有返回值,因为题目要求在main方法中打印出来,返回值类型是double类型 因为int + double = double
    public static double sum(int a, double b){
        double c = a + b;
        return c;
    }

    //判断两个数据是否相等(整数 整数),在控制台上打印出来
    //1.参数:两个  都是int类型
    //2.返回值: 无返回值,因为题目要求在控制台上打印出来,可以不要返回值
    public static void equal(int a ,int b){
        boolean flag = a==b;
        System.out.println("flag = " + flag);

    }

    //获取两个数中较大的值(整数 小数),在控制台上打印出来
    //1.参数:两个  一个int类型  一个double类型
    //2.返回值: 无返回值,因为题目要求在控制台上打印出来,可以不要返回值
    public static void getMax(int a, double b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    //获取两个数中较小的值(整数 整数),在main方法中打印出来
    //1.参数:两个  都是int类型
    //2.返回值: 有返回值,因为题目要求在main方法中打印出来,返回值类型是int类型
    public static int getMin(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

}
