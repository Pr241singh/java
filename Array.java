import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * public class Array{
 * public static void main(String[] args){
 * int[] ages = new int[3];
 * String[] names = new String[3];
 * int[][] arr_1 = new int[5][3];
 * int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
 * 
 * arr_1[0][0] = 15;
 * arr_1[0][1] = 20;
 * arr_1[0][2] = 25;
 * 
 * System.out.println(arr.length);
 * System.out.println(arr[0][0]);
 * System.out.println(arr[0][1]);
 * System.out.println(arr[0][2]);
 * System.out.println(arr_1[0][0]);
 * 
 * ages[0] = 18;
 * ages[1] = 19;
 * ages[2] = 25;
 * //ages[5] = 35;
 * 
 * System.out.println(ages[0]);
 * System.out.println(ages[1]);
 * System.out.println(ages[2]);
 * //System.out.println(ages[5]);
 * }
 * }
 */

/*
 * public class Array{
 * public static void main(String[] args){
 * int[] ages = new int[3];
 * ages[0] = 18;
 * ages[1] = 19;
 * ages[2] = 25;
 * 
 * for(int i = 0; i < 3; i++){
 * System.out.println(ages[i]);
 * }
 * 
 * //for each loop for traversing
 * for(int age : ages){
 * System.out.println(age);
 * }
 * 
 * //while loop for traversing
 * int i = 0;
 * while(i < 3){
 * System.out.println(ages[i]);
 * i++;
 * }
 * 
 * int[][] arr = {{1,2,3}, {4,5,6}};
 * 
 * for(int i = 0; i < arr.length; i++){
 * for(int j = 0; j < arr[i].length; j++){
 * System.out.println(arr[i][j]);
 * }
 * 
 * int[][] arr_1 = {{1,2,3}, {4,5}};
 * 
 * for(int i = 0; i < arr_1.length; i++){
 * for(int j = 0; j < arr_1[i].length; j++){
 * System.out.println(arr_1[i][j]);
 * }
 * }
 * }
 * }
 * }
 */

// Practice questions of Array

/*
 * public class Array{
 * public static void main(String[] args){
 * int[] arr = {1,5,3};
 * int sum = 0;
 * for(int i = 0; i < arr.length ; i++){
 * sum = sum + arr[i];
 * System.out.println(sum);
 * }
 * }
 * }
 */

/*
 * public class Array{
 * public static void main(String[] args){
 * int[] arr = {45,32,65,89,23,56};
 * int ans = 0;
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] > ans){
 * ans = arr[i];
 * }
 * }
 * System.out.println("Max : "+ ans);
 * }
 * }
 */

/*
 * public class Array{
 * public static void main(String[] args){
 * int[] arr = {45,32,65,89,23,56};
 * System.out.println("Original Array : "+ Arrays.toString(arr));
 * Arrays.sort(arr);
 * System.out.println("Sorted Array : "+ Arrays.toString(arr));
 * }
 * }
 */

/*
 * public class Array{
 * public static void main(String[] args) {
 * Integer[] arr = {55,34,43,26,17,89,68,99};
 * System.out.println("Original Value : "+ Arrays.toString(arr));
 * Arrays.sort(arr, Collections.reverseOrder());
 * System.out.println("Sorted Array : "+ Arrays.toString(arr));
 * }
 * }
 */

/*
 * public class Array{
 * public static void main(String[] args) {
 * int[] arr = {55,34,43,26,17,89,68,99};
 * int x = 17;
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] == x){
 * System.out.println(x+ " is present at index : "+ i);
 * }
 * }
 * }
 * }
 */

// taking input from user

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.println("Enter Size of array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter array " + size + " element : ");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * for(int i = 0; i < size; i++){
 * System.out.println(arr[i] + " ");
 * }
 * 
 * //trying copy to arr_2
 * int[] arr_2 = arr;
 * for(int i = 0; i < size; i++){
 * System.out.println(arr_2[i] + " ");
 * }
 * }
 * }
 */

/*
 * public class Array{
 * public static int[] getArrayInput(Scanner scanner) {
 * System.out.print("Enter the size of the array: ");
 * int size = scanner.nextInt();
 * 
 * 
 * int[] arr = new int[size];
 * System.out.println("Enter " + size + " integer elements:");
 * 
 * for (int i = 0; i < size; i++) {
 * System.out.print("Element " + (i + 1) + ": ");
 * arr[i] = scanner.nextInt();
 * }
 * return arr;
 * }
 * 
 * public static void main(String[] args){
 * int[] arr = {45,32,65,89,23,56};
 * int ans = 0;
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] > ans){
 * ans = arr[i];
 * }
 * }
 * System.out.println("Max : "+ ans);
 * }
 * }
 */

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of element");
 * int n = input.nextInt();
 * int[] arr = new int[n];
 * 
 * System.out.println("Enter "+ n+ " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * for(int i = 0; i < n; i++){
 * System.out.println(arr[i] + " ");
 * }
 * }
 * }
 */

/*
 * public class Array{
 * public static void main(String[] args){
 * //Scanner input = new Scanner(System.in);
 * //System.out.println("Enter the size of an array : ");
 * //int n = input.nextInt();
 * int[] arr = new int[4];
 * arr[0] = 2;
 * arr[1] = 3;
 * arr[2] = 4;
 * arr[3] = 5;
 * 
 * //System.out.println("Enter "+ n + " element");
 * //for(int i = 0; i < arr.length; i++){
 * //arr[i] = input.nextInt();
 * //}
 * 
 * System.out.println("Original Array");
 * printArray(arr);
 * 
 * //trying to copy
 * System.out.println("Copied Array");
 * int[] arr_2 = arr.clone();
 * printArray(arr_2);
 * arr_2[0] = 7;
 * arr_2[1] = 5;
 * 
 * System.out.println("Original array after changing arr_2");
 * printArray(arr);
 * 
 * System.out.println("Original array after changing arr_2");
 * printArray(arr_2);
 * }
 * 
 * public static void printArray(int[] arr){
 * for(int i = 0; i < arr.length; i++){
 * System.out.println(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * }
 */

/*
 * public class Array{
 * public static void change_array(int[] arr){
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = 0;
 * }
 * }
 * 
 * public static void printArray(int[] arr){
 * for(int i = 0; i < arr.length; i++){
 * System.out.println(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * public static void main(String[] args){
 * int[] arr = new int[4];
 * arr[0] = 2;
 * arr[1] = 3;
 * arr[2] = 4;
 * arr[3] = 5;
 * 
 * change_array(arr);
 * printArray(arr);
 * }
 * }
 */

// Question find the occurance of an array
/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Enter x : ");
 * int x = input.nextInt();
 * 
 * System.out.println("COUNT OF X : "+ countOccurance(arr, x));
 * }
 * 
 * public static int countOccurance(int[] arr, int x){
 * int count = 0;
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] == x){
 * count++;
 * }
 * }
 * return count;
 * }
 * }
 */

// Finding last occurance of an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " elemnets");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Enter x : ");
 * int x = input.nextInt();
 * 
 * System.out.println("LAST COUNT OF X : "+ lastOcuurance(arr, x));
 * }
 * 
 * public static int lastOcuurance(int[] arr, int x){
 * int index = -1;
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] == x){
 * index = i;
 * }
 * }
 * return index;
 * }
 * }
 */

// count the number of elemnets strictly greater than value x

// check if the given array is sorted or not
/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.println("Enter the size of an array: ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter " + size + " elements:");
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * // Now you can call the sorting check or perform actual sorting
 * System.out.println("Your array is: " + Arrays.toString(arr)); // To print the
 * array
 * System.out.println("Is the array sorted in descending order? " +
 * isSortedDescending(arr));
 * }
 * 
 * public static boolean isSortedDescending(int[] arr) {
 * for (int i = 1; i < arr.length; i++) {
 * if (arr[i] > arr[i - 1]) { // If a later element is greater than an earlier
 * one, it's not descending
 * return false;
 * }
 * }
 * return true;
 * }
 * }
 */

// sum of all elements in an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i< arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * System.out.println("The sum of array is "+ sumOfArray(arr));
 * }
 * 
 * public static int sumOfArray(int[] arr){
 * int sum = 0;
 * for(int i = 0; i< arr.length; i++){
 * sum += arr[i];
 * }
 * return sum;
 * }
 * }
 */

// Calculate average of an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size+ " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * System.out.println("The average of an array : "+ average(arr));
 * }
 * 
 * public static double average(int[] arr){
 * int sum = 0;
 * for(int i = 0; i < arr.length; i++){
 * sum += arr[i];
 * }
 * double avg = sum/arr.length;
 * return avg;
 * }
 * }
 */

// reverse of an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * System.out.println("\nDisplay Reverse Order in Array Elements...\n");
 * for(int i = size-1; i >= 0; i--){
 * System.out.println(arr[i]);
 * }
 * }
 * }
 */

// print cubic values from cubic

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("The cubic of an array");
 * for(int e:arr)
 * {
 * System.out.println(e*e*e);
 * }
 * }
 * }
 */

// Find the maximum and minimum elements in an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * int max = 0;
 * int min = 0;
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i <arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * max = arr[0];
 * min = arr[0];
 * for(int i = 0; i < arr.length; i++){
 * if(max < arr[i]){
 * max = arr[i];
 * }
 * if(min > arr[i]){
 * min = arr[i];
 * }
 * }
 * System.out.println("Maximum Element of Array : "+max);
 * System.out.println("Minimum Element of Array : "+min);
 * }
 * }
 */

// print odd numbers from an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("enter "+ size + " element ");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Odd element is");
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] % 2 != 0){
 * System.out.println(arr[i]);
 * }
 * }
 * }
 * }
 */

// print even number of an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("enter "+ size + " element ");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Odd element is");
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] % 2 == 0){
 * System.out.println(arr[i]);
 * }
 * }
 * }
 * }
 */

// Target sum whose sum is equal to the given value x

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Enter the target sum : ");
 * int target = input.nextInt();
 * 
 * System.out.println(pairSum(arr,target));
 * }
 * 
 * public static int pairSum(int[] arr, int target){
 * int size = arr.length;
 * int ans = 0;
 * 
 * for(int i = 0; i <arr.length; i++){
 * for(int j = i+1; j < arr.length; j++){
 * if(arr[i] + arr[j] == target){
 * ans++;
 * }
 * }
 * }
 * return ans;
 * }
 * }
 */

// triplet target sum

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an arrray : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " elements");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Enter the target sum of an array : ");
 * int target = input.nextInt();
 * 
 * System.out.println(targetSum(arr, target));
 * }
 * 
 * public static int targetSum(int[] arr, int target){
 * int size = arr.length;
 * int ans = 0;
 * for(int i = 0; i < arr.length; i++){
 * for(int j = i+1; j < arr.length; j++){
 * for(int k = j + 1; k <arr.length; k++){
 * if(arr[i] + arr[j] + arr[k] == target){
 * ans++;
 * }
 * }
 * }
 * }
 * return ans;
 * }
 * }
 */

// find the unique number in a given array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * System.out.println("Unique element : "+ unique(arr));
 * 
 * 
 * }
 * 
 * public static int unique(int[] arr){
 * int size = arr.length;
 * for(int i = 0; i <arr.length; i++){
 * for(int j = i+1; j < arr.length; j++){
 * if(arr[i] == arr[j]){
 * arr[i] = -1;
 * arr[j] = -1;
 * }
 * }
 * }
 * 
 * int ans = -1;
 * for(int i = 0; i< arr.length; i++){
 * if(arr[i] > 0){
 * ans = arr[i];
 * }
 * }
 * return ans;
 * }
 * }
 */

// second last maximum

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * System.out.println("Max element : "+ secondMAx(arr));
 * }
 * 
 * public static int findMax(int[] arr){
 * int mx = Integer.MIN_VALUE;
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] > mx){
 * mx = arr[i];
 * }
 * }
 * return mx;
 * }
 * 
 * public static int secondMAx(int[] arr){
 * int mx = findMax(arr);
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] == mx){
 * arr[i] = Integer.MIN_VALUE;
 * }
 * }
 * 
 * int secondMAx = findMax(arr);
 * return secondMAx;
 * }
 * }
 */

// swap no without using another variable

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter your first numbr : ");
 * int a = input.nextInt();
 * 
 * System.out.println("Enter your second number : ");
 * int b = input.nextInt();
 * 
 * System.out.println("Original values before swap : ");
 * System.out.println("a : " + a);
 * System.out.println("b" + b);
 * 
 * swap(a,b);
 * 
 * System.out.println("Original values after swap : ");
 * System.out.println("a : " + a);
 * System.out.println("b : " + b);
 * }
 * 
 * public static void swap(int a, int b){
 * System.out.println("Original values before swap : ");
 * System.out.println("a : " + a);
 * System.out.println("b : " + b);
 * 
 * a = a + b;
 * b = a - b;
 * a = a - b;
 * 
 * System.out.println("Original values after swap : ");
 * System.out.println("a : " + a);
 * System.out.println("b : " + b);
 * }
 * }
 */

// print reverse of an array

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * int[] ans = reverseArray(arr);
 * printArray(ans);
 * }
 * 
 * public static void printArray(int[] arr){
 * for(int i = 0; i < arr.length; i++){
 * System.out.println(arr[i]+ " ");
 * }
 * System.out.println();
 * }
 * 
 * public static int[] reverseArray(int[] arr){
 * int size = arr.length;
 * int[] ans = new int[size];
 * int j = 0;
 * 
 * for(int i = size-1; i >= 0; i--){
 * ans[j++] = arr[i];
 * }
 * return ans;
 * }
 * }
 */

// reverse an array without using any other variable

/*
 * public class Array{
 * public static void main(String[] args){
 * int[] arr = {1,2,3,4,5,6};
 * reverseArray(arr);
 * printArray(arr);
 * }
 * 
 * public static void swapArray(int[] arr, int i, int j){
 * int temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = temp;
 * }
 * 
 * public static void reverseArray(int[] arr){
 * int i = 0, j = arr.length-1;
 * while(i < j){
 * swapArray(arr, i, j);
 * i++;
 * j--;
 * }
 * }
 * 
 * public static void printArray(int[] arr){
 * for(int i = 0; i < arr.length; i++){
 * System.out.println(arr[i]+ " ");
 * }
 * System.out.println();
 * }
 * }
 */

// rotate the given array by k steps

/*
 * public class Array {
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter " + size + " elements");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Enter k : ");
 * int k = input.nextInt();
 * 
 * System.out.println("Original array");
 * printArray(arr);
 * 
 * int[] ans = rotate(arr, k);
 * System.out.println("Array after rotation");
 * printArray(ans);
 * }
 * 
 * public static void printArray(int[] arr){
 * for(int i : arr){
 * System.out.print(i + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static int[] rotate(int[] arr, int k){
 * int size = arr.length;
 * k = k % size;
 * int[] ans = new int[size];
 * int j = 0;
 * 
 * for(int i = size-k; i < size; i++){
 * arr[j++] = arr[i];
 * }
 * 
 * for(int i = 0; i < size-k; i++){
 * arr[j++] = arr[i];
 * }
 * 
 * return ans;
 * }
 * }
 */

// sort an array 0 or 1

/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.print("Enter the size of an array: ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter " + size + " elements (only 0s and 1s):");
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Original Array:");
 * printArray(arr);
 * 
 * sortZeroesAndOnes(arr);
 * 
 * System.out.println("Sorted Array:");
 * printArray(arr);
 * 
 * input.close();
 * }
 * 
 * public static void printArray(int[] arr) {
 * for (int value : arr) {
 * System.out.print(value + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void sortZeroesAndOnes(int[] arr) {
 * int zeroCount = 0;
 * 
 * // Count number of zeroes
 * for (int num : arr) {
 * if (num == 0) {
 * zeroCount++;
 * }
 * }
 * 
 * // Fill zeros first
 * for (int i = 0; i < arr.length; i++) {
 * if (i < zeroCount) {
 * arr[i] = 0;
 * } else {
 * arr[i] = 1;
 * }
 * }
 * }
 * }
 */

// sort array even and odd

/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.print("Enter the size of an array: ");
 * int size = input.nextInt();
 * 
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter " + size + " elements:");
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Original Array:");
 * printArray(arr);
 * 
 * sortArrayParity(arr);
 * 
 * System.out.println("Sorted Array (Even first, Odd later):");
 * printArray(arr);
 * }
 * 
 * public static void printArray(int[] arr){
 * int size = arr.length;
 * for(int i = 0; i < arr.length; i++){
 * System.out.println(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void swap(int[] arr, int i, int j) {
 * int temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = temp;
 * }
 * 
 * public static void sortArrayParity(int[] arr) {
 * int left = 0, right = arr.length - 1;
 * 
 * while (left < right) {
 * 
 * // If left is odd and right is even → swap
 * if (arr[left] % 2 > arr[right] % 2) {
 * swap(arr, left, right);
 * }
 * 
 * // Move left pointer if it's even
 * if (arr[left] % 2 == 0) {
 * left++;
 * }
 * 
 * // Move right pointer if it's odd
 * if (arr[right] % 2 == 1) {
 * right--;
 * }
 * }
 * }
 * }
 */

// sorted square value
/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.print("Enter the size of an array: ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter " + size + " elements:");
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Original Array:");
 * printArray(arr);
 * 
 * int[] ans = sortSquared(arr);
 * 
 * System.out.println("Sorted Squared Array:");
 * printArray(ans);
 * }
 * 
 * public static void printArray(int[] arr) {
 * for (int value : arr) {
 * System.out.print(value + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void swap(int[] arr, int i, int j) {
 * int temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = temp;
 * }
 * 
 * public static int[] sortSquared(int[] arr) {
 * int size = arr.length;
 * int left = 0, right = size - 1;
 * int k = size - 1; // fill from the end for ascending order
 * int[] ans = new int[size];
 * 
 * while (left <= right) {
 * if (Math.abs(arr[left]) > Math.abs(arr[right])) {
 * ans[k--] = arr[left] * arr[left];
 * left++;
 * } else {
 * ans[k--] = arr[right] * arr[right];
 * right--;
 * }
 * }
 * return ans;
 * }
 * }
 */

// prefix sum

/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.print("Enter the size of an array: ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter " + size + " elements:");
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Input array:");
 * printArray(arr);
 * 
 * int[] pref = makePrefixSumArray(arr);
 * 
 * System.out.println("Prefix Sum array:");
 * printArray(pref);
 * }
 * 
 * public static void printArray(int[] arr) {
 * for (int value : arr) {
 * System.out.print(value + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static int[] makePrefixSumArray(int[] arr) {
 * int size = arr.length;
 * int[] pref = new int[size];
 * 
 * pref[0] = arr[0]; // first element stays same
 * 
 * for (int i = 1; i < size; i++) { // FULL LENGTH
 * pref[i] = pref[i - 1] + arr[i];
 * }
 * 
 * return pref;
 * }
 * }
 */

// prefix sum array form l to r from one index to other index

/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * System.out.print("Enter the size of an array: ");
 * int size = input.nextInt();
 * 
 * // Make array size+1 to use 1-based indexing
 * int[] arr = new int[size + 1];
 * 
 * System.out.println("Enter " + size + " elements:");
 * for (int i = 1; i <= size; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Input array:");
 * printArray(arr, size);
 * 
 * int[] prefSum = makePrefixSumArray(arr, size);
 * 
 * System.out.print("Enter number of queries: ");
 * int q = input.nextInt();
 * 
 * while (q-- > 0) {
 * System.out.print("Enter l and r: ");
 * int l = input.nextInt();
 * int r = input.nextInt();
 * 
 * // prefix sum query in O(1)
 * int ans = prefSum[r] - prefSum[l - 1];
 * 
 * System.out.println("Sum = " + ans);
 * }
 * }
 * 
 * public static void printArray(int[] arr, int size) {
 * for (int i = 1; i <= size; i++) {
 * System.out.print(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static int[] makePrefixSumArray(int[] arr, int size) {
 * int[] pref = new int[size + 1];
 * 
 * // pref[0] = 0 automatically
 * for (int i = 1; i <= size; i++) {
 * pref[i] = pref[i - 1] + arr[i];
 * }
 * return pref;
 * }
 * }
 */

// suffix sum

/*
 * public class Array{
 * public static void main(String[] args){
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * System.out.println("Enter "+ size + " element");
 * for(int i = 0; i < arr.length; i++){
 * arr[i] = input.nextInt();
 * }
 * 
 * System.out.println("Equal partition possible : "+ equalSumPartition(arr));
 * }
 * 
 * public static int findArraySum(int[] arr){
 * int totalSum = 0;
 * for(int i = 0; i < arr.length; i++){
 * totalSum += arr[i];
 * }
 * return totalSum;
 * }
 * 
 * public static boolean equalSumPartition(int[] arr){
 * int totalSum = findArraySum(arr);
 * 
 * int prefSum = 0;
 * for(int i = 0; i <arr.length; i++){
 * prefSum += arr[i];
 * int suffixSum = totalSum - prefSum;
 * if(suffixSum == prefSum){
 * return true;
 * }
 * }
 * return false;
 * }
 * }
 */

// To calculate median of two array

/*
 * public class Array {
 * public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
 * int m = nums1.length;
 * int n = nums2.length;
 * int[] mergedArray = new int[m + n];
 * 
 * int i = 0, j = 0, k = 0;
 * 
 * // Merge the two sorted arrays
 * while (i < m && j < n) {
 * if (nums1[i] <= nums2[j]) {
 * mergedArray[k++] = nums1[i++];
 * } else {
 * mergedArray[k++] = nums2[j++];
 * }
 * }
 * 
 * // Add remaining elements from nums1
 * while (i < m) {
 * mergedArray[k++] = nums1[i++];
 * }
 * 
 * // Add remaining elements from nums2
 * while (j < n) {
 * mergedArray[k++] = nums2[j++];
 * }
 * 
 * int totalLength = mergedArray.length;
 * 
 * // Calculate the median
 * if (totalLength % 2 == 1) {
 * return mergedArray[totalLength / 2];
 * } else {
 * return (double) (mergedArray[totalLength / 2 - 1] + mergedArray[totalLength /
 * 2]) / 2.0;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * System.out.print("Enter the size of the first array (nums1): ");
 * int m = scanner.nextInt();
 * int[] nums1 = new int[m];
 * System.out.println("Enter the elements of nums1 (sorted):");
 * for (int i = 0; i < m; i++) {
 * nums1[i] = scanner.nextInt();
 * }
 * 
 * System.out.print("Enter the size of the second array (nums2): ");
 * int n = scanner.nextInt();
 * int[] nums2 = new int[n];
 * System.out.println("Enter the elements of nums2 (sorted):");
 * for (int i = 0; i < n; i++) {
 * nums2[i] = scanner.nextInt();
 * }
 * 
 * double median = findMedianSortedArrays(nums1, nums2);
 * System.out.println("The median of the two sorted arrays is: " + median);
 * 
 * scanner.close();
 * }
 * }
 */

/*
 * public class Array {
 * public static void main(String[] args) {
 * ArrayList<Integer> arr = new ArrayList<>(4);
 * arr.add(1);
 * arr.add(2);
 * arr.add(3);
 * arr.add(9);
 * arr.add(8);
 * System.out.println(arr.size());
 * System.out.println(arr);
 * }
 * }
 */

/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * for (int i = 0; i < size; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * int count = 0;
 * for (int i = 0; i < size; i++) {
 * if (arr[i] != 0) {
 * arr[count++] = arr[i];
 * arr[i] = 0;
 * }
 * }
 * 
 * for (int i = 0; i < size; i++) {
 * System.out.print(arr[i] + " ");
 * }
 * }
 * }
 */

/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * for (int i = 0; i < arr.length; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * int countZero = 0, countOne = 0, countTwo = 0;
 * for (int i = 0; i < size; i++) {
 * if (arr[i] == 0) {
 * countZero++;
 * } else if (arr[i] == 1) {
 * countOne++;
 * } else if (arr[i] == 2) {
 * countTwo++;
 * }
 * }
 * 
 * int j = 0;
 * while (countZero > 0) {
 * arr[j++] = 0;
 * countZero--;
 * }
 * while (countOne > 0) {
 * arr[j++] = 1;
 * countOne--;
 * }
 * while (countTwo > 0) {
 * arr[j++] = 2;
 * countTwo--;
 * }
 * 
 * for (int i = 0; i < size; i++) {
 * System.out.print(arr[i] + " ");
 * }
 * }
 * }
 */

/*
 * public class Array {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * System.out.println("Enter the size of an array : ");
 * int size = input.nextInt();
 * int[] arr = new int[size];
 * 
 * for (int i = 0; i < size; i++) {
 * arr[i] = input.nextInt();
 * }
 * 
 * int max = Integer.MIN_VALUE;
 * int count = 0;
 * for (int i = 0; i < size; i++) {
 * if (arr[i] > max) {
 * max = arr[i];
 * count++;
 * }
 * }
 * System.out.println(count);
 * }
 * }
 */

/*
 * public class Array {
 * 
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * int n = input.nextInt();
 * int res = 1;
 * while (n > 0) {
 * res = res * (n % 10);
 * n = n / 10;
 * }
 * System.out.println(res);
 * }
 * }
 */
