
public class MonteCarloPi {
	public static void main(String[] args) {
		
		int inSquare = 0;
		int inCircle = 0;
		double approxPi = 3d;
		double grenze = Math.pow(10, -5);
		double x, y;

		
		while(Math.abs(approxPi - Math.PI) > grenze) {						//Solange die Abweichung > 10**-5 ist
			x = Math.random();
			y = Math.random();
			
			inSquare++;
			
			if(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {			//Wenn Wurzel aus x² + y² <= 1 ist, 
			inCircle++;														//ist der Punkt im Kreis.																
			}
			
			approxPi = 4*((double)inCircle / inSquare);
			System.out.printf("Iteration %d: %f\n", inSquare+1, approxPi);	//Ausgabe
		}
		
		
	}
}
