import java.util.*;
public class Search
{
    String a, b;

    Search(String a, String b)
    {
        this.a = a.trim() + " ";
        this.b = b.trim() + " ";
    }

    void find1()
    {
        String wordA = "";
        System.out.println("Common words: ");
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != ' ')
                wordA += a.charAt(i);
            else
            {
                String wordB = "";
                for(int j = 0; j < b.length(); j++)
                {
                    if(b.charAt(j) != ' ')
                        wordB += b.charAt(j);
                    else
                    {
                        if(wordA.equalsIgnoreCase(wordB))
                            System.out.println(wordA);
                        wordB = "";
                    }
                }
                wordA = "";
            }
        }
    }

    void find2()
    {
        String word = "", maxword = "";
        int maxlen = 0;
        System.out.print("Longest words: ");
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != ' ')
                word += a.charAt(i);
            else
            {
                if(word.length() >= maxlen)
                {
                    maxword = word;
                    maxlen = word.length();
                }
                word = "";
            }
        }
        System.out.print(maxword + "(" + maxlen + ")" + "\t");
    }

    void test()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first sentence (a):");
        String A = sc.nextLine();

        System.out.println("Enter the second sentence (b):");
        String B = sc.nextLine();

        Search obj = new Search(A, B);
        obj.find1();
        obj.find2();
    }
}
