package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount, win chance, win limit, and desired number of days:");
		double startAmount = in.nextDouble();
		double winChance = in.nextDouble();
		double winLimit = in.nextDouble();
		double currentMoney = startAmount;
		int desiredDays = in.nextInt();
		String winOrLose = "";

		
		
		
		int totalPlays = 0;
		int totalSimulations = 0;
		while (totalSimulations < desiredDays) {
			currentMoney = startAmount;
		while ((currentMoney < winLimit) && (currentMoney > 0)) {
			double randomNum = Math.random();
			boolean winRate = randomNum < winChance;
			if (winRate == true) {
				currentMoney++;
			} else {
				currentMoney--;
			}
			

			if (currentMoney == winLimit) {
				winOrLose = "Win";
			} else {
				winOrLose = "Lose";
			}
		
			totalPlays++;

		}
		

		totalSimulations++;
		System.out.println("Simulation: " + totalSimulations + " " + totalPlays + " " + winOrLose);
		}
		double expectedRuin = 0;
		double alpha = ((1 - winChance)/winChance);
		if (winChance == 0.5) {
			expectedRuin = 1 - (startAmount/winLimit);
		} else {
			expectedRuin = ((Math.pow(alpha, startAmount)) - (Math.pow(alpha, winLimit)))/(1-Math.pow(alpha,  winLimit));
		}
//		System.out.println("")


	}

}
