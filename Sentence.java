import java.util.*;
public class Sentence
{
    String WD, sen, arr[];
    
    Sentence()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        sen = sc.nextLine().trim() + " ";
        int c = 0;
        for(int i = 0; i < sen.length(); i++)
        {
            if(sen.charAt(i) == ' ')
                c++;
        }
        
        arr = new String[c];
    }
    
    void extract()
    {
        String word = "";
        int c = arr.length-1;
        for(int i = 0; i < sen.length(); i++)
        {
            if(sen.charAt(i) != ' ')
                word += sen.charAt(i);
            else
            {
                arr[c--] = word;
                word = "";
            }
        }
    }
    
    void sort()
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j].compareTo(arr[j + 1]) > 0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    void search(String word)
    {
        WD = word;
        int l = 0, r = arr.length - 1, f = -1;

        while (l <= r)
        {
            int m = (l+r)/2;

            if (arr[m].equals(WD))
            {
                f = m;
                break;
            }
            else if (arr[m].compareTo(WD) < 0)
                l = m + 1;
            else
                r = m - 1;
        }

        if (f != -1)
            System.out.println("The word '" + WD + "' is found at index " + (f+1) + ".");
        else
            System.out.println("The word '" + WD + "' is not found.");
    }
    
    void create()
    {
        Scanner sc = new Scanner(System.in);
        Sentence obj = new Sentence();
        
        obj.extract();
        obj.sort();
        
        System.out.print("Enter a  word to find: ");
        String word = sc.next();
        
        obj.search(word);
    }
}
