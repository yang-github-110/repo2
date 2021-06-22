package yb;

public class Variable {
    public static void main(String[] args){
        short num1 = 0;
        System.out.println(num1);

        byte num2 = 1;
        System.out.println(num2);

        int num3 = 2;
        System.out.println(num3);

        long num4 = 4L;
        System.out.println(num4);

        float num5 = 0.0F;
        System.out.println(num5);

        double num6 = -0.1;
        System.out.println(num6);

        char a = 'A';
        System.out.println(a);

        boolean b = false;
        System.out.println(b);

        //多个变量赋值时可以使用以下格式，不推荐使用
        int c, d, e;
        c = 11;
        d = 22;
        e = 33;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int f = 44, g = 55, h = 66;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

    }
}
