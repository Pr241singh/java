package stacks;

//import java.util.ArrayList;
import java.util.Stack;

public class basicsOfStacks {
  public static void main(String[] args) {
    // like arraylist
    // ArrayList<Integer> val = new ArrayList<>();
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(5);
    st.push(8);
    st.push(3);
    st.push(4);
    System.out.println(st + " ");
    System.out.println(st.peek() + " ");
    System.out.println(st.size() + " ");
    while (st.size() >= 4) {
      st.pop();
    }
    System.out.println(st.peek() + " ");
    System.out.println(st + " ");
  }
}
