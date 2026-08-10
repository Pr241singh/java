package LinkedList;

public class reverseList {
  public static class Node {
    int val;
    Node next;

    Node(int val) {
      this.val = val;
    }
  }

  public static void display(Node head) {
    if (head == null) {
      return;
    }
    System.out.println(head.val + " ");
    display(head.next);
  }

  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = null;
    display(a);
  }
}
