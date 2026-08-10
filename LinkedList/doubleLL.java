package LinkedList;

public class doubleLL {
  public static class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
      this.val = val;
    }
  }

  public static void display(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void displayr(Node tail) {
    Node temp = tail;
    while (temp != null) {
      System.err.print(temp.val + " ");
      temp = temp.prev;
    }
    System.out.println();
  }

  public static void display2(Node random) {
    Node temp = random;
    while (temp.prev != null) {
      temp = temp.prev;
    }

    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static Node insertAtHead(Node head, int x) {
    Node t = new Node(30);
    t.next = head;
    head.prev = t;
    head = t;
    return head;
  }

  public static void insertAtTail(Node head, int x) {
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }

    Node t = new Node(x);
    temp.next = t;
    t.prev = temp;
  }

  public static void inserAtMid(Node head, int idx, int x) {
    Node s = head;
    for (int i = 0; i < idx - 1; i++) {
      s = s.next;
    }

    Node r = s.next;
    Node t = new Node(x);
    s.next = t;
    r.prev = s;
    t.next = r;
    r.prev = t;
  }

  public static Node deleteIdx(Node head, int idx) {
    Node temp = head;
    for (int i = 1; i < idx - 1; i++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;
    temp.next.prev = temp;

    return head;
  }

  public static void circularLL(Node head) {
    if (head == null) {
      return;
    }
    Node temp = head;
    while (temp != head) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node a = new Node(1);
    Node b = new Node(2);
    Node c = new Node(3);
    Node d = new Node(4);
    Node e = new Node(5);

    a.prev = null;
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    e.next = null;
    // display(a);
    // displayr(e);
    // display2(b);
    // Node newHead = insertAtHead(a, 9);
    // display(newHead);
    display(a);
    insertAtTail(a, 8);
    display(a);
    inserAtMid(a, 3, 56);
    display(a);
    deleteIdx(a, 2);
    display(a);
    circularLL(a);
  }
}
