import java.util.*;
public class Program9
{
    String a[], b[];
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of word to input: ");
        a = new String[sc.nextInt()];
        b = new String[a.length];
        
        System.out.println("Enter the word: ");
        for(int i = 0; i < a.length; i++)
            a[i] = sc.next();
    }
    
    String convert(String p)
    {
        String format = "";
        int i;
        for(i = 0; i < p.length();)
        {
            if("AEIOUaeiou".indexOf(p.charAt(i)) == -1)
                format+= p.charAt(i++);
            else
                break;
        }
        format = p.substring(i, p.length()) + format + "ay";
        return format;
    }
    
    void change()
    {
        for(int i = 0; i < a.length; i++)
            b[i] = convert(a[i]);
    }
    
    void display()
    {
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        for(int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
    
    void main()
    {
        Program9 obj = new Program9();
        
        obj.input();
        obj.change();
        obj.display();
    }
}
