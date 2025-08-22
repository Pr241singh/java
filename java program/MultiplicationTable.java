import java.util.Scanner;

class MultiplicationTable{

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to multiplication table\n");
		System.out.println("Enter your number");
		int num = input.nextInt();
		multiplicationTable(num);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to addition\n");
		System.out.println("Enter your number");
		int num = input.nextInt();
		int sum = addition(num);
		System.out.println("your sum of odd no is : "+sum);*/

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to factorial\n");
		System.out.println("Enter your number");
		int num = input.nextInt();
		long fact = factorial(num);
		System.out.println("your factorial no is : "+fact);
	}

	public static long factorial(int num){
		if (num<2) {
			return 1;
		}
		long fact = 1;
		long i = 2;
		while(i<=num){
			fact *= i;
			i++;
		}
		return fact;
	}

	/*public static int addition(int num){
		int sum = 0;
		int i = 1;
		while(i<=num)
		{
			sum += i;
			i += 2;
		}
		return sum;
	}*/


	/*public static void multiplicationTable(int num){
		int i = 1;
		while(i<=10){
			System.out.println(num + " X " +i +" = "+ i*num);
			i++;
		}
	}*/
}

