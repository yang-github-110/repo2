package test;
/*
第三题
用if语句获取三个数的最大值。
*/
public class Test03 {
    public static void main(String[] args) {
        int a=8;int b=12;int c=10;
        int max;
        if(a>b){
            if(a>c){
                max=a;
            }else{
                max=c;
            }

        }else{
            if(b>c){
                max=b;
            }else{
                max=c;
            }
        }
        System.out.println(max);

    }

}
