package test2;

import java.util.Scanner;

/**
 * 第十题：
 1.功能描述：
 定义方法,模拟计算器功能，对两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
 2.要求：
 (1)方法传入三个整数,其中前两个整数代表参加运算的数据，
 第三个整数为要进行的运算(+:表示加法运算,-:表示减法运算,*:表示乘法运算,/:表示除法运算)
 (2)使用今天所学知识完成功能
 (3)演示格式如下:
 请输入第一个整数:30
 请输入第二个整数:40
 请输入您要进行的运算(+:表示加法运算,-:表示减法运算,*:表示乘法运算,/:表示除法运算):+
 控制台输出:30+40=70

 TIP提示:
 1、调用几次录入数据的方法，就会要求我们输入几次数据
 2、可以采用 if...else 语句完成，也可以采用 switch 语句完成
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int i = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int l = scanner.nextInt();
        System.out.println("请输入您要进行的运算:0表示加法运算,1表示减法运算,2表示乘法运算,3表示除法运算");
        int y = scanner.nextInt();

        switch (y){
            case 0:
                System.out.println(i+"+"+l+"="+(i+l));
                break;
            case 1:
                System.out.println(i+"-"+l+"="+(i-l));
                break;
            case 2:
                System.out.println(i+"*"+l+"="+(i*l));
                break;
            case 3:
                System.out.println(i+"/"+l+"="+(i*1.0/l));
                break;
                default:
                    System.out.println("输入错误");
                    break;
        }
    }
}
