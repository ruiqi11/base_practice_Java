import java.util.Arrays;

/**
 * @className Demo 28
 * @Description TODO 杨辉三角
 * @author: Ruiqi
 *
 */
public class Demo28 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            array[i][0] = 1;
            array[i][i] = 1;
        }
        for (int i = 2; i < array.length; i++) {
            for (int j = 1; j < i; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        printArray(array);
    }
    public static void printArray(int[][] temp) {
        for(int i=0; i<temp.length; i++){
            String str = "";
            double num = Math.floor((temp.length * 2 - 1) /2);
            for (int k=0; k<=num-i; k++) {
                str = str + " ";
            }
            System.out.print(str);
            for(int j=0; j<=i; j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
