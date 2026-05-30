package hashMap;

import java.util.*;

public class main {
  static void hashMapMethod() {
    Map<String, Integer> mp = new HashMap<>();
    mp.put("Preeti", 12);
    mp.put("Sonali", 13);
    mp.put("annu", 25);
    mp.put("Diksha", 26);
    System.out.println(mp.get("Sonali"));
    System.out.println(mp.get("Diksha"));
    mp.put("annu", 26);
    System.out.println(mp.get("annu"));
    System.out.println(mp.remove("annu"));
    System.out.println(mp.containsKey("annu"));
    System.out.println(mp.putIfAbsent("annu", 30));
    System.out.println(mp.get("annu"));
    System.out.println(mp.putIfAbsent("Yashika", 35));
    System.out.println(mp.keySet());
    System.out.println(mp.values());
    System.out.println(mp.entrySet());
    for (Map.Entry<String, Integer> e : mp.entrySet()) {
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }
    for (var e : mp.entrySet()) {
      System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
    }
  }

  public static void main(String[] args) {
    hashMapMethod();
  }
}
