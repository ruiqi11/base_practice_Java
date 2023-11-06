import java.util.Arrays;

/**
 * @className Demo 27
 * @Description TODO 矩阵转置
 * @author: Ruiqi
 *
 */
public class Demo27 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArray(array);
        System.out.println("—————————————转置分割线——————————");
        changeReverse(array);
        printArray(array);
    }

    public static void changeReverse(int[][] temp){
        for(int i=0; i<temp.length; i++){
            for(int j=i+1; j<temp[i].length; j++){
                temp[i][j] ^= temp[j][i];
                temp[j][i] ^= temp[i][j];
                temp[i][j] ^= temp[j][i];
            }
        }
    }

    public static void printArray(int[][] temp) {
        for(int i=0; i<temp.length; i++){
            System.out.println(Arrays.toString(temp[i]));
        }
    }
}
