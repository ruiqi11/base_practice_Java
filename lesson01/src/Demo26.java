import java.util.Arrays;

/**
 * @className Demo 26
 * @Description TODO 冒泡排序
 * @author: Ruiqi
 *
 */
public class Demo26 {
    public static void main(String[] args) {
        int[] array = {13, 2, 56, 45, 88, 6, 11};
        int temp = 0;
        for(int i=0; i<=array.length-2; i++){
            for(int j=i+1; j<=array.length-1; j++){
                if(i < j && array[i] > array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                System.out.println("第"+ i +"轮" + "第"+ j +"次比较"+ Arrays.toString(array));
            }
        }
        System.out.println("排序结果："+ Arrays.toString(array));
    }
}
