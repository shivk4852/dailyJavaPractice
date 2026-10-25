package TopPrograms;

public class RegexPatternPull {
	
	public static void main(String[] args) {
		
		String str="KuL&*256";
		char []a=str.toCharArray();
		//char a2=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			
		
		if(Character.isDigit(a[i])) //seprated number
		{
			System.out.println("Print the Number :"+a[i]);
		}
		
		else if(Character.isLowerCase(a[i])) //seprated lowercase
		{
			System.out.println ("Print lower Case char :"+a[i]);
		}
		else if(Character.isUpperCase(a[i])) //seprated upper case
		{
			System.out.println("Print upper case Char :"+a[i]);
		}
		else 
		{
		    	System.out.println("Print specila char :"+a[i]);
		}
		}
	}

}
