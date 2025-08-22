import java.util.Scanner;

public class utility{

	public static void main(String[] args) {

		System.out.println("Welcome to min or max of an array");
		int[] numArray = utility.inputArray();
		int max = max(numArray);
		int min = min(numArray);
		System.out.println("Max of the array is : "+ max);
		System.out.println("Min of the array is : "+min);
	


		/*System.out.println("Welcome to sum or average of an array");
		int[] numArray = utility.inputArray();
		long sum = sum(numArray);
		long average = average(numArray);
		System.out.println("sum of the no is : "+ sum);
		System.out.println("average of the no is : "+ average);*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome to sum or average of an array");
		System.out.println("Please enter the no of elements : ");
		int size = input.nextInt();
		int[] nums = new int[size];
		int i = 0;
		while(i < size)
		{
			System.out.println("Please enter the no of elments " + (i+1) + " : ");
			nums[i] = input.nextInt()
			i++;
		} */

		/*Scanner input = new Scanner(System.in);
		System.out.println("Welcome the occurance of an array");
		int[] numArr = utility.inputArray();
		System.out.println("Please enter the no you want to find : ");
		int num = input.nextInt();
		int occurance = occurance(numArr, num);
		System.out.println("Your element was found at "+ occurance+"times in array");*/
	}

		public static int min(int[] numArray){
			int min = Integer.MAX_VALUE;
			int i = 0;
			while(i < numArray.length){
				if(min > numArray[i]){
					min = numArray[i];
				}
				i++;
			}
			return min;
		}

		public static int max(int[] numArray){
			if(numArray.length == 0){
				return Integer.MIN_VALUE;
			}
			int max = numArray[0];
			int i = 0;
			while(i< numArray.length){
				if(max <numArray[i]){
					max =  numArray[i];
				}
				i++;
			}
			return max;
		}	

		/*public static int occurance(int[] numArr, int num){
			int occ = 0;
			int i = 0;
			while(i < numArr.length){
				if(numArr[i] == num){
					occ++;
				}
				i++;
			}
			return occ;
		}*/

		/*public static long sum(int[] numArray){
			long sum = 0;
			int i = 0;
			while(i< numArray.length){
				sum += numArray[i];
				i++;
			}
			return sum;
		}

		public static int average(int[] numArray){
			long sum = sum(numArray);
			return(int) sum/ numArray.length;
		}*/
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
	}