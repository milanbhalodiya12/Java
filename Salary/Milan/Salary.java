package Milan;
import Milan.*;

public class Salary
{
    User us=new User();
    public Salary()
    {
    int tax;
    int sal,ta, da,net_sal;
        if(us.salary < 10000)
        {
            ta = us.salary*5/100;
            da = us.salary*2/100;
            net_sal = us.salary + ta +da;
            System.out.println("Your TA on salary is : "+ta);
            System.out.println("Your DA on salary is : "+da);
            System.out.println("Your salary after tax is : "+net_sal);

        }
        else if(us.salary >=10000 && us.salary<=30000)
        {
            tax = us.salary*2/100;
            sal = us.salary-tax;
            ta = sal*5/100;
            da = sal*2/100;
            net_sal = sal + ta +da;
            System.out.println("Your tax on salary is : "+tax);
            System.out.println("Your TA on salary is : "+ta);
            System.out.println("Your DA on salary is : "+da);
            System.out.println("Your salary is : "+ net_sal);
        }
        else if(us.salary >30000 && us.salary <=50000)
        {

            tax = us.salary*4/100;
            sal = us.salary-tax;
            ta = sal*5/100;
            da = sal*2/100;
            net_sal = sal + ta +da;
            System.out.println("Your tax on salary is : "+tax);
            System.out.println("Your TA on salary is : "+ta);
            System.out.println("Your DA on salary is : "+da);
            System.out.println("Your salary is : "+ net_sal);
        }
        else
        {
            tax = us.salary*6/100;
            sal = us.salary-tax;
            ta = sal*5/100;
            da = sal*2/100;
            net_sal = sal + ta +da;
            System.out.println("Your tax on salary is : "+tax);
            System.out.println("Your TA on salary is : "+ta);
            System.out.println("Your DA on salary is : "+da);
            System.out.println("Your salary is : "+ net_sal);
        }
    }
}