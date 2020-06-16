public class Pattern
{
  public static void main(String args[])
   {
     if(args.length==0)
     else
      {
       int num=Integer.parseInt(args[0]);
        int count=1;
      while(count<=num)
      
      { 
           for(int i=1;i<=count;i++)
             System.out.print("* ");
            System.out.println("");
           count=count+1;
       }
       }
   }
}