//this is edited file

import java.util.Scanner;
class fib
{
    public static void main(String []args)
    {
           int n1=0,n2=1,t,num;
        Scanner a =new Scanner(System.in);
        num=a.nextInt();
        System.out.println("enter a num");
        

     

        while (true)
        {
            t=n1+n2;
            if(t==num)
            {
                System.out.println("the no is fibonacchi ");
                break;

            }
            else if(t>num)
            {
                System.out.println("it is not a fib no");
                break;

            }
            n1=n2;
            n2=t;

        }


    }
}
