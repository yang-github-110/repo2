package test;/*
第二十题（***********）
1.现存在如下两个数组:
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
	2.要求定义一个方法,将上面两个数组传入,在方法中将两个数组合并,形成一个新的数组,并返回.
		新的数组: arr3 =int[] {1,2,3,4,5,6}
	3.在main方法中调用该方法,将返回的数组遍历打印*/

public class Test20 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = su(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }

    public static int[] su(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }


        return c;

    }
}
