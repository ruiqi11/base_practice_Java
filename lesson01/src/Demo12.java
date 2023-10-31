import java.util.Scanner;

/*
 * @className Demo10
 * @Description TODO Caesar Date
 * @Author: Ruiqi
 * */
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年份：");
        int year = sc.nextInt();
        System.out.print("请输入月份：");
        int month = sc.nextInt();
        System.out.print("请输入日期：");
        int day = sc.nextInt();

        boolean leapYear = false;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            leapYear = true;
        }
        switch (month-1){
            case 12:
                day += 31;
            case 11:
                day += 30;
            case 10:
                day += 31;
            case 9:
                day += 30;
            case 8:
                day += 31;
            case 7:
                day += 31;
            case 6:
                day += 30;
            case 5:
                day += 31;
            case 4:
                day += 30;
            case 3:
                day += 31;
            case 2:
                day += (leapYear ? 29 : 28);
            case 1:
                day += 31;
                break;
        }
        System.out.println(year + "年的第" + day + "天");
    }
}
