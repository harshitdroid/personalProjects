/*
 *Advanced palindrome tester
 *ignores all the special characters including numbers
 *ignores case and space
 */
import java.util.Scanner;
public class PalindromeTester
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("enter a word, phrase, or sentence (blank line to stop):");
      String str = kb.nextLine();
      int count = 0;

      //Palindrome Testing Algorithm
      while (!str.isEmpty())
      {
         String reverse = "";
         str = str.replaceAll("[^a-zA-Z]", "");

         int i = 0 , j = (str.length() - 1);

         for (i = 0; i < str.length(); i++)
         {
            reverse = reverse + str.charAt(j);
            j--;
         }

         //checking if the entered string is a palindrome
         if (str.toLowerCase().equals(reverse.toLowerCase()))
         {
            System.out.println("palindrime");
            ++count;
            System.out.println();
         }
         else
         {
            System.out.println("Not a palindrome");
            System.out.println();
         }

         // Re-entering for new input
         System.out.println("enter a word, phrase, or sentence (blank line to stop):");
         str = kb.nextLine();

      }
      System.out.printf("You found %d palindromes.\n", count);
      System.out.println("Thank you for using PalindromeTester.");
   }
}
