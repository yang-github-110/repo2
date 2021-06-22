package test;
/*	1.创建TPhone类，包含如下属性
  		品牌
  		价格
  		使用年限*/
public class TPhone {
    private String bread;
    private int price;
    private int age;

    public TPhone() {
    }

    public TPhone(String bread, int price, int age) {
        this.bread = bread;
        this.price = price;
        this.age = age;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
