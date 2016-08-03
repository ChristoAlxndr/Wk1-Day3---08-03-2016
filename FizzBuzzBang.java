package com.classpractice;

public class FizzBuzzBang {

	public static void main(String[] args) {

		//FizzBuzzBang
		//Test if 3 is cleanly divisible - Replace w/ Fizz
		//Test if 5 is cleanly divisible - Replace w/ Buzz
		//Test if 7 is cleanly divisible - Replace w/ Bang
		
		for (int i = 1; i <= 110; i++) {
			
			if  (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("FIZZ BUZZ BANG");
			}
			
			else if (((i  % 5) == 0) && ((i % 7) == 0)) {
				System.out.println("BUZZ BANG");
			}
			
			else if (((i % 3) == 0) && ((i % 7) == 0)) {
				System.out.println("FIZZ BANG");
			}
			
			else if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.println("FIZZ BUZZ");
			}
			
			else if ((i % 7) == 0) {
				System.out.println("BANG");
			}
			
			else if ((i % 5) == 0) {
				System.out.println("BUZZ");
			}
			
			else if ((i % 3) == 0) {
				System.out.println("FIZZ");
			}
			
			else {			
			System.out.println(i);
			}
		
		}

	}

}
