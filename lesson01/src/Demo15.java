import java.util.Scanner;
import java.util.ArrayList;

/*
 * @className Demo10
 * @Description TODO 水仙花数
 * @Author: Ruiqi
 * */
public class Demo15 {
    public static void main(String[] args) {
        System.out.print("请输入一个三位数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while(num > 0){
            // 获取个位、百位、千位
            int a = num % 10;
            int b = num / 10 % 10;
            int c = num / 100;
            double total = Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3);
            if(num == total){
                list.add(num);
            }
            num--;
        }
        System.out.println("水仙花数："+ list);
    }
}
