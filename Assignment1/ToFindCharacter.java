public class ToFindCharacter
{
  public static void main(String args[])
   {
     char ch=' ';
     int i=(int)ch;
     if(i>=48 && i<=57)
       System.out.println("Digit");
     else if((i>=65 && i<=90) || (i>=97 && i<=112))
       System.out.println("Alphabhet");
     else
        System.out.println("Special Character");
   }
}