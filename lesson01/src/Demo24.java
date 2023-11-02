import java.util.Arrays;

/**
 * @className Demo 24
 * @Description TODO 数组存储顺序倒序
 * @author: Ruiqi
 *
 */
public class Demo24 {
    public static void main(String[] args) {
        int[] array = {1,3,18,11,7,18,2,9};
        for(int i=0, j=array.length-1; i<j; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
