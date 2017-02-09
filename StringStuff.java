/**
 *  File name     :  StringStuff.java
 *  Purpose       :  Contains methods that are used to take a string and modify the string to the user's input. 
 *  Author        :  Brandon Azuoma
 *  Date          :  2017-02-08
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
import java.util.*;

public class StringStuff
{
    public static void main(String [] args)
    {
        boolean quit = false;
        while(!quit)
        {
            System.out.println("What would you like to do? Type the number of your choice or type q to quit.");
            System.out.println("1. Check if a word is a palindrome");
            System.out.println("2. Find all even letters in a word");
            System.out.println("3. Find all odd letters in a word");
            System.out.println("4. Find all even letters in a word (no repetition)");
            System.out.println("5. Find all odd letters in a word (no repetition)");
            System.out.println("6. Check if a word contains a vowel");
            System.out.println("7. Reverse a word");
            System.out.print("Number: ");

            Scanner sc = new Scanner(System.in);
            String input = sc.next();

            if(input.equals("q"))
            {
                quit = true;
                break;
            }

            switch(input)
            {
                case "1":
                {
                    System.out.println("What is the word you would like to check?");
                    System.out.print("Word: ");
                    String test = sc.next();

                    if(test.equals("q"))
                    {
                        quit = true;
                        break;
                    }

                    if(isPalindrome(test))
                    {
                        System.out.println("The word is a palindrome.\n");
                    }
                    else
                    {
                        System.out.println("The word is NOT a palindrome.\n");
                    }
                    break;
                }
                case "2":
                {
                    System.out.println("What is the word?");
                    System.out.print("Word: ");
                    String word = sc.next();

                    if(word.equals("q"))
                    {
                        quit = true;
                        break;
                    }

                    System.out.println("Even letters: " + evensOnly(word) + "\n");
                    break;
                }
                case "3":
                {
                    System.out.println("What is the word?");
                    System.out.print("Word: ");
                    String word = sc.next();

                    if(word.equals("q"))
                    {
                        quit = true;
                        break;
                    }

                    System.out.println("Odd letters: " + oddsOnly(word) + "\n");
                    break;
                }
                case "4":
                {
                    System.out.println("What is the word?");
                    System.out.print("Word: ");
                    String word = sc.next();

                    if(word.equals("q"))
                    {
                        quit = true;
                        break;
                    }

                    System.out.println("Even letters (no repetition): " + evensOnlyNoDupes(word) + "\n");
                    break;
                }
                case "5":
                {
                    System.out.println("What is the word?");
                    System.out.print("Word: ");
                    String word = sc.next();

                    if(word.equals("q"))
                    {
                        quit = true;
                        break;
                    }

                    System.out.println("Odd letters (no repetition): " + oddsOnlyNoDupes(word) + "\n");
                    break;
                }
                case "6":
                {
                    System.out.println("What is the word you would like to check?");
                    System.out.print("Word: ");
                    String test = sc.next();

                    if(test.equals("q"))
                    {
                        quit = true;
                        break;
                    }

                    if(containsVowel(test))
                    {
                        System.out.println("The word contains a vowel.\n");
                    }
                    else
                    {
                        System.out.println("The word does NOT contain a vowel.\n");
                    }
                    break;
                }
                case "7":
                {
                    System.out.println("What is the word you would like to reverse?");
                    System.out.print("Word: ");
                    String word = sc.next();

                    if(word.equals("q"))
                    {
                        quit = true;
                        break;
                    }

                    System.out.println("Reverse: " + reverse(word) + "\n");
                    break;
                }
                default:
                {
                    System.out.println("Sorry. Your input could not be understood. Try entering a number 1 through 7.\n");
                    break;
                }
            }
        }
    }

    public static boolean isPalindrome(String s)
    {
        s = s.toLowerCase(); 
        String backwards = "";
        for(int i = 0; i < s.length(); i++)
        {
            backwards += s.substring((s.length()-i)-1, (s.length()-i));
        }

        if(s.equals(backwards))
        {
            return true;
        }
        return false;
    }

    public static String evensOnly(String s)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList <String> evens = new ArrayList <String> (); 
        for(int i = 0; i < alphabet.length(); i++)
        {
            if(i%2 == 1) 
            {
                evens.add(alphabet.substring(i, i+1));
            }
        }

        String temp = s.toLowerCase();
        String newString = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(evens.contains(temp.substring(i, i+1))) 
            {
                newString += s.substring(i, i+1);
            }
        }
        return newString;
    }

    public static String oddsOnly(String s)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList <String> odds = new ArrayList <String> (); 
        for(int i = 0; i < alphabet.length(); i++)
        {
            if(i%2 == 0) 
            {
                odds.add(alphabet.substring(i, i+1));
            }
        }

        String temp = s.toLowerCase();
        String newString = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(odds.contains(temp.substring(i, i+1)))
            {
                newString += s.substring(i, i+1);
            }
        }
        return newString;
    }

    public static String evensOnlyNoDupes(String s)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList <String> evens = new ArrayList <String> ();
        for(int i = 0; i < alphabet.length(); i++)
        {
            if(i%2 == 1) 
            {
                evens.add(alphabet.substring(i, i+1));
            }
        }

        
        String temp = s.toLowerCase();
        String newString = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(evens.contains(temp.substring(i, i+1))) 
            {
                if(!newString.toLowerCase().contains(temp.substring(i, i+1))) 
                {
                    newString += s.substring(i, i+1);
                }
            }
        }
        return newString;
    }

    public static String oddsOnlyNoDupes(String s)
    {
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList <String> odds = new ArrayList <String> (); 
        for(int i = 0; i < alphabet.length(); i++)
        {
            if(i%2 == 0) 
            {
                odds.add(alphabet.substring(i, i+1));
            }
        }

        
        String temp = s.toLowerCase();
        String newString = "";
        for(int i = 0; i < s.length(); i++)
        {
            if(odds.contains(temp.substring(i, i+1))) 
            {
                if(!newString.toLowerCase().contains(temp.substring(i, i+1))) 
                {
                    newString += s.substring(i, i+1);
                }
            }
        }
        return newString;
    }

    public static boolean containsVowel(String s)
    {
        s = s.toLowerCase();
        String temp = "";
        for(int i = 0; i < s.length(); i++)
        {
            temp = s.substring(i, i+1);
            if(temp.equals("a") || temp.equals("e") || temp.equals("i") || temp.equals("o") || temp.equals("u"))
            {
                return true;
            }
        }
        return false;
    }

    public static String reverse(String s)
    {
        String backwards = "";
        for(int i = 0; i < s.length(); i++)
        {
            backwards += s.substring((s.length()-i)-1, (s.length()-i));
        }
        return backwards;
    }
}