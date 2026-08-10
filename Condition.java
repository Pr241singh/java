import java.util.Scanner;

/*public class Condition{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    int number = input.nextInt();*/

/*if(number > 0){
  System.out.println("Positive");
}
else if(number < 0){
  System.out.println("Negative");
}
else{
  System.out.println("Zero");
}*/

/*if(number%2 == 0){
   System.out.println("Even");
 }
 else{
   System.out.println("Odd");
 }
}
}*/

/*public class Condition{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your First Number : ");
    int num1 = input.nextInt();
    System.out.println("Enter Your Second Number : ");
    int num2 = input.nextInt();
    System.out.println("Enter Your Third Number : ");
    int num3 = input.nextInt();

    if(num1 > num2 && num1 > num3){
      System.out.println("First no is greater : "+num1);
    }
    else if(num2 > num1 && num2 > num3){
      System.out.println("Second no is greater : "+num2);
    }
    else{
      System.out.println("Third number is greater : "+num3);
    }
  }
}*/

public class Condition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter year : ");
    int year = input.nextInt();

    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      System.out.println("This is a Leap Year");
    } else {
      System.out.println("Not a Leap Year");
    }
  }
}

/*
 * public class Condition{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter Your Age : ");
 * int age = input.nextInt();
 * 
 * if(age < 13){
 * System.out.println("Child");
 * }
 * else if(age < 20){
 * System.out.println("Teen");
 * }
 * else if(age < 60)
 * {
 * System.out.println("Adult");
 * }
 * else{
 * System.out.println("Senior");
 * }
 * }
 * }
 */