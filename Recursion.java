import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

//Print no 1 to n using recursion
/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n = input.nextInt();
    printIncreasing(n);
  }

  public static void printIncreasing(int n){
    if(n == 1){
      System.out.println(n);
      return;
    }

    printIncreasing(n - 1);
    System.out.println(n);
  }
}*/

//print no from n to 1 using recursion
/*public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
    //base case
        if(n == 1){
          System.out.print(n);
          return;
        }

      //self work
        System.out.println(n);

      //recursive work
        printDecreasing(n-1);
    }
}*/

//factorial
/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = input.nextInt();
    System.out.println(factorial(n));
  }

  public static int factorial(int n){
    if(n == 0){
      return 1;
    }

    return n* factorial(n-1);
  }
}*/

//fibonacci
/*
public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = input.nextInt();
    
    for(int i = 0; i <= 10; i++){
      System.out.println(fibonacci(i));
    }
  }

  public static int fibonacci(int n){
    if(n == 0 || n == 1){
      return n;
    }


    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}*/

//Sum of digit
/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = input.nextInt();
    System.out.println(sumOfDigit(n));
  }

  public static int sumOfDigit(int n){
    if( n >= 0 && n <= 9){
      return n;
    }

    return sumOfDigit(n/10) + (n % 10);
  }
}*/

//p^q 
/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first number : ");
    int p = input.nextInt();

    System.out.println("Enter your second number : ");
    int q = input.nextInt();
    System.out.println(pow(p, q));
  }

  public static int pow(int p, int q){
    if(q == 0){
      return 1;
    }

    return pow(p, q-1) * p;
  }
}*/

//alternative method to calculate power

/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number : ");
    int p = input.nextInt();

    System.out.println("Enter second number : ");
    int q = input.nextInt();

    System.out.println(pow(p, q));
  }

  public static int pow(int p, int q){
    if(q == 0){
      return 1;
    }

    int smallpow = pow(p, q/2);
    if(q % 2 == 0){
      return smallpow*smallpow;
    }
    else{
      return p*smallpow*smallpow;
    }
  }
}*/

//multiplying n by k in series

/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n = input.nextInt();

    System.out.println("Enter k : ");
    int k = input.nextInt();

    mul(n, k);
  }

  public static void mul(int n, int k){
    if(k == 0){
      return;
    }

    mul(n, k-1);

    System.out.println(k * n);
  }
}*/

//alternative sum
// +1-2+3-4+5 output like this
/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n = input.nextInt();

    System.out.println(seriesSum(n));
  }

  public static int seriesSum(int n){
    if(n == 0){
      return 0;
    }

    if(n % 2 == 0){
      return seriesSum(n - 1) - n;
    }
    else{
      return seriesSum(n - 1) + n;
    }
  }
}*/

//gcd 

/*public class Recursion{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter x : ");
    int x = input.nextInt();

    System.out.println("Enter y : ");
    int y = input.nextInt();

    //System.out.println(gcd(x, y));
    System.out.println(rgcd(x, y));
  }

  public static int gcd(int x, int y){
    while(x % y != 0){
      int rem = x % y;
      x = y;
      y = rem;
    }
    return y;
  }

  public static int rgcd(int x, int y){
    if(y == 0){
      return x;
    }

    return rgcd(y, x%y);
  }
}*/

//traversing an array using recursion

/*public class Recursion{
  public static void main(String[] args){
    int[] arr = {4, 5, 8,10,32};

    printArray(arr, 0);
  }

  public static void printArray(int[] arr, int idx){
    if(idx == arr.length){
      return;
    }

    System.out.println(arr[idx]);

    printArray(arr, idx+1);
  }
}*/

// Max value of the array

/*public class Recursion{
  public static void main(String[] args){
    int[] arr = {13,6, 7,8,9};
    System.out.println(max(arr, 0));
  }

  public static int max(int[] arr, int idx){
    if(idx == arr.length-1){
      return arr[idx];
    }

    //small problem
    int smallAns = max(arr, idx+1);

    //base case
    return Math.max(arr[idx], smallAns);
  }
}*/

//sum of elements of the array

/*public class Recursion{
  public static void main(String[] args){
    int[] arr = {2,5,4,5,6};
    System.out.println(sumOfArray(arr, 0));
  }

  public static int sumOfArray(int[] arr, int idx){
    if(idx == arr.length){
      return 0;
    }

    //recursive work
    int smallAns = sumOfArray(arr, idx+1);

    //base case
    return smallAns + arr[idx];
  }
}*/

//searching elements in an array

/*public class Recursion{
  public static void main(String[] args){
    int[] arr = {5, 10, 15, 20, 25};
    int target = 13;
    if(search(arr, arr.length, target, 0)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }

  public static boolean search(int[] arr, int n, int target, int idx){
    //base case
    if(idx >= n){
      return false;
    }

    //self work
    if(arr[idx] == target){
      return true;
    }

    //recursive work
    return search(arr, n, target, idx+1);
  }
}*/

// finding an element with indexes

/*public class Recursion{
  public static void main(String[] args){
    int[] arr = {5, 10, 15, 20, 25};
    int n = arr.length; // n is the length, though the variable is not strictly needed below
    int target = 15;
    int idx = 0; // Declare and initialize idx

    // The call to findIndex should not concatenate a string literal "-1"
    System.out.println(findIndex(arr, target, idx));
  }

  // Simplified method signature
  public static int findIndex(int[] arr, int target, int idx){
    //base case
    if(idx >= arr.length){ // Use arr.length directly
      return -1; // Return the integer -1
    }

    //self work
    if(arr[idx] == target){
      return idx;
    }

    //recursive work
    return findIndex(arr, target, idx+1);
  }
}*/

//finding an element with many indexes

/*public class Recursion{
  public static void main(String[] args){
    int[] arr = {5, 10, 15, 20, 5,25, 5};
    int n = arr.length;
    int target = 5;
    int idx = 0;
    System.out.println(findIndex(arr, n, target, 0));
  }

  public static int findIndex(int[] arr, int n, int target, int idx){
    //base case
    if(idx >= n){
      return -1;
    }

    //self work
    if(arr[idx] == target){
      System.out.println(idx);
    }

    //recursive work
    return findIndex(arr, n, target, idx+1);
  }
}*/

//recursion on string
/*public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = input.next();
        System.out.println("s: " + s);

        // Consume the leftover newline character
        input.nextLine(); 

        System.out.print("Enter p: ");
        String p = input.nextLine(); // Now this will wait for new input
        System.out.println("p: " + p);

        // This will only work if 'p' has content
        if (!p.isEmpty()) { 
            char ch = p.charAt(0);
            System.out.println("First character of p: " + ch);
        } else {
            System.out.println("p is empty, cannot get charAt(0).");
        }

        System.out.println("Substring of s (2,4): " + s.substring(2, 4));
        input.close(); // It's good practice to close the scanner
    }
}*/





