package TopPrograms;

public class PrimeNumber {
public static void main(String[] args) {
	
	int num=17;
	 boolean isPrime=true;
	 
	 if(num<=1) {
		 
		 isPrime=false;
	 }
	 else {
		 
		 for(int i=2;i<num/2;i++)
		 {
			 
			 if(i%2==0) {
				 
				 isPrime=false;
				  
			 }
		 }
	 }
      if(isPrime) {
		 
		 System.out.println("Number is Prime");
	 }
      else {
    	  System.out.println("Number is not Prime");
      }
		 
	 }
	 
	}


