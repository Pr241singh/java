import java.util.Scanner;

/*public class min{
	public static void main(String[] args) {
		System.out.println("Welcome to Array sorting\n");
		int[] numArr = min.inputArray();
		boolean inc = inc(numArr);
		boolean dec = dec(numArr);
		if(inc || dec){
			System.out.println("your array is sorted");
		}
		else
		{
			System.out.println("your array is not sorted");
		}
	}

	public static boolean inc(int[] numArr){
		int i = 1;
		while(i < numArr.length){
			if(numArr[i] > numArr[i-1]){
				return false;
			}
			i++;
		}
		return true;
	}

	public static boolean dec(int[] numArr){
		int i = 1;
		while(i < numArr.length){
			if (numArr[i] < numArr[i-1]) {
				return false;
			}
			i++;
		}
		return true;
	}*/

/*public class min{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Array deletion\n");
		int[] numArr = min.inputArray();
		System.out.print("Now, enter that number you want to delete : ");
		int numToDelete = input.nextInt();
		int[] newArr = delete(numArr, numToDelete);
		System.out.println("Here is your new array");
		min.displayArray(newArr);
	}

	public static int[] delete(int[] numArr, int numToDelete){
		int occ = occurance(numArr, numToDelete);
		if(occ == 0){
			return numArr;
		}
		int newSize = numArr.length - occ;
		int[] newArr = new int[newSize];

		int i = 0, j = 0;
		while(i < numArr.length){
			if (numArr[i] != numToDelete) {
				newArr[j] = numArr[i];
				j++;
			}
			i++;
		}

		return numArr;
	}

	public static int occurance(int[] numArr, int num){
			int occ = 0;
			int i = 0;
			while(i < numArr.length){
				if(numArr[i] == num){
					occ++;
				}
				i++;
			}
			return occ;
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

		public static void displayArray(int[] numArr){
			int i = 0;
			while(i < numArr.length){
				System.out.println(numArr[i] + " ");
				i++;
			}
			System.out.println();
		}
}*/

/*public class min{
	public static void main(String[] args){
		System.out.println("Welcome to array reverseal\n");
		//Scanner input = new Scanner(System.in);
		int[] numArr = min.inputArray();
		reverse(numArr);
		System.out.println("your reverse array is");
		min.displayArray(numArr);
	}

	public static void reverse(int[] arr){
		int i = 0;
		while(i < arr.length/2){
			int swap = arr[i];
			arr[i] = arr[(arr.length - 1) - i];
			swap = arr[(arr.length - 1) - i];
			i++;
		}
	}

	public static void displayArray(int[] numArr){
			int i = 0;
			while(i < numArr.length){
				System.out.println(numArr[i] + " ");
				i++;
			}
			System.out.println();
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

/*
public class min{
	public static void main(String[] args){
		System.out.println("Welcome to palindrome checker\n");
		int[] numArr = min.inputArray();
		boolean isPalin = isPalindrome(numArr);
		if(isPalin){
			System.out.println("Your array is palindrome");
		}
		else{
			System.out.println("Your array is not palindrome");
		}
	}

	public static boolean isPalindrome(int[] numArr){
		int i = 0;
		while(i < numArr.length/2){
			if(numArr[i] != numArr[numArr.length - 1 - i]){
				return false;
			}
			i++;
		}
		return true;
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

public class min{
	public static void main(String[] args){
		System.out.println("Welcome to merging sorted array\n");
		int[] arr1 = min.inputArray();
		int[] arr2 = min.inputArray();
		int[] mergeArr = merge(arr1, arr2);
		System.out.println("Your merge array is : ");
		min.displayArray(mergeArr);
	}

	public static int[] merge(int[] arr1, int[] arr2){
		int newSize = arr1.length + arr2.length;
		int[] newArr = new int[newSize];
		int i = 0, j = 0, k = 0;
		while(i < arr1.length || j < arr2.length){
			if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
				newArr[k] = arr1[i];
				i++;
				k++;
			}
			else{
				newArr[k] = arr2[j];
				k++;
				j++;
			}
		}

		return newArr;
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

		public static void displayArray(int[] numArr){
			int i = 0;
			while(i < numArr.length){
				System.out.println(numArr[i] + " ");
				i++;
			}
			System.out.println();
		}
}








