// Varun Batra 110256128
import java.util.Scanner;
public class pyramidNumber2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lines");
		int n = scan.nextInt();
		   for (int i = 0; i < n; i++) {
		        for (int h = n - i; h > 0; h--) {
		            System.out.print("    "); 
		        }
		        for (int j = 0; j <= i; j++) { // "left side" of pyramid
		            System.out.printf("%3d ", 1 << j); 
		        }
		        for (int k = i - 1; k >= 0; k--) { // "right side" of pyramid
		            System.out.printf("%3d ", 1 << k); 
		        }
		        System.out.println();
		    }
		}

	}


