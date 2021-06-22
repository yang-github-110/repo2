package test;
/*第七题
  某工厂决定涨工资,按照工龄计算
   [0,1)  +200//"["带有包含的以上，""
   [1,3)  +500
   [3,5)  +1000
   >=5    +1500

   现已知小王基础工资为 2000, 进厂工作3年.
   请编写代码计算小王工资涨幅
   控制台输出:
   小王基础工资2000, 工龄为3年,应涨1000元,涨后工资3000元.*/

public class Test07 {
    public static void main(String[] args) {
        int a =3;
        int b=200;
        if (0 <= a && a < 3) {
            b = 200;
            int sum=2000+b;
        } else if (1 <= a && a < 3) {
            b = 500;
            int sum=2000+b;
        } else if (3 <= a && a < 5) {
            b = 1000;
            int sum=2000+b;
        } else if (5 <= a) {
            b = 1500;
            int sum=2000+b;
        } else {
            System.out.println("输入有误");
        }
        int sum=2000+b;
        System.out.println("小王基础工资2000, 工龄为"+a+"年,应涨"+b+"元,涨后工资"+sum+"元");
    }
}
