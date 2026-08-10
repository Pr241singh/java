package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Queues.arrayImplement.queueA;

public class reverseQueue {
  public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // q.add(4);
    // q.add(5);
    // System.out.println(q);
    // Stack<Integer> st = new Stack<>();
    // while (q.size() > 0) {
    // st.push(q.remove());
    // }

    // while (st.size() > 0) {
    // q.add(st.pop());
    // }
    // System.out.println(q);

    // reverse first k element

    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q);
    int n = q.size();
    int k = 3;
    Stack<Integer> st = new Stack<>();
    for (int i = 0; i < k; i++) {
      st.push(q.remove());
    }
    for (int i = 0; i <= n - k; i++) {
      q.add(st.pop());
    }
    System.out.println(q);
  }
}
