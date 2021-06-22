package test;
/*第一题:
	1.创建TPhone类，包含如下属性
  		品牌
  		价格
  		使用年限
    2.在测试类中，利用满参构造创建4个对象，将对象存入集合中。
       华为-1200-4  苹果-9000-1  锤子-3000-3  小米-1800-2
    3.遍历集合，将使用年限小于2或价格低于2000的手机筛选出来。
    4.在控制台上打印所有筛选出来的对象（格式：华为-1200-4）*/

import java.util.ArrayList;

public class Test26 {
    public static void main(String[] args) {
        ArrayList<TPhone> list = new ArrayList<>();
        TPhone one1 = new TPhone("华为", 1200, 4);
        TPhone one2 = new TPhone("苹果", 9000, 1);
        TPhone one3 = new TPhone("锤子", 3000, 3);
        TPhone one4 = new TPhone("小米", 1800, 2);

        list.add(one1);
        list.add(one2);
        list.add(one3);
        list.add(one4);

        for (int i = 0; i < list.size(); i++) {
            //获得集合中的元素
            TPhone tPhone = list.get(i);
            //获得元素中的使用年限
            int age = tPhone.getAge();
            //获得元素中的价格
            int price = tPhone.getPrice();
            //获得元组中的品牌
            String bread = tPhone.getBread();
            if (age < 2 || price < 2000) {
                System.out.println(bread+"-"+price+"-"+age);
            }


        }

    }
}
