

public class Wordle {
	
	public static void main(String[] args) {
		
		String solution = "TASSE";		//gesuchtes Wort
		String input;
		String print = null;
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Please enter exactly 5 letters");
			input = new java.util.Scanner(System.in).nextLine();		//Eingabe des Users
			
			if(input.length() != 5) {									//Prüfung ob genau 5 Zeichen, wenn nicht dann Meldung. 
				System.out.println("The word has exactly 5 letters!");	//Falsche Eingabe wird nicht als Versuch gezählt.
				i--;
				continue;
			}
			
			if(solution.equals(input.toUpperCase())) {								//Gefunden
				System.out.println("You guessed right!");
				break;
			}
			
			print = "";
			
			for(int j = 0; j < 5; j++) {								
			
				char c = Character.toUpperCase(input.charAt(j));		//Holt einzelne chars aus Eingabewort		
																		
				if( c == solution.charAt(j)) {							//Wenn Zeichen an Pos. i stimmt	
					print += c;
				}
				else if(solution.contains("" + c)) {					//Wenn Zeichen in Wort enthalten
					print += '?';
				}
				else													//sonst
					print += '!';		
			}
			System.out.printf("%s%s", print, (i == 5) ? "\nNo tries left!" : "\n");
		}
		
	}
}
