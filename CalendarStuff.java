/**
 *  File name     :  CalendarStuff.java
 *  Purpose       :  Provides a class with supporting methods for CountTheDays.java program
 *  Author        :  B.J. Johnson (prototype)
 *  Date          :  2017-01-02 (prototype)
 *  Author        :  <your name here>
 *  Date          :  <date of writing here>
 *  Description   :  This file provides the supporting methods for the CountTheDays program which will
 *                   calculate the number of days between two dates.  It shows the use of modularization
 *                   when writing Java code, and how the Java compiler can "figure things out" on its
 *                   own at "compile time".  It also provides examples of proper documentation, and uses
 *                   the source file header template as specified in the "Greeter.java" template program
 *                   file for use in CMSI 186, Spring 2017.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-02  B.J. Johnson  Initial writing and release
 */
import java.util.*;
public class CalendarStuff {

    /**
     * A listing of the days of the week, assigning numbers; Note that the week arbitrarily starts on Sunday
     */
    private static final int SUNDAY    = 0;
    private static final int MONDAY    = SUNDAY    + 1;
    private static final int TUESDAY   = MONDAY    + 1;
    private static final int WEDNESDAY = TUESDAY   + 1;
    private static final int THURSDAY  = WEDNESDAY + 1;
    private static final int FRIDAY    = THURSDAY  + 1;
    private static final int SATURDAY  = FRIDAY    + 1;

    /**
     * A listing of the months of the year, assigning numbers; I suppose these could be ENUMs instead, but whatever
     */
    private static final int JANUARY    = 0;
    private static final int FEBRUARY   = JANUARY   + 1;
    private static final int MARCH      = FEBRUARY  + 1;
    private static final int APRIL      = MARCH     + 1;
    private static final int MAY        = APRIL     + 1;
    private static final int JUNE       = MAY       + 1;
    private static final int JULY       = JUNE      + 1;
    private static final int AUGUST     = JULY      + 1;
    private static final int SEPTEMBER  = AUGUST    + 1;
    private static final int OCTOBER    = SEPTEMBER + 1;
    private static final int NOVEMBER   = OCTOBER   + 1;
    private static final int DECEMBER   = NOVEMBER  + 1;

    /**
     * An array containing the number of days in each month
     *  NOTE: this excludes leap years, so those will be handled as special cases
     */
    private static int[]    days        = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    /**
     * The constructor for the class
     */
    public CalendarStuff() 
    {
        System.out.println( "Constructor called..." );
    }

    /**
     * A method to determine if the year argument is a leap year or not<br />
     *  Leap years are every four years, except for even-hundred years, except for every 400
     * @param    year  long containing four-digit year
     * @return         boolean which is true if the parameter is a leap year
     */
    public static boolean isLeapYear( long year ) 
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is the year?");
        year = scan.nextInt();
        
        //This makes the rule for what the program should consider a leap year. 
        if (year % 400 == 0)
        {
            return true;
        }
        if (year % 100 == 0 && year % 400 != 0)
        {
            return false; 
        }
        if (year % 4 == 0)
        {
            return true; 
        }
        return false;
    }

    /**
     * A method to calculate the days in a month, including leap years
     * @param    month long containing month number, starting with "1" for "January"
     * @param    year  long containing four-digit year; required to handle Feb 29th
     * @return         long containing number of days in referenced month of the year
     * notes: remember that the month variable is used as an indix, and so must
     *         be decremented to make the appropriate index value
     */
    public static int daysInMonth( int month, long year ) 
    {
        int[] daysInMonth;
        daysInMonth = new int [12];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;

        //If the month is February, then it will go through this process to see if a day should be added due to a leap year. 
        if(month == 2)
        {
            if (year % 400 == 0)
            {
                return daysInMonth[month] + 1;
            }
            if (year % 100 == 0 && year % 400 != 0)
            {
                return daysInMonth[month]; 
            }
            if (year % 4 == 0)
            {
                return daysInMonth[month] + 1; 
            }
            return daysInMonth[month];
        }
        return daysInMonth[month];
    }

    /**
     * A method to determine if two dates are exactly equal
     * @param    month1 long    containing month number, starting with "1" for "January"
     * @param    day1   long    containing day number
     * @param    year1  long    containing four-digit year
     * @param    month2 long    containing month number, starting with "1" for "January"
     * @param    day2   long    containing day number
     * @param    year2  long    containing four-digit year
     * @return          boolean which is true if the two dates are exactly the same
     */
    public static boolean dateEquals( long month1, long day1, long year1, long month2, long day2, long year2 ) {
        if (month1 == month2 && day1 == day2 && year1 == year2)
        {
            return true;
        }
        return false;
    }

    /**
     * A method to compare the ordering of two dates
     * @param    month1 long   containing month number, starting with "1" for "January"
     * @param    day1   long   containing day number
     * @param    year1  long   containing four-digit year
     * @param    month2 long   containing month number, starting with "1" for "January"
     * @param    day2   long   containing day number
     * @param    year2  long   containing four-digit year
     * @return          int    -1/0/+1 if first date is less than/equal to/greater than second
     */
    public static int compareDate( long month1, long day1, long year1, long month2, long day2, long year2 ) 
    {
        //if (day)
        //{
           // if month 
        //}
        
        return 0;
    }

    /**
     * A method to return whether a date is a valid date
     * @param    month long    containing month number, starting with "1" for "January"
     * @param    day   long    containing day number
     * @param    year  long    containing four-digit year
     * @return         boolean which is true if the date is valid
     * notes: remember that the month and day variables are used as indices, and so must
     *         be decremented to make the appropriate index value
     */
    public static boolean isValidDate( long month, long day, long year ) 
    {
        if (month > 0 && month <= 12)
        {
            if (day > 0 && day <= 31)
            {
                if(year > 0 && year < 2501)
                {
                    return true;
                }
                return true;
            }
            return true; 
        }

        return false;

    }

    /**
     * A method to return a string version of the month name
     * @param    month long   containing month number, starting with "1" for "January"
     * @return         String containing the string value of the month (no spaces)
     */
    public static String toMonthString( int month ) {
         int[] daysInMonth;
        daysInMonth = new int [12];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;
        
        int i = month; 
        if (daysInMonth[i] == 0)
        {
            return "January"; 
        }
        if (daysInMonth[i] == 1)
        {
            return "February"; 
        }
        if (daysInMonth[i] == 2)
        {
            return "March"; 
        }
        if (daysInMonth[i] == 3)
        {
            return "April"; 
        }
        if (daysInMonth[i] == 4)
        {
            return "May"; 
        }
        if (daysInMonth[i] == 5)
        {
            return "June"; 
        }
        if (daysInMonth[i] == 6)
        {
            return "July"; 
        }
        if (daysInMonth[i] == 7)
        {
            return "August"; 
        }
        if (daysInMonth[i] == 8)
        {
            return "September"; 
        }
        if (daysInMonth[i] == 9)
        {
            return "October"; 
        }
        if (daysInMonth[i] == 10)
        {
            return "November"; 
        }
        if (daysInMonth[i] == 11)
        {
            return "December"; 
        }
        
        switch( month - 1 ) {
            
            
            default: throw new IllegalArgumentException( "Illegal month value given to 'toMonthString()'." );
        }
    }

    /**
     * A method to return a string version of the day of the week name
     * @param    day int    containing day number, starting with "1" for "Sunday"
     * @return       String containing the string value of the day (no spaces)
     */
    public static String toDayOfWeekString( int day ) 
    {
        int[] daysOfWeek;
        daysOfWeek = new int [7];
        daysOfWeek[0] = 1;
        daysOfWeek[1] = 1;
        daysOfWeek[2] = 1;
        daysOfWeek[3] = 1;
        daysOfWeek[4] = 1;
        daysOfWeek[5] = 1;
        daysOfWeek[6] = 1;
     
        
         int i = day; 
        if (daysOfWeek[i] == 0)
        {
            return "Monday"; 
        }
        if (daysOfWeek[i] == 1)
        {
            return "Tuesday"; 
        }
        if (daysOfWeek[i] == 2)
        {
            return "Wednesday"; 
        }
        if (daysOfWeek[i] == 3)
        {
            return "Thursday"; 
        }
        if (daysOfWeek[i] == 4)
        {
            return "Friday"; 
        }
        if (daysOfWeek[i] == 5)
        {
            return "Saturday"; 
        }
        if (daysOfWeek[i] == 6)
        {
            return "Sunday"; 
        } 
        
        switch( day - 1 ) {
            default       : throw new IllegalArgumentException( "Illegal day value given to 'toDayOfWeekString()'." );
        }
    }

    /**
     * A method to return a count of the total number of days between two valid dates
     * @param    month1 long   containing month number, starting with "1" for "January"
     * @param    day1   long   containing day number
     * @param    year1  long   containing four-digit year
     * @param    month2 long   containing month number, starting with "1" for "January"
     * @param    day2   long   containing day number
     * @param    year2  long   containing four-digit year
     * @return          long   count of total number of days
     */
    public static int daysBetween( int month1, int day1, int year1, int month2, int day2, int year2 ) 
    {
        
        int yearConversion = ((year2 - year1) * 365);
        int dayDifference = (day2 - day1);
        int monthConversion = ((month2 - month1) * 30);
        int difference = yearConversion + dayDifference + monthConversion;
        
        if (year2 - year1 == 1 && month2 <= month1)
        {
            return monthConversion + dayDifference;
        }

        return difference; 
    }

}