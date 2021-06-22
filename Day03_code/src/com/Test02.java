package com;
/*1.定义两个变量代表长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长(周长 = (长+宽)*2)
	2.定义两个变量代表长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积(面积 = 长*宽)
	3.定义一个变量代表圆的半径(π取3.14)
		定义方法计算该圆的周长,并在main方法中打印周长(周长 = 2*π*半径)
	4.定义一个变量代表圆的半径(π取3.14)
		定义方法计算该圆的面积,并在main方法中打印面积(面积 = π*半径*半径)*/
public class Test02 {
    public static void main(String[] args) {
        //定义长和宽
        int chang = 2;
        int kuan = 3;
        //调用求长方形周长的方法
        int zc = getZC(2, 3);
        System.out.println("zc = " + zc);
        //调用求长方形面积的方法
        int mj = getMJ(2, 3);
        System.out.println("mj = " + mj);

        //定义圆的半径
        int radius = 1;
        //调用求圆形周长的方法
        double circleZC = getCircleZC(radius);
        System.out.println("circleZC = " + circleZC);
        //调用求圆形面积的方法
        double circleMJ = getCircleMJ(radius);
        System.out.println("circleMJ = " + circleMJ);
    }

    //定义方法计算该长方形的周长,并在main方法中打印周长(周长 = (长+宽)*2)
    //1.参数:两个  一个长 int  一个宽 int
    //2.返回值: 有返回值,因为题目要求在main方法中打印出来,返回值类型是int类型
    public static int getZC(int a, int b){
        int zhouchang = (a+b)*2;
        return zhouchang;
    }

    //定义方法计算该长方形的面积,并在main方法中打印面积(面积 = 长*宽)
    //1.参数:两个  一个长 int  一个宽 int
    //2.返回值: 有返回值,因为题目要求在main方法中打印出来,返回值类型是int类型
    public static int getMJ(int a, int b){
        int mianji = a*b;
        return mianji;
    }

    //定义方法计算该圆的周长,并在main方法中打印周长(周长 = 2*π*半径)
    //1.参数:一个 园的半径int类型
    //2.返回值: 有返回值,因为题目要求在main方法中打印出来,返回值类型是double类型,因为π的取值是3.14,是double1类型
    public static double getCircleZC(int r){
        double zhouchang =  2*3.14*r;
        return zhouchang;
    }

    //定义方法计算该圆的面积,并在main方法中打印面积(面积 = π*半径*半径)
    //1.参数:一个 园的半径int类型
    //2.返回值: 有返回值,因为题目要求在main方法中打印出来,返回值类型是double类型,因为π的取值是3.14,是double1类型
    public static double getCircleMJ(int r){
        double mianji =  3.14*r*r;
        return mianji;
    }
}
