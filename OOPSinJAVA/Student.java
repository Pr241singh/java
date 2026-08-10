package OOPSinJAVA;

public class Student {
  String name;
  int rno;
  double percent;
  static int noOfStudent;

  public int getRno() { // getter
    return rno;
  }

  public void setRno(int rno) { // setter
    this.rno = rno;
  }

  public Student(String name, int roll, double per) {// constructor
    name = name;
    rno = roll;
    percent = per;
    noOfStudent++;
  }
}
