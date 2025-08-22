
/*public class car{
	int noOfwheels;
	String color;
	float maxspeed;
	float currentfuel;
	int noOfseat;

	public void drive(){
		System.out.println("Car is driving");
		currentfuel--;
	}

	public void addfuel(float fuel){
		currentfuel += fuel;
	}

	public float getcurrentfuel(){
		return currentfuel;
	}
}


public class oops{

	public static void main(String[] args) {
		car mycar = new car();
		car.drive();
	}
}*/

/*class pen{
	String color;
	String type;

	public void write(){
		System.out.println("writing something");
	}

	public void printcolor(){
		System.out.println(this.color);
	}
}*/

/*class Student{
	String name;
	int age;

	/*public void printinfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}

	/*Student(String name, int age){
		//System.out.println("Constructor Called");
		this.name = "Preeti";
		this.age = 24; 
	}*/

	/*Student(Student s2){
		this.name = s2.name;
		this.age = s2.age; 
	}

	Student(){

	}*/

	//polymorphism

	/*public void printinfo(String name){
		System.out.println(name);
	}

	public void printinfo(int age){
		System.out.println(age);
	}

	public void printinfo(String name, int age){
		System.out.println(name + " " + age);
	}
}*/


/*public class oops{
	public static void main(String[] args) {
		//Student s1 = new Student("aman", 24);
		//s1.name = "Preeti";
		//s1.age = 24; 

		Student s1 = new Student();
		s1.name = "Preeti";
		s1.age = 24; 

		s1.printinfo(s1.name, s1.age);
		//Student s2 = new Student(s1);
		//s2.printinfo();
		/*pen pen1 = new pen();
		pen1.color = "blue";
		pen1.type = "gel";

		pen pen2 = new pen();
		pen2.color = "blue";
		pen2.type = "ball";

		pen1.printcolor();
		pen2.printcolor();*/
	//}
//}

		/*class Shape{
			//String color;

			public void area(){
				System.out.println("display area");
			}
		}

		//class Triangle extends Shape{

		//}

		class Triangle extends Shape{
			public void area(int l, int h){
				System.out.println(1/2*l*h);
			}
		}

		class equlilateraltriangle extends Triangle{
			public void area(int l, int h){
				System.out.println(1/2*l*h);
			}
		}
		public class oops{
			public static void main(String[] args){

			}
		}*/

		/*public class oops{
			public static void main(String[] args) {
				Triangle t1 = new Triangle();
				t1.color = "red";	
			}
		}*/

		/*public class oops{
			public static void main(String[] args){
				bank.Account account1 = new bank.Account();
				account1.name = "customer1";
			}
		}*/

		abstract class Animal{
			abstract void walk();
		}

		class Horse extends Animal{
			public void walk(){
				System.out.println("walks on 4 legs");
			}
		}

		class Chicken extends Animal{
			public void walk(){
				System.out.println("walks on 2 legs");
			}
		}

		public class oops{
			public static void main(String[] args) {
				Horse horse = new Horse();
				horse.walk();
			}
		}