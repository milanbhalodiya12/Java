import java.util.*;
class First
{
    First()
    {
        for(int a=1; a<=25; a++)
        {
            if (a%2==0)
            {
                System.out.println("The number "+a+" is even");   
            }
            else
            {
                System.out.println("The number "+a+" is odd");    
            }
        }
    }
}

class Second extends First
{
    Second()
    {
        int b = 15;
        int count = 1;
        while (count <=10)
        {
            int ans;
            ans = b * count;
            System.out.println(b+"x"+count+"="+ans );
            count ++;
        }
    }
}

public class Even {
    public static void main(String[] args) {
    Second s = new Second();
    }
}
