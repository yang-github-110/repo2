package test;
/*
第二题:
	1.定义一个整数代表一个学生成绩(int类型)
	2.判断该学生成绩是否及格
	3.打印格式：
		成绩>=60:输出 及格
		成绩<60: 输出 不及格

	提示：可以使用 三元算术运算符实现
* */
public class Test02 {
    public static void main(String[] args) {
        int a = 85;

        /*
        String chengJi = a > 60 ? "及格" : "不及格";
        System.out.println(chengJi);
        */

        if(a >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

    }

}


