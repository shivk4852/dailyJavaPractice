package TopPrograms;

public class ReverseStringOnSamePlace {
	
	 public static void main(String[] args) {
	       
	        String str="My Name is Shiv";
	          String[] NewStr=str.split(" ");
	         
	          for(int i=0;i<NewStr.length;i++) {
	        	  
	        	  String withoutSpace = NewStr[i];
	        	  //System.out.println(withoutSpace);
	        	  String reverse="";
	        	  for(int j=withoutSpace.length()-1;j>=0;j--)
	        	  {
	        
	        		  reverse=reverse+withoutSpace.charAt(j);
	        		  
	        	
	        	  }
	        	  System.out.print(reverse+" ");
	         
	          }
	          
	    }

}
