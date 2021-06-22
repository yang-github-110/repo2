package yb;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(same((byte)22,(byte)10));
        System.out.println(same((short) 22,(short) 10));
        System.out.println(same(22,10));
        System.out.println(same(22L,10L));

    }
    public static boolean same(byte a,byte b){
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean same(short a,short b){
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean same(int a,int b){
        return a == b;

    }
    public static boolean same(long a,long b){
        return a == b;

    }


}
