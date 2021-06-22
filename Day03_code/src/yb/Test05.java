package yb;
/*
第二十四题
        定义一个方法,传入一个学生的成绩,能输出对应的评语,规则如下:
        当分数不合法时(小于0 或 大于100),打印"请写合法的成绩"
        当分数合法时,按照如下打印:
        0-59  打印"不及格"
        60-70  打印"良"
        71-85  打印"中"
        86-100 打印"优"

        2.在主方法中定义一个int类型的数组,代表一个小组的成绩,元素为{100,34,-1,67,102,86}
        调用1中定义的方法,在控制台打印出该组每个成绩对应的评语
        */
public class Test05 {
    public static void main(String[] args) {
        int[] arr={100,34,-1,67,102,86};
        for (int i = 0; i < arr.length; i++) {
            getChengJi(arr[i]);
        }

    }
    public static void getChengJi(int a){
        if(0<=a&&a<=59){
            System.out.println("不及格");
        }else if(60<=a&&a<=70){
            System.out.println("良");
        }else if(71<=a&&a<=85){
            System.out.println("中");
        }else if(86<=a&&a<=100){
            System.out.println("优");
        }else{
            System.out.println("请写合法成绩");
        }
    }
}
