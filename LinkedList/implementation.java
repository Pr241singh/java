package LinkedList;

public class implementation {
  public static class LinkedList {
    Node head = null;
    Node tail = null;

    void insertEnd(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = temp;
      } else {
        tail.next = temp;
      }
      tail = temp;
    }

    // Using recursion display

    public static void displayr(Node head) {
      if (head == null) {
        return;
      }
      System.out.print(head.data + " ");
      displayr(head.next);
    }

    // Using recursion display reverse elements
    public static void displayReverse(Node head) {
      if (head == null) {
        return;
      }
      displayReverse(head.next);
      System.out.print(head.data + " ");
    }

    void insertAtHead(int val) {
      Node temp = new Node(val);
      if (head == null) {
        head = tail = temp;
      } else {
        temp.next = head;
        head = temp;
      }
    }

    void deleteAt(int idx) {
      Node temp = head;
      for (int i = 1; i < idx - 1; i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
      tail = temp.next;
    }

    void insertAt(int idx, int val) {
      Node t = new Node(val);
      Node temp = head;
      if (idx == size()) {
        insertEnd(val);
        return;
      } else if (idx == 0) {
        insertAtHead(val);
        return;
      } else if (idx < 0 || idx > size()) {
        System.out.println("Wrong index");
        return;
      }
      for (int i = 1; i <= idx - 1; i++) {
        temp = temp.next;
      }
      t.next = temp.next;
      temp.next = t;
    }

    int getAt(int idx) {
      if (idx < 0 || idx > size()) {
        System.out.println("Wrong index");
        return -1;
      }
      Node temp = head;
      for (int i = 1; i < idx; i++) {
        temp = temp.next;
      }
      return temp.data;
    }

    void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    }

    int size() {
      Node temp = head;
      int count = 0;
      while (temp != null) {
        count++;
        temp = temp.next;
      }
      return count;
    }
  }

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insertEnd(4);
    ll.insertEnd(5);
    ll.insertEnd(9);
    ll.display();
    System.out.println(ll.size());

    ll.insertAtHead(10);
    ll.display();

    ll.insertAt(2, 8);
    ll.display();

    ll.insertAt(0, 100);
    ll.display();

    System.out.println(ll.getAt(2));

    System.out.println("Displaying the linked list using displayr method:");
    ll.displayr(ll.head);
    System.out.println();

    ll.displayReverse(ll.head);
    System.out.println();

    ll.deleteAt(2);
    ll.display();
  }
}
