import java.util.Scanner;

public class MissingNumberFinder {

	public static void main(String[] args) {
			 @SuppressWarnings("resource")
			 Scanner in = new Scanner(System.in);
			 int size = in.nextInt();
			 int[] arr = new int[size - 1];
			 for (int i = 0; i < size - 1; i++) arr[i] = in .nextInt();
			 System.out.println(missingNumberFinder(arr, size)); 
		
	}

	 static int missingNumberFinder(int array[], int n) {
		 	int i=1;
		 	while(i<=n) {
		 		if(toBeChecked(i, array)) {
		 			i++;
		 		}else {
		 			break;
		 		}
		 	}
		 	return i;
	}
	 
	static boolean toBeChecked(int value, int array[]) {
		for(int b:array) {
			if(b==value) {
				return true;
			}
		}
		return false;
	}
}
