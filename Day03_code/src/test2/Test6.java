package test2;

/**
 * 第六题
 定义一个方法,该方法能多次打印HelloWorld,要求调用该方法,传入一个int类型的参数n,要求调用该方法,能通过参数n控制打印HelloWorld的次数.
 当传入0时,HelloWorld不打印
 当传入1时,HelloWorld打印1次
 当传入2时,HelloWorld打印2次
 当传入3时,HelloWorld打印3次
 .
 当传入100时,HelloWorld打印100次
 以此类推
 */
public class Test6 {
    public static void main(String[] args) {
        point(5);
    }

    public static void point(int a){
        for (int i = 0; i <a ; i++) {
            System.out.println("HelloWorld"+(i+1));
        }
    }
}
