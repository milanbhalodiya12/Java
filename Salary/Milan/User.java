package Milan;
import java.util.*;

public class User
{
    int salary;
    public User()
    {
        System.out.println("--------------Enter Your Details--------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your post : ");
        String post = sc.nextLine();
        System.out.print("Enter your city : ");
        String city = sc.nextLine();
        System.out.print("Enter your Mobile number : ");
        long mobile = sc.nextInt();
        System.out.print("Enter your Salary : ");
        salary = sc.nextInt();
        System.out.println("--------------Your Details are--------------");
        System.out.println("Name is : "+name);
        System.out.println("Post is : "+post);
        System.out.println("City is : "+city);
        System.out.println("Mobile is : "+mobile);
        System.out.println("Salary is : "+salary);

        
    }
}