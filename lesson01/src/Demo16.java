import java.util.Scanner;

/*
 * @className Demo10
 * @Description TODO 星号组成矩形
 * @Author: Ruiqi
 * */
public class Demo16 {
    public static void main(String[] args) {
        System.out.print("请输入边长：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int num2 = num;

        while (num1 > 0){
            while(num2 > 0){
                System.out.print("*");
                num2 --;
            }
            num2 = num;
            System.out.println("");
            num1--;
        }
    }
}
