import java.util.Scanner;

/*
 * @className Demo10
 * @Description TODO cumulative
 * @Author: Ruiqi
 * */
public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int total = 0;
        int num = sc.nextInt();
        while(num > 0) {
            total += num;
            num --;
        }
        System.out.println(total);
    }
}
