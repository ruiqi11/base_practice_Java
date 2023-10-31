import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        // 获取一个键盘输入的扫描对象
        Scanner src = new Scanner(System.in);

        // 通过键盘的扫描对象获取一个整数，给整型变量赋值
        int a = src.nextInt();

        // 输出
        System.out.println("a = " + a);
    }
}
