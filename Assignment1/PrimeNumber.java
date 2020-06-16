public class PrimeNumber
{
  public static void main(String args[])
  {
    int num=Integer.parseInt(args[0]);
    if(num==0 || num==1)
    System.out.println("not a prime number");
    else
    {
       int n=num/2;
       int count=0;
       for(int i=2;i<=n;i++)
      {
        if(num%n==0)
            count++;
       }
        if(count>0)
          System.out.println("not a prime number");
         else
           System.out.println("prime number");
     }
  }
} 