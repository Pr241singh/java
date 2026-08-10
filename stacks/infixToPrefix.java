package stacks;

import java.util.Stack;

public class infixToPrefix {
  public static void main(String[] args) {
    String infix = "9-(5+3)*4/6";
    Stack<String> val = new Stack<>();
    Stack<Character> op = new Stack<>();

    for (int i = 0; i < infix.length(); i++) {
      char ch = infix.charAt(i);

      // 1. Sirf Numbers ke liye check (48-57)
      if (ch >= '0' && ch <= '9') {
        val.push(ch + "");
      } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
        op.push(ch);
      } else if (ch == ')') {
        while (op.peek() != '(') {
          String v2 = val.pop();
          String v1 = val.pop();
          char o = op.pop();
          val.push(o + v1 + v2); // Order: o+v1+v2
        }
        op.pop();
      } else {
        // 2. Precedence logic: + aur - ke liye pehle purana solve karo
        if (ch == '+' || ch == '-') {
          // Jab tak stack mein high priority (*, /) ya same (+, -) hai
          while (!op.isEmpty() && op.peek() != '(') {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(o + v1 + v2);
          }
          op.push(ch);
        } else if (ch == '*' || ch == '/') {
          // Sirf agar upar * ya / ho tabhi solve karo
          if (op.peek() == '*' || op.peek() == '/') {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            val.push(o + v1 + v2);
            op.push(ch);
          } else {
            op.push(ch);
          }
        }
      }
    } // For loop khatam yahan

    while (val.size() > 1 && !op.isEmpty()) {
      String v2 = val.pop();
      String v1 = val.pop();
      char o = op.pop();
      val.push(o + v1 + v2);
    }

    System.out.print(val.pop());
  }
}
