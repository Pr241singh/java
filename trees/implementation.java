package trees;

public class implementation {
  public static class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
      this.val = val;
    }
  }

  public static int size(Node root) {
    if (root == null)
      return 0;
    return 1 + size(root.left) + size(root.right);
  }

  public static int sum(Node root) {
    if (root == null)
      return 0;
    return root.val + sum(root.left) + sum(root.right);
  }

  public static int max(Node root) {
    if (root == null)
      return Integer.MIN_VALUE;
    int a = root.val;
    int b = max(root.left);
    int c = max(root.right);
    return Math.max(a, Math.max(b, c));
  }

  public static void display(Node root) {
    if (root == null)
      return;
    System.out.print(root.val + " ->");
    if (root.left != null)
      System.out.print(root.left.val + " ");
    if (root.right != null)
      System.out.print(root.right.val);
    System.out.println();
    display(root.left);
    display(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(2);
    Node a = new Node(4);
    Node b = new Node(5);
    root.left = a;
    root.right = b;
    Node c = new Node(6);
    Node d = new Node(7);
    a.left = c;
    a.right = d;
    Node e = new Node(8);
    b.right = e;
    display(root);
    System.out.println(size(root));
    System.out.println(sum(root));
    System.out.println(max(root));
  }
}
