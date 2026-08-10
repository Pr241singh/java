package stacks;

import java.util.Stack;

public class displayStack {
  public static void display(Stack<Integer> st) {
    if (st.size() == 0) {
      return;
    }
    int x = st.pop();
    // System.out.print(x + " ");
    display(st);
    st.push(x);
    System.out.print(x + " ");
  }

  public static void insertAtBottom(Stack<Integer> st) {
    if (st.size() == 0) {
      return;
    }

    int x = st.push(10);
    display(st);
    // st.push(x);
    // System.out.print(x + " ");
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    // display(st);
    insertAtBottom(st);
    // System.out.println(st);
    // method 1 for print stack
    // Stack<Integer> rt = new Stack<>();
    // while (st.size() > 0) {
    // rt.push(st.pop());
    // }

    // while (rt.size() > 0) {
    // int x = rt.pop();
    // System.out.print(x + " ");
    // st.push(x);
    // }

    // method 2 for printing stack
    // int n = st.size();
    // int[] arr = new int[n];
    // for (int i = n - 1; i >= 0; i--) {
    // arr[i] = st.pop();
    // }
    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i] + " ");
    // st.push(arr[i]);
    // }

  }
}
