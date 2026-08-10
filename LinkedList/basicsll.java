package LinkedList;

public class basicsll {

  public static void displayr(Node head) {
    if (head == null)
      return;
    System.out.print(head.data + " ");
    displayr(head.next);
  }

  public static void displayreverse(Node head) {
    if (head == null)
      return;
    displayreverse(head.next);
    System.out.print(head.data + " ");
  }

  public static void display(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  public static int length(Node head) {
    int count = 0;
    while (head != null) {
      count++;
      head = head.next;
    }
    return count;
  }

  public static class Node {
    int data;
    Node next;

    Node(int data) { // constructor
      this.data = data;
    }
  }

  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(6);
    Node c = new Node(7);
    Node d = new Node(8);
    Node e = new Node(9);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    // System.out.println(a.data);
    // System.out.println(a.next.data);
    // System.out.println(a.next.next.data);
    // System.out.println(a.next.next.next.data);

    // from for loop
    // Node temp = a;
    // for (int i = 1; i <= 5; i++) {
    // System.out.print(temp.data + " ");
    // temp = temp.next;
    // }

    // from while loop preferable
    // Node temp = a;
    // while (temp != null) {
    // System.out.print(temp.data + " ");
    // temp = temp.next;
    // }

    display(a);
    System.out.println();
    displayr(a);
    System.out.println();
    displayreverse(a);
    System.out.println();
    System.out.println(length(a));
  }
}
