import java.util.Arrays;
import java.util.Scanner;

/**
 * @className Demo 25
 * @Description TODO 有序数组插入数字后依然保持有序
 * @author: Ruiqi
 *
 */
public class Demo25 {
    public static void main(String[] args) {
        int[] array = {1, 3, 9, 45, 100};

        System.out.print("请输入一个数字：");
        int num = new Scanner(System.in).nextInt();
        int temp1 = 0, temp2 = 0;
        for(int i=0; i < array.length; i++){
            if(array[i] > num && temp1 <=num){
                temp1 = array[i];
                array[i] = num;
            }else if(array[i] > num && temp1 > num ){
                temp2 = array[i];
                array[i] = temp1;
                temp1 = temp2;
            }
        }
        System.out.println("结果是："+ Arrays.toString(array));
    }
}
