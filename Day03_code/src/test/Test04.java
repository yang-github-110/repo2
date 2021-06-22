package test;
/*第四题
定义一个方法，传入一个int类型的参数你，要求调用该方法，计算出1-n的所有数据和（包含1和n），并将和打印出来。
* */
public class Test04 {
    public static void main(String[] args) {

        sum(6);
        }
        public static void sum(int n){
            int sum=0;
            for(int i=0;i<=n;i++){
                sum+=i;
            }
            System.out.println(sum);
        }





    }

