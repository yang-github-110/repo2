package test;
/*第二十一题:（*************）
	1.定义一个包含五个元素的int类型的数组。数组元素自己给出
	2.将数组当中数据小于10的打印出来
        如果存在，则打印出来，具体的数据
        如果不存在，则打印出来，未找到合适的数据*/

public class Test21 {
    public static void main(String[] args) {
        int[] arr={8,12,5,54,31};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<10){
                count++;
                System.out.println(arr[i]);
            }
            if(count==0){
                System.out.println("未找到合适的数据");
            }


        }
    }
}
