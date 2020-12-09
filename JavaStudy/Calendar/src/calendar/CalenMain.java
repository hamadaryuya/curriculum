package calendar;

import java.util.Calendar;

public class CalenMain {

    public static void main(String[] args) {
        // 今日が2020/06/27の場合の年月日を表示
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        cal.add(Calendar.MONTH, 7);
        System.out.println(cal.get(Calendar.DATE));
    }
}