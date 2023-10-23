//java program to check the number is special or not
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int n1=sc.nextInt();
        int temp=n1;
        int sum=0;
        while(temp!=0)
        {
            int a=temp%10;
            int fact= 1;
            for(int i=1; i<=a; i++)
            {
              fact= fact*i;  
            }
            sum= sum+fact;
            temp=temp/10;
        }
       if(sum==n1)
       {
                   System.out.print("special no");
       }
       else
       {
                   System.out.print("not special");
       }
    }
}
