/**
 * @className Demo 23
 * @Description TODO 查找指定的值
 * @author: Ruiqi
 *
 */
public class Demo23 {
    public static void main(String[] args) {
        int[] array = {5, 65, 3, 53, 7, 16, 36};
        int target = 7, index=0;
        for(int i=0; i<array.length -1; i++){
            if(array[i] == target){
                index = i;
            }
        }
        System.out.println(target + "在该数组的索引为：" + index);
    }
}
