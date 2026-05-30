package hashMap;

import java.util.*;

import LinkedList.doubleLL;

public class hashMapCode {
  static class HashMap<k, v> {
    class Node {
      k key;
      v value;

      public Node(k key, v value) {
        this.key = key;
        this.value = value;
      }
    }

    private int n;
    private int N;
    private LinkedList<Node> buckets[];

    @SuppressWarnings("unchecked")
    public HashMap() {
      this.N = 4;
      this.buckets = new LinkedList[4];
      for (int i = 0; i < 4; i++) {
        this.buckets[i] = new LinkedList<>();
      }
    }

    private int hashFunction(k key) {
      int bi = key.hashCode();
      return Math.abs(bi) % N;
    }

    public int searchInLL(k key, int bi) {
      LinkedList<Node> ll = buckets[bi];
      for (int i = 0; i < ll.size(); i++) {
        if (ll.get(i).key == key) {
          return i;
        }
      }
      return -1;
    }

    private void rehash() {
      LinkedList<Node> oldBucket[] = buckets;
      buckets = new LinkedList[N * 2];

      for (int i = 0; i < N * 2; i++) {
        buckets[i] = new LinkedList<>();
      }

      for (int i = 0; i < buckets.length; i++) {
        LinkedList<Node> ll = oldBucket[i];
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j);
          put(node.key, node.value);
        }
      }
    }

    public void put(k key, v value) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di == -1) {// key doesn't exist
        buckets[bi].add(new Node(key, value));
        n++;
      } else {
        Node data = buckets[bi].get(di);
        data.value = value;
      }

      double lambda = (double) n / N;
      if (lambda > 2.0) {
        rehash();
      }
    }

    public boolean containsKey(k key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di == -1) {
        return false;
      } else {
        return true;
      }
    }

    public v get(k key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di == -1) {
        return null;
      } else {
        Node node = buckets[bi].get(di);
        return node.value;
      }
    }

    public v remove(k key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di == -1) {
        return null;
      } else {
        Node node = buckets[bi].remove(di);
        n--;
        return node.value;
      }
    }

    public ArrayList<k> keySet() {
      ArrayList<k> keys = new ArrayList<>();
      for (int i = 0; i < buckets.length; i++) {
        LinkedList<Node> ll = buckets[i];
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j);
          keys.add(node.key);
        }
      }
      return keys;
    }

  }

  public static void main(String[] args) {
    HashMap<String, Integer> mp = new HashMap<>();
    mp.put("Preeti", 12);
    mp.put("Sonali", 13);
    mp.put("annu", 25);
    mp.put("Diksha", 26);
    System.out.println(mp.get("Sonali"));
    System.out.println(mp.get("Diksha"));
    System.out.println(mp.get("annu"));
    System.out.println(mp.remove("annu"));
    System.out.println(mp.containsKey("annu"));
    ArrayList<String> keys = mp.keySet();
    for (int i = 0; i < keys.size(); i++) {
      System.out.println(keys.get(i) + " " + mp.get(keys.get(i)));
    }
  }
}
