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
    public static boolean isLeapYear (long year)
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

    public static int daysInMonth (int month, long year)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Which month is it (numerically)?");
        month = scan.nextInt();
        
        //A list for the months, and the amount of days in each month.
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

    public static boolean isValidDate(long month, long day, long year)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Put in the 1st month (numerically)");
        month = scan.nextInt();
        System.out.println("Put in the 1st day (numerically)");
        day = scan.nextInt();
        System.out.println("Put in the 1st year (LIMIT 2500)");
        year = scan.nextInt();

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

    //missing rule for Leap Year and specifiying the month. 
    public static int daysBetween(int month0, int day0, int year0,int month1, int day1, int year1)
    {
        System.out.println("Please input the earlier date as the 1st date");

        Scanner scan = new Scanner (System.in);
        System.out.println("Put in the 1st month (numerically)");
        month0 = scan.nextInt();
        System.out.println("Put in the 1st day (numerically)");
        day0 = scan.nextInt();
        System.out.println("Put in the 1st year (LIMIT 2500)");
        year0 = scan.nextInt();
        System.out.println("Put in the 2nd month (numerically)");
        month1 = scan.nextInt();
        System.out.println("Put in the 2nd day (numerically)");
        day1 = scan.nextInt();
        System.out.println("Put in the 2nd year (LIMIT 2500)");
        year1 = scan.nextInt();

        //Conversion 
        int yearConversion = ((year1 - year0) * 365);
        int dayDifference = (day1 - day0);
        int monthConversion = ((month1 - month0) * 30);
        int difference = yearConversion + dayDifference + monthConversion;

        return difference; 
    }

    //Repeats code from earlier method. 
    public static void main (String []args)
    {

        System.out.println("Please input the earlier date as the 1st date");

        Scanner scan = new Scanner (System.in);
        System.out.println("Put in the 1st month (numerically)");
        int month0 = scan.nextInt();
        System.out.println("Put in the 1st day (numerically)");
        int day0 = scan.nextInt();
        System.out.println("Put in the 1st year (LIMIT 2500)");
        int year0 = scan.nextInt();
        System.out.println("Put in the 2nd month (numerically)");
        int month1 = scan.nextInt();
        System.out.println("Put in the 2nd day (numerically)");
        int day1 = scan.nextInt();
        System.out.println("Put in the 2nd year (LIMIT 2500)");
        int year1 = scan.nextInt();

        //Conversion
        int yearConversion = ((year1 - year0) * 365);
        int dayDifference = (day1 - day0);
        int monthConversion = ((month1 - month0) * 30);
        int difference = yearConversion + dayDifference + monthConversion;
        
        System.out.println("The difference in the amount of days is: " + difference);
        //CountTheDays dif = new CountTheDays();
        //dif.daysBetween();
        //System.out.println(dif.daysBetween());

    }

}
