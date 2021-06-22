package yb;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("HelloWorld");

        int a = 1;
        System.out.println(a);
        //System.out.println(b);
        {
            int b = 2;
            System.out.println(a);//可以显示
            System.out.println(b);
        }
        System.out.println(a);
        //System.out.println(b);



        System.out.println("=================================");

        int x = 10;
        x +=3;
        System.out.println(x);
        x /=2;
        System.out.println(x);

    }
}
