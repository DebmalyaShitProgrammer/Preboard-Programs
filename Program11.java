import java.util.*;
public class Program11
{
    int a[], b[][], row, col;
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix dimensions: ");
        b = new int[sc.nextInt()][sc.nextInt()];
        a = new int[b[0].length];
        System.out.print("Enter the elements: ");
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
    }
    
    void sort()
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length - i - 1; j++)
            {
                if(a[j + 1] < a[j])
                {
                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
        }
    }
    
    void extract()
    {
        a = new int[b[0].length];
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                a[j] = b[i][j];
            }
            sort();
            for(int j = 0; j < a.length; j++)
            {
                b[i][j] = a[j];
            }
        }
    }
    
    void display()
    {
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    void square()
    {
        if(b.length == b[0].length)
        {
            int i, j, k, t = b.length-2, p;
            for(i = 0; i < a.length; i++)
            {
                if(i <= b.length/2)
                {
                    for(j = 0; j <= i; j++)
                        System.out.print(b[i][j]);
                    j = i == b.length/2 ? a.length-2 : a.length-1-i;
                    for(p = 1; p <= t; p++)
                        System.out.print(" ");
                    for(; j < a.length; j++)
                        System.out.print(b[i][j]);
                    t -= 2;
                }
                if(i == b.length/2)
                    t = 1;
                if(i > b.length/2)
                {
                    for(j = 0; j < b.length-i; j++)
                        System.out.print(b[i][j]);
                    for(p = 1; p <= t; p++)
                        System.out.print(" ");
                    t += 2;
                    for(j = i; j < b.length; j++)
                        System.out.print(b[i][j]);
                }
                System.out.println();
            }
        }
        else
            System.out.print("It is not a square matrix");
    }
}