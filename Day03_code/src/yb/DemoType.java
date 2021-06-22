package yb;

public class DemoType {
    public static void main(String[] args){
        byte b1 = 10;
        byte b2 = 20;
        byte b3;
        byte b4;

        //给b3赋值
        b3 = (byte)(b1 + b2);//int+int--->byte
        System.out.println(b3);

        b4 = 10 +20;//这里自动将10+20先计算，然后检查有没有超出byte的取值范围，如果没有超出就自动转换为byte
        //这里的10和20是常量，而上面的b1和b2都是变量
        System.out.println(b4);
    }
}
