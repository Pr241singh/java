import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

//sum of numbers
// public class Loop{
//   public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
// 		System.out.println("Enter your number : ");
// 		int sum = input.nextInt();
// 		int odd = 1;

// 		while(odd<=sum)
// 		{
// 			if(odd != 0) {
// 				System.out.println(sum+odd);
// 				odd += 1;
// 			}
// 		}
//   }
// }

// public class Loop{
//   public static void main(String[] args){
//     String name = "Preeti";
//     int len = 7;
//     for(int pos = 0; pos < len; pos++){
//       char ch = name.charAt(pos);
//       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//         System.out.println("Hi Vowel : \t"+ch);
//       }
//       else{
//         System.out.println("Hi Consonant: \t"+ch);
//       }
//     }
//   }
// }

/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your Number : ");
    int num = input.nextInt();

    int i = 1;
    while(i<=num){
      System.out.println(i);
      i++;
    }
  }
}*/

/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your First Number : ");
    int snumber = input.nextInt();

    System.out.println("Enter Your Ending Number");
    int enumber = input.nextInt();

    while(snumber<=enumber){
      System.out.println(snumber);
      snumber++;
    }
  }
}*/

/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your First Number : ");
    int snumber = input.nextInt();

    System.out.println("Enter Your Ending Number");
    int enumber = input.nextInt();

    for(int i = snumber; snumber<=enumber; snumber++){
      System.out.println(snumber);
    }
  }
}*/

/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Table number");
    int table = input.nextInt();

    int i = 1;
    while(i<=10){
      System.out.println(i*table);
      i++;
    }
  }
}*/

//Print Table
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Table number");
    int table = input.nextInt();

    for(int i=1; i<=10; i++){
      System.out.println(i*table);
    }
  }
}*/

// for reverse table no
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Starting Number : ");
    int Starting = input.nextInt();

    System.out.println("Enter Ending Number : ");
    int Ending = input.nextInt();

    System.out.println("Enter Table Number : ");
    int table = input.nextInt();

    int i = Ending;
    while(i >= Starting){
      System.out.println(i*table);
      i--;
    }
  }
}*/

// for reverse table no
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Starting Number : ");
    int Starting = input.nextInt();

    System.out.println("Enter Ending Number : ");
    int Ending = input.nextInt();

    System.out.println("Enter Table Number : ");
    int table = input.nextInt();

    for(int i=Ending; i>= Starting; i--){
      System.out.println(i*table);
    }
  }
}*/

//reverse no print
/*public class Loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Starting Number : ");
    int Snum = input.nextInt();

    System.out.println("Enter Ending Number : ");
    int Enum = input.nextInt();
    
    for(int i = Enum; i>= Snum; i--){
      System.out.println("reverse num : "+i);
    }
  }
}*/

//print alphabets a to z
/*public class Loop{
  public static void main(String[] args){
    for (char i = 'a'; i<='z'; i++){
      System.out.println(i);
    }
  }
}*/

//print reverse a to z
/*public class Loop{
  public static void main(String[] args){
    for(char i = 'Z'; i>='A'; i--){
      System.out.println(i);
    }
  }
}*/

//print odd numbers
/*public class Loop{
   public static void main(String[] args){
    for(int i = 1; i<=100 ; i= i+2){
      System.out.println(i);
    }
   }
}*/

//print even numbers
/*public class Loop{
  public static void main(String[] args){
 Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int even =input.nextInt();
		for(int i=1;i<=even;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
  }
}*/

//sum of n numbers
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();
    int sum = 0;

    for(int i = 1; i<=num; i++){
      sum = sum + i;
    }
    System.out.println(sum);
  }
}*/

//sum of even numbers
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();
    int sum = 0;

    for(int i = 1; i<=num; i++){
      if(i%2== 0){
        sum = sum + i;
      }
    }
    System.out.println(sum);
  }
}*/

//sum of odd numbers
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();
    int sum = 0;

    for(int i = 1; i<=num; i++){
      if(i%2!= 0){
        sum = sum + i;
      }
    }
    System.out.println(sum);
  }
}*/

//ascii value code
/*public class Loop{
  public static void main(String[] args)
	{
		for(int i=1;i<=255;i++)
		{
			System.out.println((char)i);	
		}
 
	}
}*/

//factorial
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int number = input.nextInt();

    int sum = 1;
    for(int i = 1;i<=number;i++){
      sum = sum*i;
    }
    System.out.println(sum);
  }
}*/

//to calculate power on a number
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Base Number : ");
    int base = input.nextInt();

    System.out.println("Enter Power : ");
    int power = input.nextInt();

    int result = 1;
    for(int i = 1; i <= power; i++){
      result *= base;
    }
    System.out.println(result);
  }
}*/

//reverse of a number
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();

    int rev = 0;
    int rem = 0;
    for(int i = 1; i<=num; i++){
      rem = num%10;
      rev = rev*10 + rem;
      num /= 10;
    }
    System.out.println(rev);
  }
}*/

//sum of digits
public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int number = input.nextInt();

    int sum = 0;
    int rem = 0;
    for(int i = 1; i<=number; i++){
      sum = number%10;
      rem = rem + sum;
      number /= 10;
    }
    System.out.println(rem);
  }
}

//prime Number
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();

    int i, count = 0;
    for(i = 2; i<num; i++){
      if(num%i == 0){
        count++;
        break;
      }
    }
    if(count == 0){
      System.out.println("This is a Prime No.");
    }
    else{
      System.out.println("This is Not a Prime No.");
    }
  }
}*/

//fibonacci series
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of Fibonacci Series : ");
    int number = input.nextInt();

    int[] num = new int[number];
    num[0] = 0;
    num[1] = 1;
    for(int i = 2; i<number;i++){
      num[i] = num[i-1]+num[i-2];
    }
    System.out.println("Fibonacci Series");
    for(int i = 0; i<number; i++){
      System.out.print(num[i] + " ");
    }
  }
}*/

//calculate hcf
/*public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int dividend = input.nextInt();

        System.out.println("Enter the second number : ");
        int divisor = input.nextInt();

        int hcf = 0;
        while(divisor != 0){
          int remainder = dividend % divisor;
          dividend = divisor;
          divisor = remainder;
        }
        hcf = dividend;
        System.out.println("HCF : "+ hcf);
    }
}*/

// print Factors of a positive Integer
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int num  = input.nextInt();

    for(int i=1; i<=num; i++){
      if(num%i == 0){
        System.out.println(i);
      }
    }
    
  }
}*/

//print Factors of a negative Integer
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int num = input.nextInt();

    System.out.println("Factors Negative Integer are : ");
    for(int i = num; i<=Math.abs(num); i++){
      if(i == 0){
        continue;
      }
      else{
          if(num%i == 0){
          System.out.println(i);
        }
      }
    }
  }
}*/

//palindrome
/*public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Digits: ");
        int num = input.nextInt();

        int rev = 0, rem, temp;
        temp = num;
        while(num != 0){
          rem = num%10;
          rev = rev*10+rem;
          num /= 10;
        }
        if(temp == rev){
          System.out.println("This is a palindrome : "+temp);
        }
        else{
          System.out.println("This is not a palindrome : "+temp);
        }
    }
}*/

//claculate gcd
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num1 = 0, num2 = 0;
		int rem = 0, X = 0, Y = 0;
 
		System.out.printf("Enter the Number 1 : ");
		num1 = input.nextInt();
		System.out.printf("Enter the Number 2 : ");
		num2 = input.nextInt();
 
		if (num1 > num2)
		{
			X = num1;
			Y = num2;
		}
		else 
		{
			X = num2;
			Y = num1;
		}
		rem = X % Y;
		while(rem != 0) 
		{
			X = Y;
			Y = rem;
			rem = X % Y;
		}
		System.out.println("Greatest Common Divisor is : "+ Y);
  }
} */

//Calculate lcm
/*public class Loop{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
		int num1 = 0,num2 = 0;
		int rem = 0,lcm = 0, x = 0, y = 0;
 
		System.out.printf("Enter the Number 1 : ");
		num1 = input.nextInt();
		System.out.printf("Enter the Number 2 : ");
		num2 = input.nextInt();
 
		if (num1 > num2)
		{
			x = num1;
			y = num2;
		}
		else
		{
			x = num2;
			y = num1;
		}
		rem = x % y;
		while (rem != 0)
		{
			x = y;
			y = rem;
			rem = x % y;
		}
		lcm = num1 * num2 / y;
		System.out.printf("Lowest Common Multiple is : "+lcm);
  }
}*/

//function
/*public class Loop
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		double n1 = input.nextDouble();
		System.out.print("Enter the Number 2 : ");
		double n2 = input.nextDouble();
		System.out.print("Enter the Number 3 : ");
		double n3 = input.nextDouble();
		System.out.print("The smallest value is " + Math.min(Math.min(n1, n2), n3));
	}
}*/

// public class Loop{
//   public static void main(String[] args){
//     int[] arr = {45,32,65,89,23,56};
//     System.out.println("Original Array : "+ Arrays.toString(arr));
//     Arrays.sort(arr);
//     System.out.println("Sorted Array : "+ Arrays.toString(arr));
//   }
// }









