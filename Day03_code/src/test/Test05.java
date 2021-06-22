package test;
/*第五题
3.根据变量a的值判断今天是星期几switch语句
* */

public class Test05 {
    public static void main(String[] args) {
        int a = 8;
        switch (a) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
                case 7:
                    System.out.println("星期日");
                    break;

                default:
                    System.out.println("你输入的数字有误");
                    break;



        }
    }
}
