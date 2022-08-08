import java.util.*;

public class Numbers
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your given number");

        int n = sc.nextInt();

        int i, number, count, sum = 0;

        for(number = 1; number < n; number++)
        {
            count = 0;
            for (i = 2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 )
            {
                sum = sum + number;
            }
        }
        System.out.println("\n The Sum of Prime Numbers from 1 to "+n+" = " + sum);
    }
}




