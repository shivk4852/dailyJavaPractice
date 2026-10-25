package TopPrograms;

import java.util.Scanner;

public class StringPalindrom {
	
	public static void checkStringIsPalindrom(String str)
	{
		String OriginalString=str;
		
		String reverString="";
		for(int i=0;i<=str.length()-1;i++)
		{
			reverString=str.charAt(i)+reverString;
		}
		
		if(reverString.equals(OriginalString))
		{
			System.out.println("String is palindrom :"+str);
		}
		else {
			System.out.println("String is not palindrom");
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the String");
		String str=sc.next();
		checkStringIsPalindrom(str);
	}

}
