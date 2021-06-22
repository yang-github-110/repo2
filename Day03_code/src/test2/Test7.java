package test2;

/**
 * 第七题
 * 某工厂决定涨工资,按照工龄计算
 * [0,1)  +200//"["带有包含的以上，""
 * [1,3)  +500
 * [3,5)  +1000
 * >=5    +1500
 * <p>
 * 现已知小王基础工资为 2000, 进厂工作3年.
 * 请编写代码计算小王工资涨幅
 * 控制台输出:
 * 小王基础工资2000, 工龄为3年,应涨1000元,涨后工资3000元.
 */
public class Test7 {
    public static void main(String[] args) {
        sum(2000, 3);
    }

    public static void sum(int a, int b) {
        int c = 0;
        if (b >= 0 && b < 1) {
            c = a + 200;
            System.out.println("小王基础工资" + a + ",工龄为" + b + ",应涨200元,涨后工资" + c + "元.");
        } else if (b >= 1 && b < 3) {
            c = a + 500;
            System.out.println("小王基础工资" + a + ",工龄为" + b + ",应涨500元,涨后工资" + c + "元.");
        } else if (b >= 3 && b < 5) {
            c = a + 1000;
            System.out.println("小王基础工资" + a + ",工龄为" + b + ",应涨1000元,涨后工资" + c + "元.");

        } else if (b >= 5) {
            c = a + 1500;
            System.out.println("小王基础工资" + a + ",工龄为" + b + ",应涨1500元,涨后工资" + c + "元.");
        } else {
            System.out.println("输入数据有误");
        }
    }
}
