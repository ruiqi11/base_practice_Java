import java.util.ArrayList;

/*
 * @className Demo10
 * @Description TODO 100以内的素数
 * @author: Ruiqi
 * */
public class Demo19 {
    public static void main(String[] args) {
        System.out.println("100以内的素数");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=100; i++){
            boolean isTarget = true;
            for(int j=1; j<=Math.floor(i/2); j++){
                if(i % j == 0 && j != 1){
                    isTarget = false;
                }
            }
            if(isTarget) list.add(i);
        }
        System.out.println(list);
    }
}
