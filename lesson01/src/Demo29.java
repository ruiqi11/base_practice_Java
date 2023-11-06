/**
 * @className Demo 29
 * @Description TODO 增强 for 循环（赋值给新声明的变量，不影响原数组）
 * @author: Ruiqi
 *
 */
public class Demo29 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for(int a:arr ){
            System.out.println(a);
        }
    }
}
// 数组在JAVA中使用较少，更多的使用集合list
/**
 * @Description 数组的特征
 * 成员占用连续的存储空间（了解，C语言有用）
 * 数组名实为该数组的首地址
 * 数组的成员访问时，注意不要下标越界
 * 数组中的成员数组类型必须相同
 * java中数组的长度一旦确定不能增减
 */
