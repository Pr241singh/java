import java.util.Scanner;

//increasing bubble sort
/*public class Sorting{
  public static void main(String[] args){
    int[] a = {8,7,2,5,4};
    bubblesort(a);

    for(int i : a){
      System.out.println(i);
    }
  }

  public static void bubblesort(int[] a)
  {
    int n = a.length;
    for(int i = 0; i < n-1; i++){
      for(int j = 0; j < n-1; j++){
        if(a[j] > a[j+1]){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
  }
}*/

//increasing bubble sort o(1) space complexity n^2 time complexity
/*public class Sorting{
  public static void main(String[] args){
    int[] a = {5,7, 4,8,9};
    bubblesort(a);

    for(int i : a){
      System.out.println(i);
    }
  }

  public static void bubblesort(int[] a){
    int n = a.length;
    
    for(int i = 0; i < n-1; i++){
      boolean swaped = false;
      for(int j = 0; j < n-1; j++){
        if(a[j] > a[j+1]){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
          swaped = true;
        }
      }
        if(!swaped){
        return;
      }
    }
  }
}*/

//decreasing bubble sort
/*public class Sorting{
  public static void main(String[] args){
    int[] a = {5,8,2,4,6};
    bubblesort(a);

    for(int i : a){
      System.out.println(i);
    }
  }

  public static void bubblesort(int[] a){
    int n = a.length;

    for(int i = 0; i < n-1; i++){
      for(int j = 0; j < n-i-1; j++){
        if(a[j] < a[j+1]){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
  }
}*/

//Selection Sorting in decreasing order
/*public class Sorting{
  public static void main(String[] args){
    int[] a = {5,2,7,3,9};
    selectionsort(a);

    for(int i : a){
      System.out.println(i);
    }
  }

  public static void selectionsort(int[] a){
    int n = a.length;
    for(int i = 0; i < n-1; i++){
      
      int min_index = i;
      for(int j = i+1; j < n; j++){
        if(a[j] < a[min_index]){
          min_index = j;
        }
      }
      
      int temp = a[i];
      a[i] = a[min_index];
      a[min_index] = temp;
    }
  }
}*/

//selection sorting decreasing order
/*public class Sorting{
  public static void main(String[] args){
    int[] a = {6,3,2,8,5,9};

    selectionsort(a);
    for(int i : a){
      System.out.println(i);
    }
  }

  public static void selectionsort(int[] a){
    int n = a.length;
    for(int i = 0; i < n-1; i++){
      int min_index = i;

      for(int j = i+1; j < n; j++){
        if(a[j] > a[min_index]){
          min_index = j;
        }
      }

      int temp = a[i];
      a[i] = a[min_index];
      a[min_index] = temp;
    }
  }
}*/

//Insertion sorting for increasing order

/*public class Sorting{
  public static void main(String[] args){
    int[] a = {5,8,3,9,4};
    insetionSort(a);

    for(int i : a){
      System.out.println(i);
    }
  }

  public static void insetionSort(int[] a){
    int n = a.length;

    for(int i = 1; i < n; i++){
      for(int j = i; j > 0 && a[j] < a[j-1]; j--){
        int temp = a[j];
        a[j] = a[j-1];
        a[j-1] = temp;
      }
    }
  }
}*/

//Insertion sort for increasing using while loop

/*public class Sorting{
  public static void main(String[] args){
    int[] a = {6,3,8,5,1,9};
    insetionSort(a);

    for(int value : a){
      System.out.println(value);
    }
  }

  public static void insetionSort(int[] a){
    int n = a.length;

    for(int i = 1; i < n; i++){

      int j = i;
      while(j > 0 && a[j] < a[j-1]){
        int temp = a[j];
        a[j] = a[j-1];
        a[j-1] = temp;

        j--;
      }
    }
  }
}*/

//Insertion sorting for decreasing

/*public class Sorting{
  public static void main(String[] args){
    int[] a = {5,8,3,9,4};
    insetionSort(a);

    for(int i : a){
      System.out.println(i);
    }
  }

  public static void insetionSort(int[] a){
    int n = a.length;

    for(int i = 1; i < n; i++){
      for(int j = i; j > 0 && a[j] > a[j-1]; j--){
        int temp = a[j];
        a[j] = a[j-1];
        a[j-1] = temp;
      }
    }
  }
}*/

//Questions on sorting 
//Q1 : Given an integer array arr, move all 0's to the end of it while maintaing the relative order pf the non-zero elements. for ex : 0 5 0 3 4 2, 5 3 4 2 0 0

/*public class Sorting{
  public static void main(String[] args){
    int[] a = {0,5,0,3,4,2};
    bubblesort(a);

    for(int i : a){
      System.out.println(i);
    }
  }

  public static void bubblesort(int[] a){
    int n = a.length;

    for(int i = 0; i < n-1; i++){
      for(int j = 0; j < n-1; j++){
        if(a[j] == 0 && a[j+1] != 0){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
  }
}*/

//Q2 : Give an array of names of the fruits; you are supposed to sort it in lexicographical order using the slection sort for ex : ["papaya","lime","watermelon","apple", "mango","kiwi"],["apple","kiwi","lime","mango","papaya","watermelon"]

/*public class Sorting{
  public static void main(String[] args){
    String[] fruits = {"papaya","lime","watermelon","apple", "mango","kiwi"};
    stringSort(fruits);

    for(String i : fruits){
      System.out.println(i);
    }
  }

  public static void stringSort(String[] fruits){
    int n = fruits.length;

    for(int i = 0; i < n-1; i++){
      int min_index = i;

      for(int j = i; j < n; j++){
        if(fruits[j].compareTo(fruits[min_index]) < 0){
          min_index = j;
        }
      }

      String temp = fruits[i];
      fruits[i] = fruits[min_index];
      fruits[min_index] = temp;
    }
  }
}*/

//Merge sort

/*public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 8, 6};
        int n = arr.length;
        System.out.println("Array before sorting:"); // Corrected print statement
        displayArray(arr);
        mergeSort(arr, 0, n - 1); // Corrected right index
        System.out.println("\nArray after sorting:"); // Corrected print statement with newline
        displayArray(arr);
    }

    public static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " "); // Corrected print statement
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;

        for (i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        i = 0;
        j = 0;
        k = l;

        // Main while loop to merge the two halves
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) { // Changed < to <= for stable sort
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // While loops to handle remaining elements (moved outside the main loop)
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2; // More robust mid calculation to prevent overflow
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
}*/

//merge sort for decreasing

/*public class Sorting{
  public static void main(String[] args){
    int[] arr = {8,3,5,2,7,8};
    int n = arr.length;
    System.out.println("Array before sorting");
    displayArray(arr);

    mergeSort(arr, 0, n-1);
    System.out.println("\nArray after sorting"); // Added newline for clarity
    displayArray(arr);
  }

  public static void displayArray(int[] arr){
    for(int value : arr){
      System.out.print(value + " "); // Added space for readability
    }
  }

  public static void merge(int[] arr, int l, int mid, int r){
    int n1 = mid-l+1;
    int n2 = r-mid;
    int[] left = new int[n1];
    int[] right = new int[n2];
    int i,j,k;

    for(i = 0; i < n1; i++){
      left[i] = arr[l + i];
    }
    for(j = 0; j < n2; j++){
      right[j] = arr[mid + 1 + j];
    }

    i = 0;
    j = 0;
    k = l;

    while(i < n1 && j < n2){
      if(left[i] >= right[j]){
        arr[k++] = left[i++];
      }
      else{
        arr[k++] = right[j++];
      }
    }

    while(i < n1){
      arr[k++] = left[i++];
    }
    while(j < n2){
      arr[k++] = right[j++];
    }
  }

  public static void mergeSort(int[] arr, int l, int r){
    if(l >= r){
      return;
    }

    int mid = (l + r) / 2;
    mergeSort(arr, l, mid);
    mergeSort(arr, mid+1, r);
    merge(arr, l, mid, r);
  }
}*/

//Quick Sort for Increasing order

/*public class Sorting{
  public static void main(String[] args){
    int[] arr = {7,4,5,9,3,8};
    System.out.println("Array before sorting : ");
    displayArray(arr);
    System.out.println("/n");
    quickSort(arr, 0, arr.length-1);
    System.out.println("Array after sorting : ");
    displayArray(arr);
  }

  public static void displayArray(int[] arr){
    for(int val : arr){
      System.out.print(val + " ");
    }
  }

  public static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public static int partition(int[] arr, int st, int end){
    int pivot = arr[st];
    int count = 0;
    for(int i = st+1; i <= end; i++){
      if(arr[i] < pivot){
        count++;
      }
    }

    int pivotIdx = st + count;
    swap(arr, pivotIdx, st);

    int i = st; 
    int j = end;

    while(i < pivotIdx && j > pivotIdx){
      while(arr[i] <= pivotIdx) i++;
      while(arr[j] > pivotIdx) j--;

      if(i < pivotIdx && j > pivotIdx){
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    return pivotIdx;
  }

  public static void quickSort(int[] arr, int st, int end){
    if(st >= end){
      return;
    }

    int pi = partition(arr, st, end);
    quickSort(arr, st, pi-1);
    quickSort(arr, pi+1, end);
  }
}*/

//quick sort for decreasing order

/*public class Sorting{
  public static void main(String[] args){
    int[] arr = {7,4,5,9,3,8};
    System.out.println("Array before sorting : ");
    displayArray(arr);
    System.out.println("\n");
    quickSort(arr, 0, arr.length-1);
    System.out.println("Array after sorting (descending): ");
    displayArray(arr);
  }

  public static void displayArray(int[] arr){
    for(int val : arr){
      System.out.print(val + " ");
    }
  }

  public static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public static int partition(int[] arr, int st, int end){
    int pivot = arr[st];
    int count = 0;
    for(int i = st+1; i <= end; i++){
      if(arr[i] > pivot){ 
        count++;
      }
    }

    int pivotIdx = st + count;
    swap(arr, pivotIdx, st);

    int i = st; 
    int j = end;

    while(i < pivotIdx && j > pivotIdx){
      while(arr[i] >= pivot){
         i++;
        } 
      while(arr[j] <= pivot){
         j--;
        } 
      if(i < pivotIdx && j > pivotIdx){
        swap(arr, i, j);
        i++;
        j--;
      }
    }
    return pivotIdx;
  }

  public static void quickSort(int[] arr, int st, int end){
    if(st >= end){
      return;
    }

    int pi = partition(arr, st, end);
    quickSort(arr, st, pi-1);
    quickSort(arr, pi+1, end);
  }
}*/

//Count Sort, Radix Sort, Bucket Sort

//Count sort for decreasing order

/*public class Sorting{
  public static void main(String[] args){
    int[] arr = {6, 3, 8, 5, 2, 4, 9};
    basicCountSort(arr);
    System.out.println("Array after Sorting : ");
    displayArray(arr);
  }
  
  public static int findMax(int[] arr){
    int mx = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > mx){
        mx = arr[i];
      }
    }
    return mx;
  }

  public static void displayArray(int[] arr){
    for(int val : arr){
      System.out.print(val+ " ");
    }
    System.out.println();
  }

  public static void basicCountSort(int[] arr){
    int max = findMax(arr);
    int[] count = new int[max + 1];

    for(int i = 0; i < arr.length; i++){
      count[arr[i]]++;
    }
    int k = 0;

    for(int i = 0; i < count.length; i++){
      for(int j = 0; j < count[i]; j++){
        arr[k++] = i;
      }
    }
  }
}*/

//Count sort stable approach

/*public class Sorting {
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 2, 5, 8, 3, 9};
        countSort(arr);
        displayArray(arr);
    }

    public static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    public static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void countSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n]; 
        int max = findMax(arr);
        int[] count = new int[max + 1]; 

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1]; 
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1; 
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}*/

//Radix Count

/*public class Sorting {
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 2, 5, 8, 3, 9};
        radixSort(arr);
        displayArray(arr);
    }

    public static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    public static void displayArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n]; 
        int[] count = new int[10];

        for(int i = 0; i < n; i++){
          count[(arr[i] / place)% 10]++;
        }

        for(int i = 1; i < count.length; i++){
          count[i] += count[i-1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i] / place)% 10] - 1; 
            output[idx] = arr[i];
            count[(arr[i] / place)% 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }        
    }

  static void radixSort(int[] arr) {
    int max = findMax(arr);
      for (int place = 1; max / place > 0; place *= 10) {
        countSort(arr, place);      
    }
  }
}*/

//Questions on Sorting

/*public class Sorting{
  public static void main(String[] args){
    int[] arr = {10, 5, 6, 7, 8, 9, 3};
    sortArr(arr);
    displayArray(arr);
  }

  public static void displayArray(int[] arr){
    for(int val : arr){
      System.out.print(val + " ");
    }
    System.out.println();
  }

  public static void sortArr(int[] arr){
    int n = arr.length;
    int x = -1; int y = -1;
    if(n <= 1){
      return;
    }

    for(int i = 1; i < n; i++){
      if(arr[i-1] > arr[i]){
        if(x == -1){
          x = i-1;
          y = i;
        }
        else{
          y = i;
        }
      }
    }

    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
}*/

//Questions on sorting Given an array of positive and negative integers, segregate them in linear time and constant space. The output should print all negative numbers, followed by all positive numbers.

/*public class Sorting{
  public static void main(String[] args){
    int[] arr = {-13, 20, 7, 8, -4, -13, 5,-11,-13};
    partition(arr);
    displayArray(arr);
  }

  public static void displayArray(int[] arr){
    for(int val : arr){
      System.out.print(val + " ");
    }
    System.out.println();
  }

  public static void partition(int[] arr){
    int n = arr.length;
    int l = 0; int r = n - 1;

    while(l < r){
      while(arr[l] < 0){
        l++;
      }
      while(arr[r] >= 0){
        r--;
      }

      if(l < r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
      }
    }
  }
}*/

//Given an array of positive and negative integer, segregate them in a linear time and constant space. The output should print all negative numbers, followed by all positive numbers

/*public class Sorting{
  public static void main(String[] args){
    int[] arr = {1,0,2,0,1,2,0,1};
    sort123(arr);
    displayArray(arr);
  }

  public static void displayArray(int[] arr){
    for(int val : arr){
      System.out.print(val + " ");
    }
    System.out.println();
  }

  public static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }

  public static void sort123(int[] arr){
    int lo = 0, mid = 0, hi = arr.length-1;

    while(mid <= hi){
      if(arr[mid] == 0){
        swap(arr,mid,lo);
        mid++;
        lo++;
      }
      else if(arr[mid] == 1){
        mid++;
      }
      else{
        swap(arr, mid, hi);
        hi--;
      }
    }
  }
}*/

//2nd approach to solve this question Given an array of positive and negative integer, segregate them in a linear time and constant space. The output should print all negative numbers, followed by all positive numbers

public class Sorting{
  public static void main(String[] args){
    int[] arr = {1,0,2,0,1,2,0,1};
    sort012(arr);
    displayArray(arr);
  }

  public static void displayArray(int[] arr){
    for(int val : arr){
      System.out.print(val + " ");
    }
    System.out.println();
  }

  public static void sort012(int[] arr){
    int count0 = 0, count1 = 0, count2 = 0;

    for(int j : arr){
      if(j == 0){
        count0++;
      }
      else if(j == 1){
        count1++;
      }
      else{
        count2++;
      }
    }

    int k = 0;
    while(count0 > 0){
      arr[k++] = 0;
      count0--;
    }
    
    while(count1 > 0){
      arr[k++] = 1;
      count1--;
    }

    while(count2 > 0){
      arr[k++] = 2;
      count2--;
    }
  }
}