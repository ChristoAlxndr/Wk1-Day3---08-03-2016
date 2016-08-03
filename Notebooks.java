package com.classpractice;

public class Notebooks {

	public static void main(String[] args) {
	
			boolean doWeHaveAllTheNotebooks = true;
			
//Went to count books and found one missing.
//Now doWeHaveAllTheNotebooks is false.
			doWeHaveAllTheNotebooks = false;
			
			String whatHappened = notebook(doWeHaveAllTheNotebooks);
			
			System.out.println(whatHappened);
			System.out.println(notebook(doWeHaveAllTheNotebooks));
			
			String doThisNext = whatHappened + "\nDo you know where book is?";
			
			System.out.println(doThisNext);
	}
	
	public static String notebook(boolean isLost) {
		
		String whatToDoNow = null;
		
		if (isLost) {
			whatToDoNow = "Good, we have all the books.";
		} 
		else 
			{
				whatToDoNow = "Ask the students.";
			}
		
		return whatToDoNow;
	}

}
