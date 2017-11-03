package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    public String toString(LocalDate date) throws IllegalArgumentException {
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
     * @throws IllegalArgumentException if pattern is not recognized and/or date
     * is null
     */
    public String toString(LocalDate date, String pattern) throws IllegalArgumentException {
        if (date == null) {
            throw new IllegalArgumentException("Error: date argument cannot be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    /**
     * Attempts to convert a String representation of a date to a
     * java.time.LocalDate object. Conversion rules are based on parse
     * definitions in the java.​time.​format.​DateTimeFormatter class.
     *
     * @param dateString - a string representation of a date
     * @return a java.time.LocalDate object
     * @throws IllegalArgumentException if the date string cannot be parsed
     * and/or if the value is null or empty.
     */
    public LocalDate toDate(String dateString) throws IllegalArgumentException {
        if (dateString == null || dateString.isEmpty()) {
            throw new IllegalArgumentException("Error: dateString argument cannot be null or empty");
        }

        LocalDate date = LocalDate.parse(dateString);
        return date;
    }

     /**
     * Attempts to convert a String representation of a date to a
     * java.time.LocalDate object by with any pattern specified. 
     * Conversion rules are based on parse definitions in the 
     * java.​time.​format.​DateTimeFormatter class.
     *
     * @param dateString - a string representation of a date
     * @param pattern - a String with the specified date/time pattern
     * @return a java.time.LocalDate object
     * @throws IllegalArgumentException if the date string cannot be parsed
     * and/or if the value is null or empty.
     */
    public LocalDate toDate(String dateString, String pattern) throws IllegalArgumentException {
        if (dateString == null || dateString.isEmpty()) {
            throw new IllegalArgumentException("Error: dateString argument cannot be null or empty");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate date = LocalDate.parse(dateString, formatter);

        return date;
    }


    public int getDateDiff(){
        
        return 1;
    }
    
    public static void main(String[] args) {
        MJMDateUtilities mjm = new MJMDateUtilities();

//        // toString test - outputs a formatted string MM/dd/yyyy
//        LocalDate today = LocalDate.now();
//        System.out.println(mjm.toString(today));

//        // toString test - takes a date and format as parameters and returns specified format
//        LocalDate today = LocalDate.now();
//        String pattern = "yyyy/MM/dd";
//        System.out.println(mjm.toString(today, pattern));

//        // toDate test - takes a string as a paramter
//        String today = "2017-11-02";
//        mjm.toDate(today);
//        System.out.println(mjm.toDate(today).getDayOfWeek());

        // toDate test - takes a string date and a string format
//        String today = "11/03/2017";
//        String pattern = "MM/dd/yyyy";
//        System.out.println(mjm.toDate(today, pattern).getDayOfWeek());

        // getDateDiff - 


    }
}
