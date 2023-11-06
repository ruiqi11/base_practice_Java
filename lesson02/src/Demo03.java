import java.util.Scanner;

/**
 * @className Demo 03
 * @Description TODO 凯撒日期
 * @author: Ruiqi
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] dateList;
        do {
            dateList = getInput();
        }while (!checkDate(dateList));
        int day = getCaesarDay(dateList[0], dateList[1], dateList[2]);
        System.out.printf("%d年的第%d天", dateList[0], day);
    }

    /**
     *
     * @param year
     * @param month
     * @param day
     * @return 累计天数（当年的第n天）
     */
    public static int getCaesarDay(int year, int month, int day){
        int caesarday = day;
        for (int i = 1; i < month; i++){
            caesarday += getDayOfMonth(year, i);
        }
        return caesarday;
    }

    /**
     * 获取用户输入的日期
     * @return int[3], int[0]是年份，int[1]是月份，int[3]是日期
     */
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);
        int[] DateList = new int[3];
        System.out.print("请输入年份：");
        DateList[0] = sc.nextInt();
        System.out.print("请输入月份：");
        DateList[1] = sc.nextInt();
        System.out.print("请输入日期：");
        DateList[2] = sc.nextInt();
        return DateList;
    }

    /**
     *
     * @param date 年月日数组
     * @return 合法为true
     */
    public static boolean checkDate(int[] date ){
        if(date[1] < 1 || date[1] > 12){
            System.out.println("月份不正确");
            return false;
        }else if(date[2] < 1 || date[2] > getDayOfMonth(date[0], date[1])){
            System.out.println("日期不正确");
            return false;
        }
        return true;
    }

    /**
     * 判断是否为闰年
     * @param year
     * @return 闰年为true
     */
    public static boolean isLeapyear(int year){
        boolean isLeap = false;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            isLeap = true;
        }
        return isLeap;
    }

    // 获取该月份的天数

    /**
     *
     * @param year
     * @param month
     * @return 当月对应的天数
     */
    public static int getDayOfMonth(int year, int month){
        int day = 0;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = isLeapyear(year) ? 29 : 28;
        }
        return day;
    }

}
