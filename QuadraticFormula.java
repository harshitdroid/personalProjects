import java.util.Scanner;
public class QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the three coefficients: ");
        int first  =  kb.nextInt();
        int second = kb.nextInt();
        int third = kb.nextInt();
        float root1 = 0, root2 = 0;

        if (first == 0)
        {
            System.out.printf("This is not a quadratic equation.\n");
        }
        else if (((second*second)-4*first*third) == 0)
        {
            root1 = (float)(-second/(2*first));
            System.out.printf("The single root is %.4f.\n",root1);
        }
        else if (((second*second)-4*first*third) >= 0)
        {
            root1 = (float) (((-second) +Math.sqrt((second*second)- (4*first*third)))/(2*first));
            root2 = (float) (((-second) -Math.sqrt((second*second)- (4*first*third)))/(2*first));
            System.out.printf("The two roots are %.4f and %.4f.\n",root1,root2);
        }
        else if (((second*second)-4*first*third) <= 0)
            System.out.printf("There are no real roots.\n");
    }
}
