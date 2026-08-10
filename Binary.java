//Binary search Algorithm
/*public class Binary{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int x = 0;
    while(x != 10){
      System.out.printf("%d exists in arr %b \n", x, binarySearch(arr, x));
      x++;
    }
  }

  public static boolean binarySearch(int[] arr, int x){
    int n = arr.length;
    int st = 0, end = n-1;

    while(st <= end){
      int mid = st + (end - st)/2;
      if(x == arr[mid]){
        return true;
      }
      else if(x < arr[mid]){
        end = mid-1;
      }
      else{
        st = mid+1;
      }
    }
    return false;
  }
}*/

//Binary search using recursion method

/*public class Binary{
  public static void main(String[] args){
    int[] arr = {2,3,4,5,6,7,8,9};
    int target = 0;
    while(target != 10){
      System.out.printf("%d exists in arr %b \n", target, binarySearch(arr, 0, arr.length-1, target));
      target++;
    }
  }

  public static boolean binarySearch(int[] arr,int st, int end,int target){
    if(st > end){
      return false;
    }

    int mid = st + (end - st)/2;
    if(target == arr[mid]){
      return true;
    }
    else if(target < arr[mid]){
      return binarySearch(arr, st, mid-1, target);
    }
    else{
      return binarySearch(arr, mid+1, end, target);
    }
  }
}*/

//Find the first occurance of a given element x, given that the given array is sorted, if no occurance of x is found than return -1 for ex : arr = {2,5,5,5,6,6,8,9,9,9}, x = 5, output = 1

/*public class Binary{
  public static void main(String[] args){
    int[] arr = {2,5,5,5,6,6,8,9,9,9};
    int target = 6;
    System.out.println(binarySearch(arr, target));
  }

  public static int binarySearch(int[] arr, int target){
    int n = arr.length;
    int st = 0;
    int end = n-1;
    int fi = -1;

    while(st <= end){
      int mid = st+ (end- st)/2;

      if(arr[mid] == target){
        fi = mid;
        end = mid-1;
      }
      else if(target < arr[mid]){
        end = mid-1;
      }
      else{
        st = mid+1;
      }
    }
    return fi;
  }
}*/

//Find the square root of the given non negative value x.Round it off to the nearest floor integer value for ex: x = 4, output = 2, x = 24, output = 4

/*public class Binary{
  public static void main(String[] args){
    int x = 25;
    System.out.println(sqrt(x));
  }

  public static int sqrt(int x){
    int st = 0; 
    int end = x;
    int ans = -1;

    while(st <= end){
      int mid = st+(end-st)/2;
      int val = mid*mid;

      if(val == x){
        return mid;
      }
      else if(val < x){
        ans = mid;
        st = mid+1;
      }
      else{
        end = mid-1;
      }
    }
    return ans;
  } 
}*/

//Searching in Rotated Sorted array find min val rotated array example 1,2,3,4 output 2,3,4,1
//A rotated array is a sorted array on which rotation operation has been performed some number of times. Given a sorted array, find the index of the minimum element in the array it is guaranteed that all the elements in the array are unique Array = {3,4,5,1,2} output = 3

/*public class Binary{
  public static void main(String[] args){
    int[] arr = {4,3,5,8,2};
    System.out.println("minimum no at the index : "+ rotated(arr));
  }

  public static int rotated(int[] arr){
    int n = arr.length;
    int st = 0;
    int end = n-1;
    int ans = -1;

    while(st <= end){
      int mid = st + (end-st)/2;
      if(arr[mid] <= arr[n-1]){
        ans = mid;
        end = mid - 1;
      }
      else{
        st = mid + 1;
      }
    }
    return ans;
  }
}*/

//Given the rotated sorted array of integers, which contain distinct elements, and an integer target if it is in the array. otherwisw return -1. for ex array = [3,4,5,1,2] target = 4

/*public class Binary {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 4;
        System.out.println("target at index : " + rotated(arr, target));
    }

    public static int rotated(int[] arr, int target) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[st] <= arr[mid]) {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } 
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}*/

//Search element in an sorted array with duplicate elements. Return true if element is found else return false.

/*public class Binary {
  public static void main(String[] args) {
    int[] arr = {0, 0, 0, 1, 1, 1, 2, 0, 0, 0};
    int target = 2;
    System.out.println(rotated(arr, target)); 
    int target2 = 3;
    System.out.println(rotated(arr, target2)); 
  }

  public static boolean rotated(int[] arr, int target) {
    int st = 0;
    int end = arr.length - 1;

    while (st <= end) {
      int mid = st + (end - st) / 2; 

      if (arr[mid] == target) {
        return true;
      }
      if (arr[st] == arr[mid] && arr[end] == arr[mid]) {
        st++;
        end--;
      } 
      else if (arr[st] <= arr[mid]) {
        if (target >= arr[st] && target < arr[mid]) {
          end = mid - 1;
        } else {
          st = mid + 1;
        }
      } 
      else {
        if (target > arr[mid] && target <= arr[end]) {
          st = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return false;
  }
}*/
