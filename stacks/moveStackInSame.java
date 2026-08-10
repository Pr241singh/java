package stacks;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSame {
  public static void main(String[] args) {
    // for taking input in a stack
    // Scanner input = new Scanner(System.in);
    // Stack<Integer> st = new Stack<>();
    // System.out.println("Enter the size of stack : ");
    // int n = input.nextInt();
    // System.out.println("Enter the elements : ");
    // for (int i = 1; i <= n; i++) {
    // int x = input.nextInt();
    // st.push(x);
    // }
    // System.out.print(st + " ");

    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    Stack<Integer> rt = new Stack<>();
    while (st.size() > 0) {
      int x = st.peek();
      rt.push(x);
      st.pop();
    }
    System.out.println(rt + " ");

    Stack<Integer> gt = new Stack<>();
    while (rt.size() > 0) {
      gt.push(rt.pop());
    }
    System.out.println(gt + " ");

    Stack<Integer> tt = new Stack<>();
    tt.push(1);
    tt.push(2);
    tt.push(3);
    tt.push(4);
    tt.push(5);
    int idx = 2;
    int x = 7;
    Stack<Integer> temp = new Stack<>();
    while (tt.size() > idx) {
      temp.push(tt.pop());
    }
    tt.push(x);
    while (temp.size() > 0) {
      tt.push(temp.pop());
    }
    System.out.println(tt);
  }
}
