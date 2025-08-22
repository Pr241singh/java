import java.util.Scanner;

/*public class twoarray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to 2D search\n");
		int[][] numArr = twoarray.input2DArray();
		System.out.println("Now enter the no you want to search");
		int num = input.nextInt();
		boolean isFound = search(numArr, num);
		if(isFound){
			System.out.println("Your no was found");
		}
		else
		{
			System.out.println("Your no was not found");
		}
	}

	public static boolean search(int[][] numArr, int num){
		int i = 0;
		while(i < numArr.length){
			int j = 0;
			while(j < numArr[i].length){
				if(numArr[i][j] == num){
					return true;
				}
				j++;
			}
			i++;
		}
		return false;
	}

	public static int[][] input2DArray(){
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the no of rows : ");
			int rows = input.nextInt();
			System.out.println("Please enter the no of columns : ");
			int columns = input.nextInt();
			int[][] numArray = new int[rows][columns];
			int i = 0;
			while(i < rows)
			{
				int j = 0;
				while(j < columns){
				System.out.println("Please enter the no of rows : " + (i+1) 
					+ ", column :  " + (j+1)+ " : ");
				numArray[i][j] = input.nextInt();
				j++;
				}
				i++;
			} 
			return numArray;
		}
}*/

public class twoarray{
	public static void main(String[] args){
		System.out.println("Welcome to diagonal sum\n");
		int[][] numArr = twoarray.input2DArray();
		long sum = sumofdiagonal(numArr);
		System.out.println("Sum of diagonals is : " + sum);
	}

	public static long sumofdiagonal(int[][] numArr){
		long leftsum = sumofleftdiagonal(numArr);
		long rightsum = sumofrightdiagonal(numArr);
		long sum = rightsum + leftsum;
		if(numArr.length % 2 != 0){
			int ind = numArr.length/2;
			sum -= numArr[ind][ind];
		}
		return sum;
	}

	public static long sumofleftdiagonal(int[][] numArr){
		long sum = 0;
		int i = 0;
		while(i < numArr.length){
			sum += numArr[i][i];
			i++;
		}
		return sum;
	}

	public static long sumofrightdiagonal(int[][] numArr){
		long sum = 0;
		int i = 0;
		while(i < numArr.length){
			int col = numArr.length - 1 - i;
			sum += numArr[i][col];
			i++;
		}
		return sum;
	}

	public static int[][] input2DArray(){
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the no of rows : ");
			int rows = input.nextInt();
			System.out.println("Please enter the no of columns : ");
			int columns = input.nextInt();
			int[][] numArray = new int[rows][columns];
			int i = 0;
			while(i < rows)
			{
				int j = 0;
				while(j < columns){
				System.out.println("Please enter the no of rows : " + (i+1) 
					+ ", column :  " + (j+1)+ " : ");
				numArray[i][j] = input.nextInt();
				j++;
				}
				i++;
			} 
			return numArray;
		}
}

