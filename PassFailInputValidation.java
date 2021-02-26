import java.util.Scanner;
public class PassFailInputValidation {
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int passes=0, failures=0, students=0, result;
      for (students = 0; students < 10; students++)
      {
          System.out.print("enter result (1=pass, 0=fail): ");
          result = keyboard.nextInt();
          if (result == 1 || result == 0)
          {
             System.out.printf("You entered %d\n", result);
             if (result == 1)
                passes++;
             else
                failures++;
          }
          else
          {
             System.out.print("Invalid entry please try again \n");
             students--;
          }
      }
      System.out.println(passes + " passed\n"
              + failures + " failed");
      if (passes < 5)
          System.out.println("Raise tuition");
   }
}
