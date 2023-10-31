import java.util.Scanner;

/*
* @className Demo10
* @Description TODO
* @Author: Ruiqi
* */
public class Demo10 {
    public static void main(String[] arg){
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意三位数");
        a = sc.nextInt();
        System.out.println("三位数" + a);
        System.out.println("个位数" + (a % 10));
        System.out.println("十位数" + (a % 100 / 10));
        System.out.println("百位数" + (a % 1000 / 100));
    }
}
