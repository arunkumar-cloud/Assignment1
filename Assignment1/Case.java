public class Case {
	public static void main(String[] args) {
		     char ch=args[0].charAt(0);
		     int i=(int)ch;
		      if((i>=65 && i<=90) )
		      {
		    	  i=i+32;
		    	  char c=(char)i;
		       System.out.println(c);
		      }
		     else  
		     {
		    	 i=i-32;
		    	 char c=(char) i;
		        System.out.println(c);
		     } 
	}

}