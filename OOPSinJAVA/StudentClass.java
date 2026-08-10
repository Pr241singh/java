package OOPSinJAVA;

//Not preferable 
/*public class StudentClass {
  public static void main(String[] args) {

    class Student {
      String name;
      int rno;
      double percent;
    }

    class car {
      String name;
      String tyre;
      int price;
    }

    Student st = new Student();
    st.name = "Preeti Singh";
    st.rno = 12;
    st.percent = 98;
    System.out.println(st.name);
    System.out.println(st.percent + 8);

    car c1 = new car();
    c1.name = "Thar";
    System.err.println(c1.name);
  }
}*/

/*public class StudentClass {
  public static void main(String[] args) {
    Student st = new Student();
    st.name = "Preeti Singh";
    // st.rno = 12;
    st.percent = 98;
    System.out.println(st.name);
    change(st);
    System.out.println(st.name);
    System.out.println((st.getRno()));
    st.setRno(76);
    System.out.println((st.getRno()));
  }

  public static void change(Student x) {
    x.name = "Sreeti";
  }
}*/

public class StudentClass {
  public static void change(Student s) {
    s.name = "Sreeti";
  }

  public static void main(String[] args) {
    Student st = new Student("Preeti", 36, 89);
    // System.out.println(st.name);
    // System.out.println(st.rno);
    // System.out.println(st.percent);
    Student st1 = new Student("Sreeti", 37, 85);
    Student st2 = new Student("Kreeti", 39, 84);
    System.out.println(st2.noOfStudent);
  }
}
