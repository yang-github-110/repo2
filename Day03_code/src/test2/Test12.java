package test2;

/**
 * 打印	1-10，跳过5 （continue）
 */
public class Test12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
