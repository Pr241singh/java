package stacks;

import java.util.Stack;

public class removeConsequence {
  public static int[] remove(int[] arr) {
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < n; i++) {
      if (st.size() == 0 || st.peek() != arr[i])
        st.push(arr[i]);
      else if (arr[i] == st.peek()) {
        if (i == n - 1 || arr[i] != arr[i + 1])
          st.pop();
      }
    }
    int[] res = new int[st.size()];
    int m = res.length;
    for (int i = m - 1; i >= 0; i--) {
      res[i] = st.pop();
    }
    return res;
  }

  public static void main(String[] args) {
    // int[] arr = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
    // int[] res = remove(arr);
    // for (int i = 0; i < res.length; i++) {
    // System.out.print(res[i] + " ");
    // }

    int[] arr1 = { 1, 3, 2, 1, 8, 6, 3, 4 };
    int[] res1 = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      res1[i] = -1;
      for (int j = i + 1; j < arr1.length; j++) {
        if (arr1[j] > arr1[i]) {
          res1[i] = arr1[j];
          break;
        }
      }
    }
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < res1.length; i++) {
      System.out.print(res1[i] + " ");
    }
  }
}
