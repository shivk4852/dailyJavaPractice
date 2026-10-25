package TopPrograms;

import java.util.Scanner;

public class PalindromNumberCheck {
	
	public static void checkPalindromNumber(int num)
	{
		int palindrom=0;
		int originalNum=num;
		while(num>0)
		{
			int num2=num%10; //141
			palindrom=palindrom*10+num2	;//
			num=num/10;//141/2
			
		}
		
		if(palindrom==originalNum)
		{
			System.out.println("Number is palindrom :"+originalNum);
		}
		else
		{
			System.out.println("Number is not a Palindrom");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to check Palindrom");
		int num=sc.nextInt();
		checkPalindromNumber(num);
		sc.close();
	}

}
