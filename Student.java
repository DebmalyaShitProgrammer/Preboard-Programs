import java.util.*;
class Student
{
    int roll;
    String name;
    Dates dob;

    Student()
    {
        dob = new Dates();
    }
    
    void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        roll = sc.nextInt();

        System.out.print("Enter name: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.println("Enter date of birth:");
        dob.accept();

        System.out.println("Enter the current date (or any given date):");
        Dates currentDate = new Dates();
        currentDate.accept();
        
        display(currentDate);
    }

    void display(Dates currentDate)
    {
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.print("Date of Birth: ");
        dob.display();

        int age = calculateAge(dob, currentDate);
        System.out.println("Age as of given date: " + age + " years");
    }

    int calculateAge(Dates dob, Dates currentDate)
    {
        int age = currentDate.yy - dob.yy;
        
        if (currentDate.mm < dob.mm || (currentDate.mm == dob.mm && currentDate.dd < dob.dd))
        {
            age--;
        }

        return age;
    }

    class Dates
    {
        int dd, mm, yy;

        void accept()
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter day (dd): ");
            dd = sc.nextInt();

            System.out.print("Enter month (mm): ");
            mm = sc.nextInt();

            System.out.print("Enter year (yyyy): ");
            yy = sc.nextInt();
        }

        void display() 
        {
            System.out.println(dd + "/" + mm + "/" + yy);
        }
    }
}