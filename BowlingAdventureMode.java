package com.assignments;

public class BowlingAdventureMode {

	public static void main(String[] args) {

		int pins = 10;
		int frames = 10;
		int bowlsPerFrame = 2;

		System.out.println("Thank you for patronizing Xander Bowl. \n" + "Your score card is below. \n");

		for (int i = 0; i < frames; i++) {
			
			System.out.println("Frame" + ((i) +1) );

			for (int j = 1; j <= 1; j++) {
				int rollOne = (int) ((Math.random() * pins));
				int rollTwo = (int) ((Math.random() * (pins - rollOne)));

				if (rollOne == 10) {
					rollTwo = 0;
				}
				
				System.out.println(rollOne);
				System.out.println(rollTwo);
			}
			System.out.println("Frame " + (i + 1) + " score = " );
			System.out.println("\n");
		}
	}
}