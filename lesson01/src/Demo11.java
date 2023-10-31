import java.util.Scanner;

public class Demo11 {
    public static void main(String[] arg){
        System.out.print("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leapYear = false;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leapYear = true;
        }

        System.out.print("请输入月份：");
        Scanner sc2 = new Scanner(System.in);
        int month = sc2.nextInt();

        int result = 0;

        switch (month){
            case 1:
                result = 31;
                break;
            case 2:
                result = leapYear ? 29 : 28;
                break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;
        }
        System.out.println( year +"年"+month + "月有" + result + "天");

    }
}
