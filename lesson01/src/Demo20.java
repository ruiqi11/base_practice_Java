import java.util.Scanner;

/**
 * @author: Ruiqi
 * 从键盘上读入个数不确定的整数，并判断正数和负数的个数，输入为0时程序结束
 * 无限循环：
 * while(true){
 *
 * }
 *
 * 说明：一般情况下，在无限循环内部要有程序终止的语句，使用break实现。若没有，那就是死循环
 */
public class Demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        while(true){
            System.out.print("请输入一个整数用来判断正负(输入0退出)：");
            int num = sc.nextInt();
            if(num > 0){
                positive++;
            }else if(num < 0){
                negative++;
            }else {
                System.out.print("正数"+positive+"个，负数"+negative+"个");
                break;
            }
        }
    }
}
