package student.lab;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mjmersenski
 */
public class MJMDateUtilities {
    
        /**
     * Format a <code>LocalDate</code> to a month/day/year format (mm/dd/yyyy)
     *
     * @param date - a <code>LocalDate</code> object
     * @return a date formatted to month/day/year (mm/dd/yyyy)
     * @throws IllegalArgumentException if date is null
     */
    public String toString(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
        // add an exception
    }
    
    public String toString(){
        
        return "";
    }
    
    public static void main(String[] args) {
        MJMDateUtilities mjm = new MJMDateUtilities();
        LocalDate now = LocalDate.now();
        
        String test = mjm.toString(now);
        System.out.println(test);
    }
}
