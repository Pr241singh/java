package Queues;

public class circularQueueArray {
  public static class cqa {
    int front = -1;
    int rear = -1;
    int size = 0;
    int[] arr = new int[8];

    public void add(int val) throws Exception {
      if (size == arr.length)
        throw new Exception("Queue is full");
      if (size == 0) {
        front = rear = 0;
      } else {
        rear = (rear + 1) % arr.length; // Correct circular wrap
      }
      arr[rear] = val;
      size++;
    }

    public int remove() throws Exception {
      if (size == 0)
        throw new Exception("Queue is empty"); // Correct underflow check
      int val = arr[front];
      front = (front + 1) % arr.length; // Correct circular wrap
      size--;
      return val;
    }

    public int peek() throws Exception {
      if (size == arr.length) {
        throw new Exception("Queue is full");
      } else
        return arr[front];
    }

    public boolean isEmpty() {
      return size == 0; // Simplified logic
    }

    public void display() {
      if (size == 0) {
        System.out.println("Queue is empty");
        return;
      }
      int count = 0;
      int i = front;
      while (count < size) {
        System.out.print(arr[i] + " ");
        i = (i + 1) % arr.length; // Navigate circularly
        count++;
      }
      System.out.println();
    }

  }

  public static void main(String[] args) throws Exception {
    cqa q = new cqa();
    q.display();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.display();
    q.remove();
    q.display();
    System.out.println(q.peek());
    System.out.println(q.size);
  }
}
