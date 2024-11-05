import java.util.*;
class Program1
{
    void number()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long format = 0;
        int[] digits = new int[10];
        long f = 1;
    
        while (n > 0)
        {
            long digit = n % 10;
            if (digits[(int)digit] == 0)
            {
                format += digit * f;
                f *= 10;
                digits[(int)digit] = 1;
            }
            n /= 10;
        }
        System.out.print("Formatted number: " + format);
    }
    
    void palin()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toUpperCase() + " ";
        String word = "", rev = "";
        int count = 0;
        
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) != ' ')
            {
                word += sentence.charAt(i);
                rev = sentence.charAt(i) + rev;
            }
            else
            {
                if(word.equals(rev))
                {
                    System.out.print(word + "\t");
                    count++;
                }
                word = "";
                rev = "";
            }
        }
        System.out.println();
        System.out.print("Number of palindrome words: " + count);
    }
}
