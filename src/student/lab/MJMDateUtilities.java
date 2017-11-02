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
    public String toString(LocalDate date)throws IllegalArgumentException{
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
        // add an exception
    }
    
     /**
     * Format a <code>Date</code> according to a specified format
     *
     * @param date - a <code>Date</code> object
     * @param pattern - a String with the specified date/time pattern
     * @return a date and/or time formatted according to the specified pattern
     * @throws IllegalArgumentException if pattern is not recognized and/or date is null
     */
    public String toString(LocalDate date, String pattern){
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
    
    
    
    
    public static void main(String[] args) {
        MJMDateUtilities mjm = new MJMDateUtilities();
        LocalDate now = LocalDate.now();
        
//        String test = mjm.toString(now);
        String test = mjm.toString(now, "yyyy/MM/dd");
        
        System.out.println(test);
    }
}
