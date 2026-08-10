package LinkedList;

public class nthEndFromEnd {

  public static Node deleteNthFromEnd(Node head, int n) {
    Node slow = head;
    Node fast = head;

    for (int i = 0; i < n; i++) {
      if (fast == null) {

        return head;
      }
      fast = fast.next;
    }

    if (fast == null) {
      return head.next;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;

    return head;
  }

  public static Node nthNode(Node head, int n) {
    Node fast = head;
    Node slow = head;
    for (int i = 1; i <= n; i++) {
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }

    public static void display(Node head) {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Node a = new Node(100);
    Node b = new Node(50);
    Node c = new Node(30);
    Node d = new Node(70);
    Node e = new Node(80);
    Node f = new Node(40);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;

    System.out.print("Original list: ");
    Node.display(a);

    Node headAfterDeletion = deleteNthFromEnd(a, 3);
    System.out.print("List after deleting 3rd from end: ");
    Node.display(headAfterDeletion);

    Node q = nthNode(e, 1);
    System.out.println("The 1st node from end of sublist starting at 80 is: " + q.data);
  }
}
