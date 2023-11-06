/**
 * @className Demo 01
 * @Description TODO 函数的嵌套调用
 * @author: Ruiqi
 *
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(plus(plus(3, 4), 5));
    }
    public static int plus(int a, int b){
        return a + b;
    }
}
