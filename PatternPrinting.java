package ArrayExamples;
import java.util.Scanner;
public class PatternPrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		int len = str.length();
		
		if (len % 2 == 0) {
			System.out.println("The given input is Even...");
		}
		else {
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if((i == j) || (i + j == len - 1)) {
					System.out.print(str.charAt(j));
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.println();
		}
		}
	}
}
