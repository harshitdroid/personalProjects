public class NestedLoopPattern
{
   public static void main(String[] args)
   {
      for (int i = 7; i > 0 ; i--)
      {
         for (int j = 1; j <= i; j++)
         {
            System.out.print(j + " ");
         }
         System.out.print("\n");
      }
   }
}
