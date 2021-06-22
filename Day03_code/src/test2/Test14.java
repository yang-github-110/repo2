package test2;

/**
 * 第十三题:
 分析以下需求，并用while循环将代码实现：
 1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
 2.请问，折叠多少次，可以折成珠穆朗玛峰的高度。
 纸张初始厚度0.0001，折叠后的纸张厚度<=8848就会一直折,折叠一次的厚度都会加倍
 */
public class Test14 {
    public static void main(String[] args) {
        int count=0;
        double sum=0;
        double zhi=0.0001;
        while (true){
            if(zhi<=8848){
                sum=zhi*2;
                zhi*=2;
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }

/*    public static void main(String[] args){
        double sum = 0;
        int count = 0;
        double a = 0.0001;
        while(a <= 8848){
            sum = a*2;
            a *=2;
            count++;
        }
        System.out.println(sum);
        System.out.println(count);

    }*/
}
