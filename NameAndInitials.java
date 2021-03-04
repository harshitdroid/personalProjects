import java.util.Scanner;
public class NameAndInitials
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("enter your First name: ");
      String first = kb.nextLine();

      System.out.print("enter your middle name: ");
      String middle = kb.nextLine();

      System.out.print("enter your last name: ");
      String last = kb.nextLine();

      System.out.print("\nName = " + first + " " 
                       + middle + " " + last);
      System.out.print("\nInitials = " + first.charAt(0) + middle.charAt(0) + last.charAt(0));
      System.out.print("\nShort name = " + first + " " 
                       + middle.charAt(0) + " " + last);
      System.out.print("\nShorter name = " + first.charAt(0) + " " 
                       + middle.charAt(0) + " " + last);
      System.out.println("\nUpperCase name = " + first.toUpperCase() + " " 
                       + middle.toUpperCase() + " " + last.toUpperCase());
}

}

