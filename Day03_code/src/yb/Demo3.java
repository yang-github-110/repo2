package yb;
/*
第五题:
        1.定义一个方法,能够判断传入的int类型数据是不是偶数,返回true或false
        2.借用1中定义的方法,判断1-100中那些数字是偶数,并打印出来,求和.
*/
public class Demo3 {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            boolean c = ou(i);
            if(c==true){
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println(sum);
    }
    public static boolean ou(int a){
        boolean b;
        if(a % 2 ==0){
            b = true;
        }else {
            b = false;
        }
        return b;
    }



}

