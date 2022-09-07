import java.util.Scanner;

public class PatternPrinter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in .nextInt();
		patternPrinter(n);
	}
	
	static void patternPrinter(int n) {
		int count = n;
		int i=n;
		int rows=n;
		while (rows>0) {
			if(count>0) {
				System.out.print(i);
				count--;
			}else {
				i--;
				if(i==0) {
					rows--;
					System.out.println();
					i=n;
				}
				count=rows;
			}
		}
	} 
}
