import java.util.Scanner;

public class array{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to sum or average of an array");
		System.out.println("Please enter the no of elements : ");
		int size = input.nextInt();

		/*int[] myArr = {2,4,6,8,9,7,5};

		System.out.println(myArr[0]);
		System.out.println(myArr[1]);
		System.out.println(myArr[2]);

//array traversal
		int index = 0;
		while(index < myArr.length){
			System.out.println(myArr[index]);
			index++;
		}*/

		/*int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
			System.out.println(array[0].length);

			int i = 0;
			while(i <array.length){
				int j = 0;
				while(j < array[i].length){
					System.out.print(array[i][j] + " ");
					j++;
				}
				System.out.println();
				i++;
			}

		//array searching
			Scanner input = new Scanner(System.in);
			int[] arr = {3,6,8,87,65,4,68,23,9,98,36};
			System.out.println("Welcome to array searching\n");
			System.out.println("Enter the number you want to search : ");
			int num = input.nextInt();
			boolean isFound = isFound(arr, num);
			if(isFound){
				System.out.println("your number was found in the array");
			}
			else
			{
				System.out.println("your number was not found in the array");
			}

			String[] newStr = {"first","second","third"};
			System.out.println(newStr.length);*/
		}

		/*public static boolean isFound(int[] arr, int num){
			int index = 0;
			while(index < arr.length){
				if(arr[index] == num){
					return true;
				}
				index++;
			}
			return false;

			//int[][] arrMy = new index[2][3];
			//arrMy[0][0] = 9;

		}*/

