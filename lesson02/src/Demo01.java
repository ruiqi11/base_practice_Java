/**
 * @className Demo 01
 * @Description TODO 方法（函数）
 * @author: Ruiqi
 *
 */

public class Demo01 {
    public static void main(String[] args) {
            int sum = plus(5, 6);
            System.out.println(sum);
    }
    public static int plus(int a, int b){
        return a + b;
    }

    // 没有返回值
    public static void plus2(int a, int b){
        System.out.println(a + b);
    }

    /**
     * 方法重载：
     * 方法名相同，参数不同，与返回值无关
     * 在调用方法时，根据所传递的实参，来选择具体调用的是哪一个方法
     */
    public static void plus2(int a){
        System.out.println("a");
    }
    public static void plus2(){
        System.out.println("*******");
    }
    /**
     * 注意：
     * 返回值必须和定义时相同
     * 方法可以嵌套调用。但是不可以嵌套定义
     * 定义方法是如果返回值是void，则方法体内仍然可以使用return关键字，但是return后面不能跟随任何数据
     * 方法的重载，避免出现完全相同（重写）
     */
}
