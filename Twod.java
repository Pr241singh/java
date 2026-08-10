import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

//taking input in 2d array
/*public class Twod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int r = input.nextInt();

        System.out.println("Enter number of columns : ");
        int c = input.nextInt();

        int[][] arr_2 = new int[r][c];

        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr_2[i][j] = input.nextInt();
            }
        }

        printArray(arr_2);
    }

    public static void printArray(int[][] arr_2) {
        for (int i = 0; i < arr_2.length; i++) {
            for (int j = 0; j < arr_2[i].length; j++) {
                System.out.print(arr_2[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}*/

//addition of two matrix
/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter no of rows and columns in a matrix 1 : ");
    int r1 = input.nextInt();
    int c1 = input.nextInt();
    int[][] a = new int[r1][c1];
    System.out.println("Enter matrix value : ");
    for(int i = 0; i < r1; i++){
      for(int j = 0; j < c1; j++){
        a[i][j] = input.nextInt();
      }
    }

    System.out.println("Enter no of rows and columns in a matrix 2 : ");
    int r2 = input.nextInt();
    int c2 = input.nextInt();
    int[][] b = new int[r2][c2];
    System.out.println("Enter matrix value : ");
    for(int i = 0; i < r2; i++){
      for(int j = 0; j < c2; j++){
        b[i][j] = input.nextInt();
      }
    }

    System.out.println("Matrix 1");
    printMatrix(a);
    System.out.println("Matrix 2");
    printMatrix(b);

    add(a, r1, c1, b, r2, c2);
  }

  public static void printMatrix(int[][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
    if(r1 != r2 || r2 != c2){
      System.out.println("Wrong input - Addition not possible");
      return;
    }

    int[][] sum = new int[c1][r1];

    for(int i = 0; i < r1; i++){
      for(int j = 0; j < c1; j++){
        sum[i][j] = a[i][j] + b[i][j];
      }
    }

    printMatrix(sum);
  }
}*/

//multiplication of 2d array
/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter rows and columns of matrix 1 : ");
    int r1 = input.nextInt();
    int c1 = input.nextInt();
    int[][] a = new int[r1][c1];

    System.out.println("Enter matrix value : ");
    for(int i = 0; i < r1; i++){
      for(int j = 0; j < c1; j++){
        a[i][j] = input.nextInt();
      }
    }

    System.out.println("Enter rows and columns of matrix 2 : ");
    int r2 = input.nextInt();
    int c2 = input.nextInt();
    int[][] b = new int[r2][c2];

    System.out.println("Enter matrix value : ");
    for(int i = 0; i < r2; i++){
      for(int j = 0; j < c2; j++){
        b[i][j] = input.nextInt();
      }
    }

    System.out.println("Matrix 1");
    printMatrix(a);
    System.out.println("Matrix 2");
    printMatrix(b);

    Multiply(a, r1, c1, b, r2, c2);
  }

  public static void printMatrix(int[][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void Multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
    if(r1 != r2 || c1 != c2){
      System.out.println("Wrong input - multiplication not possible");
      return;
    }

    int[][] mul = new int[r1][c1];
    for(int i = 0; i < r1; i++){
      for(int j = 0; j < c1; j++){
        mul[i][j] = a[i][j] * b[i][j];
      }
    }
    printMatrix(mul);
  }
}*/

//transpose of 2d array
/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("ENter rows and columns of matrix : ");
    int r = input.nextInt();
    int c = input.nextInt();
    int[][] arr = new int[r][c];
    int totalElement = r*c;

    System.out.println("Enter "+ totalElement + " value");
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        arr[i][j] = input.nextInt();
      }
    }

    System.out.println("Input Matrix");
    printMatrix(arr);

    System.out.println("Transpose of matrix");
    int[][] ans = findTranspose(arr, r, c);
    printMatrix(ans);
  }

  public static void printMatrix(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] findTranspose(int[][] arr, int r, int c){
    int[][] ans = new int[c][r];
    for(int i = 0; i < c; i++){
      for(int j = 0; j < r; j++){
        ans[i][j] = arr[j][i];
      }
    }
    return ans;
  }
}*/

//transpose matrix without using an extra variable

/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("ENter rows and columns of matrix : ");
    int r = input.nextInt();
    int c = input.nextInt();
    int[][] arr = new int[r][c];
    int totalElement = r*c;

    System.out.println("Enter "+ totalElement + " value");
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        arr[i][j] = input.nextInt();
      }
    }

    System.out.print("Input Matrix");
    printMatrix(arr);

    System.out.print("Transpose of matrix");
    findTranspose(arr, r, c);
    printMatrix(arr);
  }

  public static void printMatrix(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void findTranspose(int[][] arr, int r, int c){
    int[][] ans = new int[c][r];
    for(int i = 0; i < c; i++){
      for(int j = i; j < r; j++){
        int temp = arr[i][j];
        ans[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
  }
}*/

//rotation of a matrix by 90 deg
/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and column : ");
    int r = input.nextInt();
    int c = input.nextInt();
    int[][] matrix = new int[r][c];
    int totalElement = r*c;

    System.out.println("Enter "+ totalElement + " value");
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = input.nextInt();
      }
    }

    System.out.print("Input Matrix");
    printMatrix(matrix);

    rotate(matrix, r);

    System.out.println("Rotation of matrix : ");
    printMatrix(matrix);
  }

  public static void printMatrix(int[][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void findTranspose(int[][] matrix, int r, int c){
    int[][] ans = new int[c][r];
    for(int i = 0; i < c; i++){
      for(int j = 0; j < r; j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }

  public static void reverseArray(int[] arr){
    int i = 0, j = arr.length-1;

    while(i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public static void rotate(int[][] matrix, int n){
    findTranspose(matrix, n, n);

    for(int i = 0; i < n; i++){
      reverseArray(matrix[i]);
    }
  }
}*/

//pascals triangle

/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n");
    int n = input.nextInt();
    int[][] ans = pascal(n);
    printMatrix(ans);
  }

  public static void printMatrix(int[][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] pascal(int n){
    int[][] ans = new int[n][];

    for(int i = 0; i < n; i++){
      //ith row has i+1 col
      ans[i] = new int[i+1];
      ans[i][0] = ans[i][i] = 1;

      for(int j = 1; j < i; j++){
        ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
      }
    }

    return ans;
  }
}*/

//spiral matrix
/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and column : ");
    int r = input.nextInt();
    int c = input.nextInt();
    int[][] matrix = new int[r][c];
    int totalElement = r*c;

    System.out.println("Enter "+ totalElement + " value");
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = input.nextInt();
      }
    }

    System.out.print("Input Matrix");
    printMatrix(matrix);

    System.out.println("Spiral order");
    printSpiralOrder(matrix, r, c);
  }

  public static void printMatrix(int[][] matrix){
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[i].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void printSpiralOrder(int[][] matrix, int r, int c){
   int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
    int totalElement = 0;
   while(totalElement < r*c){
    //topRow => leftCol to rightcol

    for(int j = leftCol; j <= rightCol && totalElement < r*c; j++){
      System.out.println(matrix[topRow][j] + " ");
      totalElement++;
    }
    topRow++;

    //rightcol => toprow to bottomrow

    for(int i = topRow; i <= bottomRow && totalElement < r*c; i++){
      System.out.println(matrix[i][rightCol] + " ");
      totalElement++;
    }
    rightCol--;

    //bottomrow => rightcol to leftcol

    for(int j = rightCol; j <= leftCol && totalElement < r*c;  j--){
      System.out.println(matrix[bottomRow][j] + " ");
      totalElement++;
    }
    bottomRow--;

    //leftcol => bottomrow to toprow
    for(int i = bottomRow; i <= topRow && totalElement < r*c; i--){
      System.out.println(matrix[i][leftCol] + " ");
      totalElement++;
    }
    leftCol++;
   } 
  }
}*/

//spiral in sequence 
/*public class Twod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();
        int[][] matrix = printSpiralOrder(n);
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] printSpiralOrder(int n){
        int[][] matrix = new int[n][n];

        int topRow = 0, bottomRow = n - 1;
        int leftCol = 0, rightCol = n - 1;
        int curr = 1;

        while (curr <= n * n) {

            // left to right
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                matrix[topRow][j] = curr++;
            }
            topRow++;

            // top to bottom
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;

            // right to left
            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            // bottom to top
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                matrix[i][leftCol] = curr++;
            }
            leftCol++;
        }

        return matrix;
    }
}*/

/*public class Twod{
  public static void main(String[] args){
    Integer k = Integer.valueOf(4);
    System.out.println(k);
    Float j = Float.valueOf(3);
    System.out.println(j);

    ArrayList<Integer> l1 = new ArrayList<>();
    //ArrayList<Float> l2 = new ArrayList<>();

    //add new element
    l1.add(5);
    l1.add(6);
    l1.add(7);
    l1.add(8);

    //get an element at index i
    System.out.println(l1.get(1));

    //print with for loop
    // for(int i = 0 ; i < l1.size(); i++){
    //   System.out.println(l1.get(i));
    // }
    //printing the arraylist directly
    System.out.println(l1);

    l1.add(1, 100);
    System.out.println(l1);

    //modifying element at 2 index
    l1.set(2, 10);
    System.out.println(l1);

    //remove element
    l1.remove(3);
    System.out.println(l1);

    //removing an element e
    l1.remove(Integer.valueOf(8));
    System.out.println(l1);

    //check if an element exist
    boolean ans = l1.contains(Integer.valueOf(5));
    System.out.println(ans);
  }
}*/

/*public class Twod{
  public static void main(String[] args){
    ArrayList<Integer> List = new ArrayList<>();
    List.add(0);
    List.add(10);
    List.add(3);
    List.add(5);
    List.add(22);
    List.add(10);
    System.out.println("Original List " +List);
    reverseList(List);
    //Collectons.reverse(List);
    //collections.sort(List);
    System.out.println("Reversed List"+ List);
  }

  public static void reverseList(ArrayList<Integer> List){
    int i = 0, j = List.size()-1;
    while(i < j){
      Integer temp = Integer.valueOf(List.get(i));
      List.set(i, List.get(j));
      List.set(j, temp);
      i++;
      j--;
    }
  }
}*/

//for commenting multiple lines at once use ctrl+slash

/*public class Twod{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and column : ");
    int r = input.nextInt();
    int c = input.nextInt();
    int[][] matrix = new int[r][c];
    int totalElement = r*c;

    System.out.println("Enter "+ totalElement + " value");
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = input.nextInt();
      }
    }

    System.out.print("Enter ractangle boundries l1, r1, l2, r2 : ");
    int l1 = input.nextInt();
    int r1 = input.nextInt();
    int l2 = input.nextInt();
    int r2 = input.nextInt();

    System.out.println("Ractangle sum "+ findSum(matrix, l1, r1, l2, r2));
  }

  public static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
    int sum = 0;

    for(int i = l1; i <= l2; i++){
      for(int j = r1; j <= r2; j++){
        sum += matrix[i][j];
      }
    }

    return sum;
  }
}*/