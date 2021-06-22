package com;
/*定义一个方法,该方法能多次打印HelloWorld,要求调用该方法,传入一个int类型的参数n,要求调用该方法,能通过参数n控制打印HelloWorld的次数.
		当传入0时,HelloWorld不打印
		当传入1时,HelloWorld打印1次
		当传入2时,HelloWorld打印2次
		当传入3时,HelloWorld打印3次
					.
					.
					.
		当传入100时,HelloWorld打印100次
		以此类推*/
public class Test04 {
    public static void main(String[] args) {
        printHelloWorld(1);
    }

    //要求调用该方法,能通过参数n控制打印HelloWorld的次数.
    //1.参数:一个  就是要传入的参数n 默认int
    //2.返回值: 无返回值, 我们只需要单纯的打印HelloWorld  不需要向主方法返回任何结果
    public static void printHelloWorld(int n){
        //我们首先要搞清楚  我们for循环的循环次数由那个参数决定,然后用传入的参数n,代替那个控制循环次数的参数
        for (int i = 1; i <= n; i++) {
            System.out.println("HelloWorld");
        }
    }
}
