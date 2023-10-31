import java.util.Scanner;

/*
 * @className Demo10
 * @Description TODO 星号组成的等腰三角
 * @Author: Ruiqi
 * */
public class Demo17 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        while(num > 0) {
            while(num2 > 0) {
                System.out.print("*");
                num2--;
            }
            System.out.println("");
            num2 = --num;
        }
    }
}
