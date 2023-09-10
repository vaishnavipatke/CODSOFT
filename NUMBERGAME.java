package numberprogram;

import java.util.Random;

import java.util.Scanner;



public class NumberProgram {

		
		public static void main(String[] args) {
			
			
			for(;;) {
				System.err.println("_________WELCOME TO  NUMBER GAME__________");
				System.out.println();
				System.out.println();
				
			System.out.println("      1.PLAY GAME"
					+ "  2.EXIT GAME");
			Scanner sc = new Scanner(System.in);
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
			{
				NumberProgram.game(1);
				break;
			}
		
			case 2:
			{
				
				System.exit(0);
			}
				
				
			}
			}
		}
		 public static void game(int a) {
			 
			 System.out.println("YOU  HAVE 3 CHANCE TO GUESS THE CORRECT NUMBER BETWEEN 1-6");

				
		
					for (int i = 1; i <= 3; i++) {
						Random random = new Random();
						Scanner sc = new Scanner(System.in);
						int ans = random.nextInt(7);
						System.err.println("guess the number");
						int guess = sc.nextInt();
						if (ans == guess) {
							System.err.println("YOU_WON..your guess is correct");
							return;
						} else if (guess < ans) {
							System.out.println("your guess is too low");
		
						} else if (guess > ans) {
							System.out.println("your guess is too high");
		
						}
		
		
					}
					System.err.println("game over");
		
				
		}
	}


