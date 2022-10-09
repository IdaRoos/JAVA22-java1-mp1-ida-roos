package miniprojekt1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			while (true) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int random = (int) Math.round(Math.random() * 100);
			//System.out.println(random); // See the random number
			int guesses = 0;
			System.out.println("Guess the number between 0 to 100");
			int input = -1;
	
		

			while (!guessGame(input,random)) {
				
				 input = sc.nextInt();
				 guesses++;
				

					if (input > random ) {
						System.out.println("Wrong, it's lower");
					
					}

					else if (input < random) {
						System.out.println("Wrong, it's higher");
					}
			}
				
				if (guesses == 1) {
				System.out.println("Correct! You guessed " + guesses + " time");
			}
			
			else {
				
			System.out.println("Correct! You guessed " + guesses + " times");
			
			}
				

			}
			}
		

		public static boolean guessGame(int x, int y) {

			return (x == y);

		}

	
	}


