package test;
/*定义一个静态方法 void method(int[] arr),输出该数组元素中脚标为奇数的元素的的“总和”以及“平均值”，
  在main方法中定义一个int型数组，数组元素有{2,3,5,1,5,2}，并将该数组传入method方法中，调用测试*/

public class Test23 {
    public static void main(String[] args) {
        int[] arr ={2,3,5,1,5,2};
        method(arr);

    }
    public static void method(int[] arr){
        int sum=0;
        int count=0;
        for (int i = 1; i < arr.length; i+=2) {
            sum+=i;
            count++;
            System.out.println(arr[i]);
        }
        System.out.println(sum);
        System.out.println(count);
        double avg=sum*1.0/count;
        System.out.println(avg);
    }
}
