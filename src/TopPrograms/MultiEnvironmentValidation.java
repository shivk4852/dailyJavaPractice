package TopPrograms;

public class MultiEnvironmentValidation {
	
	public static void main(String[] args) {
		
		String env = "PROD";
		boolean isSmokeSuite = true;
		boolean isWeekend = false;
		
//		Rules:
//			Smoke suite can run in any environment.
//			Regression suite cannot run in PROD.
//			No execution allowed on weekends.
		
		if (env.equalsIgnoreCase("PROD") && isSmokeSuite)
		{
		
			System.out.println("Run Smoke Suite");
			
			if(!isWeekend)
			{
				System.out.println("execution allowed");
			}
			else
			{
				System.out.println("No execution allowed");
			}
		}
		
		else
		{
			
			System.out.println("Regression suite can't run in Prod");
		}
		
		
	}

}
