import java.util.Scanner;

/*public class recursion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to fibonacci series");
		System.out.println("Please enter the no of elements : ");
		int count = input.nextInt();
		for (int i = 1;i <= count ;i++) {
			System.out.println(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int position){
		if (position == 1) {
			return 0;
		}
		if (position == 2) {
			return 1;
		}
		return fibonacci(position - 1)+fibonacci(position - 2);
	}
}*/

public class recursion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to palindrome checker");
		System.out.println("Please enter the no of elements : ");
		String str = input.next();
		System.out.println("Your String is "+
		 ((isPalindrome(str) ? "palindrome":"not palindrome")));
	}

	public static boolean isPalindrome(String str){
		if(str.length() <= 1){
			return true;
		}
		int lastPos = str.length() - 1;
		if (str.charAt(0) != str.charAt(lastPos)) {
			return false;
		}
		String newStr = str.substring(1, lastPos);
		return isPalindrome(newStr);
	}
}