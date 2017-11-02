package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mjmersenski
 */
public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE MM/dd/yyyy hh:mm:ss a");
        Date now1 = new Date();
        
        String fmtDate = sdf.format(now1);
        
        System.out.println(fmtDate + "\n\n");
        Calendar now2 = Calendar.getInstance();
//        now2.set(2018, Calendar.OCTOBER, 30, 21, 38, 10);
        now2.add(Calendar.DATE, 30);
        
        Date date = now2.getTime();
        System.out.println(sdf.format(date));

    }
}
