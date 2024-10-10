import java.util.*;
public class Time
{
    int hh, mm;
    Time()
    {}
    
    void readtime()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter time (hh/mm): ");
        hh = sc.nextInt();
        mm = sc.nextInt();
    }
    
    Time addtime(Time X)
    {
        Time temp = new Time();
        
        temp.hh = this.hh + X.hh;
        temp.mm = this.mm + X.mm;
        
        if(temp.mm > 60)
        {
            temp.mm %= 60;
            temp.hh++;
        }
        return temp;
    }
    
    Time difftime(Time X)
    {
        Time temp = new Time();
        
        temp.hh = Math.abs(this.hh - X.hh);
        temp.mm = Math.abs(this.mm - X.mm);
        
        return temp;
    }
    
    void disptime()
    {
        System.out.println(hh + " hours " + mm + " minutes");
    }
    
    void main()
    {
        Time A = new Time();
        Time B = new Time();
        
        A.readtime();
        B.readtime();
        
        Time C = A.addtime(B);
        Time D = A.difftime(B);
        
        System.out.print("Sum: ");C.disptime();
        System.out.print("Difference: ");D.disptime();
    }
}
