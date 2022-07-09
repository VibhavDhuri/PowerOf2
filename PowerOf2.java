import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Enter the power you want to raise 2 till: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int base = 2, exponent = num;

		int result = 1;
		if (num <= 31) {
			while (exponent != 0) {
				result *= base;
				--exponent;
			}

			System.out.println("Answer = " + result);
			if (((result % 4 == 0) && (result % 100 != 0) || (result % 400 == 0)))
				System.out.println("Specified year is a leap year.");
			else
				System.out.println("Specified year is not a leap year.");
		} else {
			System.out.println("Error! The number provided is overflowing the int datatype.");
		}
	}

}
