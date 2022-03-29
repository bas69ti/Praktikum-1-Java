import java.util.regex.Pattern;

public class RFactor {
	public static void main(String[] args) {
		
		double infected = 100, rFactor = 1.1;
		int iterations = 10;
		
		if(args.length != 3) {										//Prüft ob genau 3 Parameter
			System.out.println("Wrong number of parameters!");
			System.exit(-1);
		}	
		for(int i = 0; i < args.length; i++) {								//Prüft ob die eingaben Zahlen sind. Akzeptiert Ganz-& Fließkommazahlen
			if(!Pattern.matches("([0-9]*[.])?[0-9]+", args[i])) {
				System.out.println("parameters must be numbers!");
				System.exit(-1);
			}			
		}
		
		
		infected = Double.parseDouble(args[0]);						//Zuweisung der Kommandozeilenparameter
		rFactor = Double.parseDouble(args[1]);
		iterations = Integer.parseInt(args[2]);
		
		System.out.printf("Initial: %f\n", infected);
		
		for(int i = 1; i <= iterations; i++) {						//Ausgabe
			infected *= rFactor;
			
			System.out.printf("Iteration %d: %f\n", i, infected);
			
			if(infected < 0.1) {
				System.out.println("The pandemic is over!");
				break;
			}
		}
		
	
	}
}
