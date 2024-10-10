import java.util.*;
public class Program2
{
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 - 2047): ");
        int n = sc.nextInt();
        
        if (n < 0 || n > 2047)
        {
            System.out.println("Invalid input. Enter a number between 0 and 2047.");
            return;
        }

        decitobi(n);
        decitooctal(n);
        decitohex(n);
    }

    void decitobi(int n)
    {
        int[] binary = new int[11];
        int pos = 10;

        while (n > 0)
        {
            binary[pos--] = n % 2;
            n = n / 2;
        }

        System.out.print("Binary: ");
        for (int i = 0; i < 10; i++)
            System.out.print(binary[i]);
        System.out.println();
    }

    
    void decitooctal(int n)
    {
        int[] octal = new int[4];
        int pos = 3;

        while (n > 0)
        {
            octal[pos--] = n % 8;
            n = n / 8;
        }

        System.out.print("Octal: ");
        for (int i = 0; i < 4; i++)
            System.out.print(octal[i]);
        System.out.println();
    }

    void decitohex(int n)
    {
        String[] hex = new String[3];
        int pos = 2;
        String[] hexDigits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        while (n > 0)
        {
            hex[pos--] = hexDigits[n % 16];
            n = n / 16;
        }

        for (int i = 0; i <= pos; i++)
            hex[i] = "0";

        System.out.print("Hexadecimal: ");
        for (int i = 0; i < 3; i++)
            System.out.print(hex[i]);
        System.out.println();
    }
}
