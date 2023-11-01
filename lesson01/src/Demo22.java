/**
 * @className Demo 21
 * @Description TODO 找出数组中第二大的值(考虑重复的值)
 * @author: Ruiqi
 *
 */
public class Demo22 {
    public static void main(String[] args) {
        int[] array = {1,3,18,11,7,18,2,9};
        int max = array[0], secondMax=0, temp;
        for(int start =0, end=array.length - 1; start <= end; start++, end--){
            temp = max;
            int itemMax = Math.max(array[start], array[end]);
            max = Math.max(max, itemMax);
            if(temp != max){
                secondMax = temp;
            }else if (itemMax< max){
                secondMax = Math.max(secondMax, itemMax);
            }
        }
        System.out.println("第二大值为"+ secondMax);
    }
}
