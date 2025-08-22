import java.util.Scanner;

public class user{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Your Name: ");
		String name = input.nextLine();
		System.out.println("Good Morning " + name);

		System.out.println(name + ", Also tell me your age");
		int age = input.nextInt();
		System.out.println("Your age is : " + age);

		System.out.println("Welcome " +name + "to KG Coding");

		int a = 2;
		int b = 5;
		int c = a;
		a = b;
		b = c;
		System.out.println("The value of a is after swapping : "+a);
		System.out.println("The value of b is after swapping : "+b);

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

		float e = 2;
		float d = 5;
		System.out.println(e*d);
		System.out.println(1/2*a*b);

		int p = 2;
		int r = 5;
		int t = 2;
		System.out.println(p*r*t/100);

		Scanner number = new Scanner(System.in);
		System.out.println("Please Enter Number : ");
		String num = number.nextLine();

		if (num%2 = 0){
			println("Even no");
		}
		else
		{
			println("odd no");
		}
	}
}

/*import java.util.Scanner;

public class user{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter Your Name: ");
		String name = input.nextLine();
	}
}*/