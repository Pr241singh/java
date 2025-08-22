import java.util.Scanner;

/*public class ternary{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to no checker");
		System.out.println("Enter your first no : ");
		int day = input.nextInt();
		newSwitch(day);
		//int num1 = input.nextInt();
		//System.out.println("Enter your second no : ");
		//int num2 = input.nextInt();

		/*int greaternum
		if(num1 > num2){
			greaternum = num1;
		}
		else{
			greaternum = num2
		}*/

//ternary operator
		//int greaternum = num1 > num2 ? num1 : num2;
		//System.out.println(greaternum + " is the greatest");

		/*switch(day){
			case 1 : 
			System.out.println("Monday");
			break;
			case 2 : System.out.println("Tuesday");
			break;
			case 3 : System.out.println("Wednesday");
			break;
			case 4 : System.out.println("Thrusday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6 : System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			case 8 : System.out.println("Invalid Day");
			break;
		}*/
	//}

	/*public static void newSwitch(int day){
		String dayStr = switch(day){
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			case 3 -> "Wednesday";
			case 4 -> "Thrusday";
			case 5 -> "Friday";
			case 6 -> "Saturday";
			case 7 -> "Sunday";
		};
		System.out.println(dayStr);
	}*/
//}

	/*class ternary{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to finding minimum\n");
			System.out.println("Enter your first no : ");
			int num1 = input.nextInt();
			System.out.println("Enter your second no : ");
			int num2 = input.nextInt();
			ternary minternary = new ternary();
			int min = minternary.min(num1, num2);
			System.out.println("Minimum no is : " + min);
		}

		public int min(int num1, int num2){
			return num1 < num2 ? num1 : num2;
		}
	}*/

	/*class ternary{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to odd & even checker");
			System.out.println("Enter your first no : ");
			int num = input.nextInt();
			String result = num % 2 == 0 ?"even" : "odd"; 
			System.out.println("your Number is : "+ result);
		}
	}*/

	/*class ternary{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to absolute checker");
			System.out.println("Enter your first no : ");
			int num = input.nextInt();
			int result = num >= 0 ? num : -num;
			System.out.println("your absolute no is : "+ result);
		}
	}*/

	/*class ternary{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to grade checker");
			System.out.println("Enter your percentage : ");
			int num = input.nextInt();
			String result = num >= 80 ? "High" : (num > 50 ? "Morderate" : "Low");
			System.out.println("your grade is : "+ result);
		}
	}*/

	class ternary{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to calculator");
			System.out.println("Enter your first no : ");
			int num1 = input.nextInt();
			System.out.println("Enter your second no : ");
			int num2 = input.nextInt();
			System.out.println("Now Enter the operation : ");
			String operation =input.next();

			int result = switch(operation){
				case "+" -> num1 + num2;
				case "-" -> num1 - num2;
				case "*" -> num1 * num2;
				case "/" -> num1 / num2;
				default -> -1;
			};

			System.out.println("your answer is : "+ result);
		}
	}