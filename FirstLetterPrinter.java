import java.util.Scanner;

public class FirstLetterPrinter {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		 Scanner in = new Scanner(System.in);
		 String input = in .nextLine();
		 System.out.println(firstLetterPrinter(input)); 
	}
	
	static String firstLetterPrinter(String str) {
		String[] newString = str.split(" ");
		String firstLetterString = "";
		for (int i=0; i<newString.length; i++) {
			firstLetterString += newString[i].charAt(0);
		}
		return firstLetterString;
	} 
}
