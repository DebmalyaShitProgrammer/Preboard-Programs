import java.util.*;
public class Program4
{
    int base, power;
    double sum;

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base (X): ");
        base = sc.nextInt();

        System.out.print("Enter the number of terms (N): ");
        power = sc.nextInt();
    }
    
    void series1()
    {
        sum = base;
        double term = base, factorial = 1;

        for (int i = 2; i <= 5; i++)
        {
            factorial *= (i + 1);
            term = Math.pow(base, i) / factorial;
            sum += term;
        }

        System.out.println("Result of series1: " + sum);
    }
    
    void series2()
    {
        sum = base;
        double term;

        int fib[] = new int[power + 1];
        fib[1] = 1;
        if (power > 1)
        {
            fib[2] = 1;
        }

        for (int i = 3; i <= power; i++)
        {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 2; i <= power; i++)
        {
            term = Math.pow(base, i) / fib[i];
            if(i%3 == 0)
                sum -= term;
            else
                sum += term;
        }

        System.out.println("Result of series2: " + sum);
    }

    void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Program4 obj = new Program4();

        System.out.println("1.series1");
        System.out.println("2.series2");
        System.out.print("Choose an option:");

        int choice = sc.nextInt();

        obj.input();

        if (choice == 1) 
            obj.series1();
        else if (choice == 2)
            obj.series2();
        else
            System.out.println("Invalid choice");
    }
}
