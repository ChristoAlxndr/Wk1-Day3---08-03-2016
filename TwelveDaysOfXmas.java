package com.classpractice;

public class TwelveDaysOfXmas {

	public static void main(String[] args) {

		for (int day = 1; day <= 12; day++)
		{
			System.out.print("\nOn the " + day);
			
//			Switch Day			
			switch (day) 
			{
				case 1:
					System.out.print("st");
					break;
				case 2:
					System.out.print("nd");
					break;
				case 3:
					System.out.print("rd");
					break;
				default:
					System.out.print("th");
			}
			System.out.println(" day of Christmas my true love " +
					"gave to me...");
			
			switch (day)
			{
			case 12:
				System.out.println("\t Twelve drummers drumming.");
			case 11:
				System.out.println("\t Eleven pipers piping.");
			case 10:
				System.out.println("\t Ten lords a-leaping.");
			case 9:
				System.out.println("\t Nine ladies dancing.");
			case 8:
				System.out.println("\t Eight maids a-milking.");
			case 7:
				System.out.println("\t Seven swans a-swimming.");
			case 6:
				System.out.println("\t Six geese a-laying.");
			case 5:
				System.out.println("\t FIVE GOLDEN RINGS.");
			case 4:
				System.out.println("\t Four calling birds.");
			case 3:
				System.out.println("\t Three French hens");
			case 2:
				System.out.println("\t Two turtle doves");
			default:
				System.out.println("\t (and) a partridge in a pear tree.");
			}
		}
		
	}

}
