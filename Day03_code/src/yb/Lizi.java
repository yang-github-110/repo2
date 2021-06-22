package yb;

public class Lizi {
    public static void main(String[] args) {
        calculator(20,30,"*");
        }
        public static void calculator(int a,int b,String c){
            int result;
            switch (c) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    result = -1;
                    System.out.println("输入错误");
                    break;

            }
                    System.out.println(result);
            }
        }

