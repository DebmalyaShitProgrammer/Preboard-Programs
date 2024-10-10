import java.util.*;
class Program5
{
    String reverse(String text)
    {
        String rev = "";
        
        for(int i = 0; i < text.length(); i++)
        {
            rev = text.charAt(i) + rev;
        }
        return rev;
    }
    
    void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of word: ");
        String arr[] = new String[sc.nextInt()];
        String word = "";
        
        System.out.println("Enter the reverse ASCII of each letter of the word: ");
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.next();
        
        for(int i = 0; i < arr.length; i++)
        {
            word += (char) Integer.parseInt(reverse(arr[i]));
        }
        
        System.out.print(word);
    }
}