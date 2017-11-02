package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mjmersenski
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        // find the next friday the 13th
//        LocalDate now = LocalDate.now();
//        while(now.getDayOfMonth() != 13){
//            now = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
//        }
//        
//        System.out.println(now);

        // find the day of the week that christmas falls on
//        LocalDate christmas = LocalDate.of(2017, Month.DECEMBER, 25);
//        System.out.println(christmas.getDayOfWeek());
        
        String date = "2017-12-01";
        
        LocalDate dec1 = LocalDate.parse(date);
        
        System.out.println(dec1.getDayOfWeek());


    }
}
