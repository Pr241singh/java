import java.util.Scanner;

class test{

	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to table");
		System.out.println("Enter your number");
		int num = input.nextInt();
		table(num);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to addition of odd no");
		System.out.println("Enter your number : ");
		int sum = input.nextInt();
		int add = oddno(sum);
		System.out.println("your sum is : "+add);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to factorial no");
		System.out.println("Enter your number : ");
		int num = input.nextInt();
		long fact = factorial(num);
		System.out.println("your factorial of no is : "+fact);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to sum no");
		System.out.println("Enter your number : ");
		int num = input.nextInt();
		int sum = sumOfDigits(num);
		System.out.println("your sum of digit is : "+ sum);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to LCM");
		System.out.println("Enter your number : ");
		int first = input.nextInt();
		System.out.println("Enter your number : ");
		int second = input.nextInt();
		int lcm = lcm(first, second);
		System.out.println("your lcm of two no is : "+ lcm);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to GCD");
		System.out.println("Enter your number : ");
		int first = input.nextInt();
		System.out.println("Enter your number : ");
		int second = input.nextInt();
		int gcd = gcd(first, second);
		System.out.println("your lcm of two no is : "+ gcd);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Prime no");
		System.out.println("Enter your number : ");
		int first = input.nextInt();
		boolean prime = prime(first);
		if(prime)
		{
			System.out.println("This is a prime no");
		}
		else
		{
			System.out.println("This is not a prime no");
		}*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to reverse no");
		System.out.println("Enter your number : ");
		int num = input.nextInt();
		int reverse = reverse(num);
		System.out.println("Reverse of your no is : "+reverse);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to fibonacci series");
		System.out.println("Enter your number : ");
		int num = input.nextInt();
		System.out.println("your fibonacci series is");
		fibonacci(num);*/

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to palindrome series");
		System.out.println("Enter your value : ");
		int num = input.nextInt();
		int sum = reverse(num);
		System.out.println("your palindrome no is : " + sum);
		if (sum) {
			System.out.println("This is a palindrome");
		}
		else{
			System.out.println("This is not a palindrome");
		}

		/*int i =0;
		while(i <= 5)
		{
			System.out.println("*");
			i += 2;
		}*/
		
}


	public static boolean palindrome(int num){
		return num == reverse(num);
	}

	public static int reverse(int num){
		int sum =0;
		while(num > 0){
			int digit = num % 10;
			sum = sum*10 + digit;
			num /= 10;
		}
		return sum;
	}

	/*public static void fibonacci(int num){
		if (num < 0) return;
		System.out.println("0 ");

		if(num == 0) return;
		System.out.println(" 1 ");

		int first = 0;
		int second = 1;
		while(first + second <= num)
		{
			int third = first + second;
			System.out.println(third + " ");
			first = second;
			second = third;
		}

	}*/
	

	/*public static int reverse(int num){
		int sum = 0;
		while(num>0)
		{
			int digit = num%10;
			sum = sum*10 +digit;
			num /= 10;
		}
		return sum;
	}*/

	/*public static boolean prime(int first){
		int i = 2;
		while(i < first)
		{
			if (first % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}*/

	/*public static int gcd(int num1, int num2){

		int gcd = 1;
		int i = 2;
		int least = least(num1, num2);
		while(i <= least){
			if(num1 % i == 0 && num2 % i == 0)
			{
				gcd = i;
			}
			i++;
		}
		return gcd;
	}

	public static int least(int num1, int num2){
		if(num1<num2){
			return num1;
		}
		else
		{
			return num2;
		}
	}*/

	/*public static int lcm(int first, int second)
	{
		int i = 1;
		while(i <= second)
		{
			int factor = first * i;
			if (factor % second == 0) {
				return factor;
			}
			i++;
		}
		return 0;
	}*/



	/*public static int sumOfDigits(int num)
	{
		int sum = 0;
		while(num>0)
		{
			sum += num%10;
			num /= 10;
		}
		return sum;
	}*/
	

/*public static long factorial(int num){
	if (num<2) {
		return 1;
		}	
	long fact = 1;
	long i = 2;
	while(i<=num)
	{
		fact *= i;
		i++;
	}
	return fact;
}*/

/*public static int oddno(int sum)
{
	int add = 0;
	int i = 1;
	while(i<=sum)
	{
		System.out.println(add += i);
		i += 2;
	}
	return add;
}*/


	/*public static void table(int num)
	{
		int i = 1;
		while(i<=10)
		{
			System.out.println(num + " X " + i +" = " + i*num);
			i++;
		}
	}*/
}