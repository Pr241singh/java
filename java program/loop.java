import java.util.Scanner;

public class loop{
	public static void main(String[] args) {

		greet();
		int first = readNumber();

		int second = readNumber();
		int sum = first+second;
		System.out.println(sum);
	}

		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter first number");

		//int num = input.nextInt();
		/*int num = 1;
		while(num<11)
		{
			System.out.println(num);
			num += 1;
		}

		int number = 11;
		while(number>=1)
		{
			System.out.println(number);
			number -= 1;
		}

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int table = input.nextInt();
		int i = 1;
		while(i<=10)
		{
			System.out.println(i*table);
			i += 1;
		}

		/*Scanner inpt = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int sum = input.nextInt();
		int odd;

		while(odd<=sum)
		{
			if(odd != 0) {
				System.out.println(sum+odd);
				odd += 1;
			}
		}*/

		/*int rows = 0;
		while (rows<5) {
			System.out.print("*");
			int pattern = 0;
			while (pattern<rows) {
				System.out.print("*");
				pattern++;
			}
			System.out.println();
			rows++;
		}*/

		public static int readNumber() {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter no : ");
			int number = input.nextInt();
			return number;
		}

		public static void greet() {
			System.out.println("Welcome to calculator\n");
		}
	}

	
