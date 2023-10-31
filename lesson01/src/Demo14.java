import sun.awt.geom.AreaOp;

import java.util.Scanner;

/*
 * @className Demo10
 * @Description TODO 求偶数和
 * @Author: Ruiqi
 * */
public class Demo14 {
    public static void main(String[] args) {
        System.out.print("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int num = sc.nextInt();
        while(num > 0){
            if(num % 2 == 0){
                total += num;
            }
            num --;
        }

        System.out.print("偶数求和：" + total);
    }
}
