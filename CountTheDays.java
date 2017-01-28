/**
 *  File name     :  CountTheDays.java
 *  Purpose       :  Count the days between two given dates. 
 *  Author        :  Brandon Azuoma(prototype)
 *  Date          :  2017-01-26 (prototype)
 *  Notes         :  None
 *  Warnings      :  Might not be correct when dealing with leap year. 
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
import java.util.*;
public class CountTheDays 
{
    //Repeats code from earlier method. 
    public static void main (String []args)
    {
        System.out.println("Please input the earlier date as the 1st date");

        Scanner scan = new Scanner (System.in);
        System.out.println("Put in the 1st month (numerically)");
        int month1 = scan.nextInt();
        System.out.println("Put in the 1st day (numerically)");
        int day1 = scan.nextInt();
        System.out.println("Put in the 1st year (LIMIT 2500)");
        int year1 = scan.nextInt();
        System.out.println("Put in the 2nd month (numerically)");
        int month2 = scan.nextInt();
        System.out.println("Put in the 2nd day (numerically)");
        int day2 = scan.nextInt();
        System.out.println("Put in the 2nd year (LIMIT 2500)");
        int year2 = scan.nextInt();

        CalendarStuff dif = new CalendarStuff();
        dif.daysBetween();
        System.out.println(dif.daysBetween());

    }

}