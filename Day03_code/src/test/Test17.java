package test;

public class Test17 {
    public static void main(String[] args) {
        int[] array = new int[4];
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                array[count] = i;
                count++;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        double avg = sum * 1.0 / array.length;
        System.out.println(avg);


    }
}
