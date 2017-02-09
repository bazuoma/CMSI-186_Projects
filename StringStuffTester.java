/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  StringStuffTester.java
 *  Purpose       :  A test harness file for testing out the methods in the "StringStuff.java" class
 *  Author        :  Brandon Azuoma 
 *  Date          :  2017-02-09
 *  Description   :  This file provides the "test harness" for checking out the methods which are part of
 *                   the homework02 assignment.  It also provides examples of proper documentation, and
 *                   uses the source file header template as specified in the "Greeter.java" template file
 *                   for use in CMSI 186, Spring 2017.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class StringStuffTester
{
    /**
     * the main method which calls all of the test methods in the class
     * @param args String[] array containing command line parameters
     * @return void
     */
    public static void main ( String [] args ) {
        test_isPalindrome();      
        test_evensOnly();     
        test_oddsOnly();     
        test_evensOnlyNoDupes();      
        test_oddsOnlyNoDupes();     
        test_containsVowel();
        test_reverse();
    }

    static void test_isPalindrome(){

        System.out.println( "\nTest for isPalindrome():" );

        System.out.print( "   Test for year racecar: " );
        try { System.out.println( StringStuff.isPalindrome( "racecar") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for year Brandon: " );
        try { System.out.println( StringStuff.isPalindrome( "Brandon") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for year mom: " );
        try { System.out.println( StringStuff.isPalindrome( "mom") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for year raccecarr: " );
        try { System.out.println( StringStuff.isPalindrome( "raccecarr") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

    }

    static void test_evensOnly(){

        System.out.println( "\nTest for evensOnly():" );

        System.out.print( "   Test for year rehearsal: " );
        try { System.out.println( StringStuff.evensOnly( "rehearsal") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for year Brandon: " );
        try { System.out.println( StringStuff.evensOnly( "Brandon") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for year encyclopedia: " );
        try { System.out.println( StringStuff.evensOnly( "encyclopedia") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for year family: " );
        try { System.out.println( StringStuff.evensOnly( "family") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

    }

    static void test_oddsOnly(){

        System.out.println( "\nTest for oddsOnly():" );

        System.out.print( "   Test for cool: " );
        try { System.out.println( StringStuff.oddsOnly( "cool") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for notebook: " );
        try { System.out.println( StringStuff.oddsOnly( "notebook") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for table: " );
        try { System.out.println( StringStuff.oddsOnly( "table") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for seasalt: " );
        try { System.out.println( StringStuff.oddsOnly( "seasalt") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

    }

    static void test_evensOnlyNoDupes(){

        System.out.println( "\nTest for evensOnlyNoDupes():" );

        System.out.print( "   Test for rehearsal: " );
        try { System.out.println( StringStuff.evensOnlyNoDupes( "rehearsal") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for killer: " );
        try { System.out.println( StringStuff.evensOnlyNoDupes( "killer") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

    }

    static void test_oddsOnlyNoDupes(){

        System.out.println( "\nTest for oddsOnlyNoDupes():" );

        System.out.print( "   Test for racecar: " );
        try { System.out.println( StringStuff.oddsOnlyNoDupes( "racecar") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for Brandon: " );
        try { System.out.println( StringStuff.oddsOnlyNoDupes( "Brandon") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

    }

    static void test_containsVowel(){
        System.out.println( "\nTest for containsVowel():" );
        System.out.print( "   Test for jr: " );
        try { System.out.println( StringStuff.containsVowel( "jr") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for igloo: " );
        try { System.out.println( StringStuff.containsVowel( "igloo") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

    }

    static void test_reverse(){
        System.out.println( "\nTest for reverse():" );
        System.out.print( "   Test for year racecar: " );
        try { System.out.println( StringStuff.reverse( "racecar") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

        System.out.print( "   Test for year Brandon: " );
        try { System.out.println( StringStuff.reverse( "Brandon") ? "true" : "false" ); }
        catch( Exception e ) { System.out.println ( false ); }

    }
}
