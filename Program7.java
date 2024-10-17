import java.util.*;
public class Program7
{   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine() + " ";
        String word = "", format = "";
        
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) != ' ')
                word += sentence.charAt(i);
            else
            {
                String s1 = "", s2 = "";
                for(int j = 0; j < word.length(); j++)
                {
                    if("AEIOUaeiou".indexOf(word.charAt(j)) != -1)
                        s1 += word.charAt(j);
                    else
                        s2 += word.charAt(j);
                }
                
                format += (s1+s2) + " ";
                word = "";
            }
        }
        
        System.out.print(format);
    }
}
