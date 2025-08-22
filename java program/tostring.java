/*public class tostring{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("First");
		sb.append(45);
		sb.append(", preeti");
		sb.append(76.45);
		//sb.toString();
	}
}*/

/*public class tostring{
	final double pi = 3.1412;
	void testing(){
			pi = 56;
	}

	public static void main(String[] args) {
		
	}
}*/

/*class tostring{
	String name;
	int age;
	String rollNum;
	String house;

	public tostring(String name, int age, String rollNum, String house){
		this.name = name;
		this.age = age;
		this.rollNum = rollNum;
		this.house = house;
	}

	@Override
	public String toString(){
		return "Student Details:{name:"+ name
		 +", age:"+ age+", roll no:"+ rollNum+", house:" + house+ "}";
	}

	public static void main(String[] args) {
		toString stu = new toString(name:"Preeti", age:30, rollNum:"12", house:"blue");
		System.out.println(stu);
	}
}*/

/*class tostring{
	public static void main(String[] args) {
		String first = "Preeti";
		String last = "Singh";
		String full = first+last;
		System.out.println(full.toUpperCase());
	}
}*/

/*import java.util.Scanner;

class tostring{
	double radius;

	tostring(double radius){
		this.radius = radius;
	}

	double getCircumference(){
		return 2*radius*Math.PI;
	}

	double getArea(){
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String toString(){
		return "Circle props : Radius in mm: "+ radius 
		+ " , Circumference in mm : "+ getCircumference() 
		+ ", Area in mm2: "+getArea();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		double radius = input.nextDouble();
		System.out.println("Enter your radius : ");
		tostring circle = new tostring(radius);
		System.out.println(circle);
	}
}*/

/*class tostring{

	int roll(){
		double random = Math.random()* 6;
		return (int) Math.ceil(random);
	}
	public static void main(String[] args) {
		tostring dice = new tostring();
		for(int i= 0; i< 10;i++){
			System.out.println(dice.roll());
		}
	}
}*/

/*class tostring{

	int random;

	tostring(){
		random = (int) Math.ceil(Math.random()*100);
	}

	int guess(int guessNumber){
		return guessNumber - random;
	}

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			tostring game = new tostring();
			System.out.println("Welcome");
			int guess;
			int result;
			do{
				System.out.println("Guess the no : ");
				guess = input.nextInt();
				result = game.guess(guess);
				if (result == 0) {
					System.out.println("correct");
				}
				else if (result< 0) {
					System.out.println("higher");
				}
				else{
					System.out.println("Lower");
				}
			}while(result != 0);
	}
}*/

/*class tostring{
	public static void main(String[] args) {
		String[] arr = new String[] {"this", "is", "the" "Good",
		"course","ever"};
		StringBuilder sb = new StringBuilder();
		for (String str : arr) {
			sb.append(str).append(" ");
		}
		System.out.println(sb);
	}
}*/

