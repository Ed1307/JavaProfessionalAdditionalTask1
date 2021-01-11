package task2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(d);

        Integer year = gc.get(Calendar.YEAR);
        Integer month = gc.get(Calendar.MONTH) + 1;
        Integer day = gc.get(Calendar.DAY_OF_MONTH);

        String s = year.toString() + month.toString() + day.toString();
        char [] cArr = s.toCharArray();

        int sum = 0;
        for (int i = 0; i < cArr.length; i++) {
            sum+=Character.getNumericValue(cArr[i]);
        }

        System.out.println(sum);
    }
}
