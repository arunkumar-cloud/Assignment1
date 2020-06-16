public class Palindrome {

	public static void main(String[] args) {
		String ip=args[0];
		StringBuffer sb=new StringBuffer(ip);
		String rev=sb.reverse().toString();
		if(ip.equals(rev))
			System.out.println(ip+" is  a palindrome");
		else
			System.out.println(ip+" is not a palindrome");
	}

}