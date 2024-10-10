import java.util.*;
class Program1
{
    void numeber()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long format = 0;
        for(int i = 0; i <= 9; i++)
        {
            long copy = n; int c = 0;
            while(copy > 0)
            {
                if(copy%10 == i && c == 0)
                {
                    format = format*10 + copy%10;
                    c++;
                }
                copy /= 10;
            }
        }
        
        System.out.print(format);
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
