package test;
/*第二十五题
把数组中的数据颠倒顺序，原始数组为{1,2,3,4,5},反转都的数组为{5，4，3，2，1}*/
public class Test25 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int min;
        int max;
        for (int i = 0,j=arr.length-1; i <=j; i++,j--) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
