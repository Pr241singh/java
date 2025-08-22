import java.util.Scanner;

/*public class dowhile{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			/*System.out.println("Enter your age : ");
			int age = input.nextInt();
			while(age < 0 || age > 100){
				System.out.println("Enter your age : ");
				 age = input.nextInt();
			}*/
			/*int age;
			do{
				System.out.println("Enter your age : ");
				age = input.nextInt();
			}while(age < 0 || age > 100);
			System.out.println("your age is : "+ age);*/
//	}
//}

	/*public class dowhile{
	public static void main(String[] args){
		for (int i=1;i<=100 ;i++) {
			System.out.println(i + " ");
		}
	}
}*/

/*public class dowhile{
	public static void main(String[] args) {
		String[] array = new String[]{
			"Ram", "Shyam", "Mohan", "Sita", "Geeta", "Sohan"
		};
		printArrayforEach(array);
	}

	public static void printArrayforEach(String[] array){
		for(String name : array){
			System.out.println(name);
		}
	}*/

	/*public static void printArray(String[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}*/
//}

	/*public class dowhile{
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to factorial generator ");
			System.out.println("Enter your no : ");
			int num = input.nextInt();
			long fact = factorialIterative(num);
			System.out.println("Factorial is : "+ fact);
		}
//recursion
		public static long factorialIterative(int num){
			System.out.println("called for : " + num);
			if(num == 1){
				return 1;
			}
			return num * factorialIterative(num - 1);
		}*/

		/*public static long factorialIterative(int num){
			long result = 1;
			for (int i = 1;i <= num;i++) {
				result *= i;
			}
			return result;
		}*/
	//}

		/*public class dowhile{
			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Welcome to set your password");
				String Pass;
				do{
					System.out.println("Please enter your password : ");
					pass = input.next();
				}while(!isValidPass(pass));
				System.out.println("Thanks fo entering a valid password");
			}

			public static boolean isValidPass(String pass){
				return pass.length() > 6;
			}
		}*/

		/*public class dowhile{
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				int num = 5, guess; 
				System.out.println("Welcome to no guessing game");
				do{
					System.out.println("Please enter your no : ");
					guess = input.nextInt();
				}while(num != guess);
				System.out.println("You have succesfully guess the no");
			}
		}*/

		/*public class dowhile{
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				System.out.println("Welcome to table no ");
				System.out.println("Enter your no : ");
				int num = input.nextInt();
				table(num);
			}

			public static void table(int num){
				for (int i=1;i<=10 ;i++ ) {
					System.out.println("Your table is : "+num+" x "+i+" = "+i*num);
				}
			}
		}*/

		/*public class dowhile{
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				System.out.println("Welcome to prime no checker");
				System.out.println("Enter your no : ");
				int num = input.nextInt();
				boolean isPrime = isPrime(num);
				System.out.println("Your no is : "+(isPrime?"Prime":"Not prime"));
			}

			public static boolean isPrime(int num){
				for (int i=2;i< num;i++) {
					if(num% i == 0){
						return false;
					}
				}
				return true;
			}
		}*/

		/*public class dowhile{
			public static void main(String[] args){
				Scanner input = new Scanner(System.in);
				int[] arr = dowhile.inputArray();
				int max = Integer.MIN_VALUE;
				for (int num: arr) {
					if(max < num){
						max = num;
					}
				}

				System.out.println("Max no is : "+max);
			}

		public static int[] inputArray(){
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the no of elements : ");
			int size = input.nextInt();
			int[] nums = new int[size];
			int i = 0;
			while(i < size)
			{
				System.out.println("Please enter the no of elements " + (i+1) + " : ");
				nums[i] = input.nextInt();
				i++;
			} 
			return nums;
		}
	}*/

		/*public class dowhile{
			public static void main(String[] args){
				System.out.println("Welcome to array positive no.");
				int[] numArr = dowhile.inputArray();

				int sum = 0;
				for(int nums : numArr){
					if(nums < 0){
						continue;
					}
					sum += nums;
				}
				System.out.println("The sum is : "+ sum);
			}

				public static int[] inputArray(){
				Scanner input = new Scanner(System.in);
				System.out.println("Please enter the no of elements : ");
				int size = input.nextInt();
				int[] nums = new int[size];
				int i = 0;
				while(i < size)
				{
					System.out.println("Please enter the no of elements " + (i+1) + " : ");
					nums[i] = input.nextInt();
					i++;
				} 
				return nums;
			}
		}*/


