import java.util.*;
class Process
{
    Scanner sc = new Scanner(System.in);
    int no , sqr, s_r, c,temp;
    Process()
    {
        System.out.println("Enter a number : ");
        no = sc.nextInt();

    }
    void Perform()
    {
        temp = no;
        sqr = temp * temp;
        while(temp >0)
        {
            temp = temp / 10;
            c++;
        }
        s_r = sqr%(int)Math.pow(10,c);
        if(s_r == no)
        {
            System.out.println("The number "+no+" is Automorphic");

        }
        else
        {
            System.out.println("The number "+no+" is not a Automorphic");

        }

    }
}

class Auto
{
    public static void main(String[] args)
    {
        Process p = new Process();
        p.Perform();
    }
}