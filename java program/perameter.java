import java.util.Scanner;
public class perameter{
		public static void main(String[] args) {
			System.out.println(add(4,7));
			System.out.println(add(8,7));
			System.out.println(add(-7,7));
			System.out.println(minus(-7,7));
			System.out.println(minus(9,7));

			Scanner input = new Scanner(System.in);
			System.out.println("What's your age : ");
			int age = input.nextInt();
			if (age<13) {
				System.out.println("child");
			}
			else if (age<20) {
				System.out.println("teen");
			}
			else if (age<60) {
				System.out.println("adult");
			}
			else{
				System.out.println("old");
			}

			Scanner inpt = new Scanner(System.in);
			System.out.println("What's your marks : ");
			int marks = input.nextInt();
			if (marks>90) {
				System.out.println("A");
			}
			else if (marks>80) {
				System.out.println("B");
			}
			else if (marks>70) {
				System.out.println("C");
			}
			else{
				System.out.println("D");
			}

			Scanner inp = new Scanner(System.in);
			System.out.println("What's your first number : ");
			int a = input.nextInt();

			System.out.println("What's your second number : ");
			int b = input.nextInt();

			System.out.println("What's your third number : ");
			int c = input.nextInt();
			if (a>=b && a>=c) {
				System.out.println("a is greatest no");
			}
			else if (b>=a && b>=c) {
				System.out.println("b is greatest no");
			}
			else if (c>=a && c>=b) {
				System.out.println("c is greatest no");
			}

			Scanner ins = new Scanner(System.in);
			System.out.println("What's year number : ");
			int year = input.nextInt();

			if (year % 400 == 0) {
				System.out.println("leap year");
			}
			else if (year % 100 == 0) {
				System.out.println("not leap year");
			}
			else if (year % 4 == 0) {
				System.out.println("leap year");
			}
			else
			{
				System.out.println("not leap year");
			}
		}

		public static int add(int one, int two){
			System.out.println("First no received : " +one);
			System.out.println("Second no received : " +two);
				int addition = one + two;
				return addition;
			}

			public static int minus(int first, int second){
			System.out.println("First no is : "+ first);
			System.out.println("Second no is : "+ second);
			int sub = first - second;
			return sub;
		}
	}



	/*Scanner input = new Scanner(System.in);
	System.out.println("What's your age : ");
	int age = input.nextInt();
	if (age>13) {
		System.out.println("child");
	}
	else if (age>20) {
		System.out.println("teen");
	}
	else if (age>60) {
		System.out.println("adult");
	}
	else{
		System.out.println("old");
	}*/

	/*Scanner input = new Scanner(System.in);
	System.out.println("Enter your first Number : ");
		int even = input.nextInt();
		if (even%2 == 0) {
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}*/
	
