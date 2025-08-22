
public class oops{
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


public class driver{

	public static void main(String[] args) {
		oops mycar = new oops();
		oops.drive();
	}
}