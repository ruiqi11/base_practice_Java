/**
 * @className Demo 20
 * @Description TODO 找出数组中最大的值
 * @author: Ruiqi
 *  for (int start = 0, end = array.length - 1; start < end; start++, end--)
 *
 */
public class Demo21 {
    public static void main(String[] args) {
        int[] array = {1,3,5,11,7,18,2,9};

//        单项遍历
//        int max = array[0];
//        for(int i=1; i<array.length; i++){
//            if(max < array[i]){
//                max = array[i];
//            }
//        }

        // 首尾双向遍历
        int startMax = array[0], endMax = array[array.length - 1];
        for(int start =0, end=array.length -1; start < end; start++, end--){
            startMax = Math.max(startMax, array[start]);
            endMax = Math.max(endMax, array[end]);
        }
        int max = Math.max(startMax, endMax);
        System.out.println("最大值为"+ max);
    }
}
