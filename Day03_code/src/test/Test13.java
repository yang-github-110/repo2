package test;
/*第十三题:
	分析以下需求，并用while循环将代码实现：
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，折叠多少次，可以折成珠穆朗玛峰的高度。
纸张初始厚度0.0001，折叠后的纸张厚度<=8848就会一直折,折叠一次的厚度都会加倍*/

public class Test13 {
    public static void main(String[] args) {
        //纸张初始厚度0.0001
        //
        double sum=0.0001;
        int count=0;
        while (true){
            sum*=2;
            count++;
            if(sum>=8848){
                break;
            }
        }
        System.out.println(count);

    }
}
