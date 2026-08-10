import java.util.Scanner;
import java.util.Arrays;

//practice Question
/*public class Function{
	public static void main(String[] args){
		greet();
		sum();
		int ans = minus();
		System.out.println(ans);
		String pr = greeting();
		System.out.println(pr);
		int addition = plus(4,5);
		System.out.println(addition);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = input.next();
		String personalized = greet2(name);
		System.out.println(personalized);
	}

	public static void sum(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = input.nextInt();

		System.out.println("Enter Second Number : ");
		int num2 = input.nextInt();

		int add = num1+num2;
		System.out.println(add);
	}

	public static void greet(){
		System.out.println("Hello World");
	}

	public static int minus(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int first = input.nextInt();

		System.out.println("Enter Second Number : ");
		int second = input.nextInt();

		int sub = first - second;
		return sub;
	}

	public static String greeting(){
		String a = "How are you";
		return a;
	}

	public static int plus(int a, int b){
		int sum2 = a+b;
		return sum2;
	}

	public static String greet2(String name){
		String message = "Hello " + name;
		return message;
	}
}

public class Function{
	public static void main(String[] args){
		int a = 10;
		int b = 20;

		//swap two no code
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
}*/

/*public class Function{
	public static void main(String[] args){
		int[] arr = {0,10,20,30,40};
		change(arr);
		System.out.println(Arrays.toString(arr));

		fun();		
	}

	public static void change(int[] num){
		num[0] = 99;
	}

	public static void fun(int ...v){
		System.out.println(Arrays.toString(v));
	}
}*/

//when two function has same name but diff data type is called overloading
/*public class Function{
	public static void main(String[] args){
		fun(16);
		fun("Preeti");
		int add = sum(3,4);
		System.out.println(add);
		int addition = sum(4,5,6);
		System.out.println(addition);
	}

	public static void fun(int a){
		System.out.println(a);
	}

	public static void fun(String name){
		System.out.println(name);
	}

	public static int sum(int a, int b){
		return a + b;
	}

	public static int sum(int a, int b, int c){
		return a + b + c;
	}
}*/

//Q1 : smallest value
/*public class Function
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
    System.out.println("Enter First Number : ");
    double num1 = input.nextDouble();
    System.out.println("Enter Second Number : ");
    double num2 = input.nextDouble();
    System.out.println("Enter Third Number : ");
    double num3 = input.nextDouble();

    System.out.println("The Smallest Value is : "+ Math.min(Math.min(num1, num2), num3));
	}
}*/

//Q2 : Calculate Average
/*public class Function{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter First Number : ");
    double num1 = input.nextDouble();
    System.out.println("Enter Second Number : ");
    double num2 = input.nextDouble();
    System.out.println("Enter Third Number : ");
    double num3 = input.nextDouble();

    System.out.println("The Average is : "+ (num1 + num2 + num3)/3);
  }
}*/

//Q3 : Mid value of string
/*public class Function{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = input.nextLine();
		int pos;
		int len;
		if (str.length() % 2 == 0)
		{
			pos = str.length() / 2 - 1;
			len = 2;
		}
		else
		{
			pos = str.length() / 2;
			len = 1;
		}
		System.out.print("Middle character in the String : " + str.substring(pos, pos + len));
  }
}*/

//Q4 : Calculate Vowel in string
/*public class Function{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = input.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
			{
				count++;
			}
		}
		 System.out.print("Number of Vowels in the string: " + count);
  }
}*/

//Calculate Number of words in a sentence
/*public class Function{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
          for (int i = 0; i < str.length(); i++)
          {
            if (str.charAt(i) == ' ')
            {
              count++;
            }
          }
          count = count + 1; 
        }
        System.out.print("Number of words in the string : " +  count);
  }
}*/

//Sum of digits in a string
/*public class Function
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int digit = input.nextInt();
		sum_digits(digit);
	}
	public static void sum_digits(long n)
	{
		int res = 0;
		while(n > 0)
		{
			res += n % 10;
			n /= 10;
		}
		System.out.println("Sum : " + res);
	}	
}*/

//multiply two numbers without using operator
/*public class Function
{
	public static int multiple_numbera(int n1, int n2)
	{
		if (n2 == 0)
			return 0;      
		if (n2 > 0)
			return (n1 + multiple_numbera(n1, n2 - 1));            
		if (n2 < 0)
			return -multiple_numbera(n1, -n2);              
		return -1;
	} 
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		int n1 = input.nextInt();
		System.out.print("Enter the Number 2 : ");
		int n2 = input.nextInt();
		System.out.println("Multiply of Two Numbers : "+multiple_numbera(n1, n2));		
	}
 }*/

/*public class Function {
    public static void main(String[] args) {
        int totalUsers = 100;
        int usersWithoutSubmission = 20;
        int usersWithWrongSubmissions = 30;
        
        int[] result = calculateRatings(totalUsers, usersWithoutSubmission, usersWithWrongSubmissions);
        
        System.out.println("Users who will get a rating: " + result[0]);
        System.out.println("Users who will get a rating > 1000: " + result[1]);
    }

    public static int[] calculateRatings(int total, int noSubmission, int wrongSubmission) {
        int usersWithRating = total - noSubmission;
        int usersAbove1000 = usersWithRating - wrongSubmission;
        
        return new int[]{usersWithRating, usersAbove1000};
    }
}*/

/*public class Function{
	public static void main(String[] args){
		System.out.println(total(10.5, 20.0, 5.5));
	}

	public static double total(double... num){
		double sum = 0;
		for(double d : num)
			sum += d;
		return sum;
	}
}*/

/*public class Function{
	public static void main(String[] args){
		int[] nums = {10,20,30};
		System.out.println(average(nums));
	}

	public static double average(int[] arr){
		int sum = 0;
		for(int n : arr)
		sum += n;
		return (double) sum/arr.length;
	}
}*/

/*public class Function {
    static void printValues(String msg, int... values) {
        System.out.print(msg + ": ");
        for (int v : values)
            System.out.print(v + " ");
    }
    public static void main(String[] args) {
        printValues("Numbers", 1, 2, 3, 4, 5);
    }
}*/

/*public class Function {
	public static void main(String[] args) {
        System.out.println(formatMessage("Alice", 20, 98.5));
    }

    static String formatMessage(String name, int age, double score) {
        return "Name: " + name + ", Age: " + age + ", Score: " + score;
    }
}*/

/*public class Function {
	public static void main(String[] args) {
        Integer num = 50;
        changeValue(num);
        System.out.println(num);
    }
    static void changeValue(Integer n) {
        n = 100;
    }
}*/

/*public class Function{
	public static void main(String[] args){
		int add = 3 + 2;
		int mul = multiply(add);
		System.out.println(mul);
	}

	public static int multiply(int n){
		return n * n;
	}
}*/

/*public class Function {
    static int show(int x) {
        System.out.println("int version");
        return x;
    }
    static double show(double x) {
        System.out.println("double version");
        return x;
    }
    public static void main(String[] args) {
        show(10);
        show(10.5);
    }
}*/

/*public class Function {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(8)); // true
        System.out.println(isEven(5)); // false
    }
}*/
/*public class Function {
    static void modifyArray(int[] arr) {
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        modifyArray(numbers);
        System.out.println(numbers[0]);
    }
}*/

public class Function {
    static int[] calculate(int a, int b) {
        return new int[]{a + b, a * b};
    }
    public static void main(String[] args) {
        int[] result = calculate(3, 4);
        System.out.println("Sum = " + result[0] + ", Product = " + result[1]);
    }
}

















