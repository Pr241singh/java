package stacks;

public class llImplement {
  public static class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }

  public static class LLStack {
    Node head = null;
    int size = 0;

    void push(int x) {
      Node temp = new Node(x);
      temp.next = head;
      head = temp;
      size++;
    }

    void displayRec(Node h) {
      if (h == null) {
        return;
      }
      displayRec(h.next);
      System.out.print(h.val + " ");
    }

    void display() {
      displayRec(head);
    }

    void displayRev() {
      Node temp = head;
      while (temp != null) {
        System.out.println(temp.val + " ");
        temp = temp.next;
      }
      System.out.println();
    }

    int pop() {
      if (head == null) {
        System.out.println("Stack is empty");
        return -1;
      }
      int x = head.val;
      head = head.next;
      return x;
    }

    int peek() {
      if (head == null) {
        System.out.println("Stack is empty");
        return -1;
      }
      return head.val;
    }

    int size() {
      return size;
    }
  }

  public static void main(String[] args) {
    LLStack st = new LLStack();
    st.push(1);
    st.push(4);
    st.push(5);
    st.display();
    System.out.println(st.size());
    st.pop();
    st.display();
  }
}
