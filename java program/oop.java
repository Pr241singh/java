

/*public class oop{
	public static class student{
		String name;
		int rno;
		double percent;
	}
	public static void main(String[] args) {
		student x  = new student();
		x.name = "Preeti";
		x.rno = 76;
		x.percent = 92.5;
		System.out.println(x.name);
	}
}*/

/*public class oop{
	String color;
	float price;

	oop() {
		color = "Black";
		price = 50000;
	}

	public static void main(String[] args) {
		oop swift = new oop();
	}
}*/

class oop{

	static int totalnoofbboks;
	String author;
	String title;
	String ibsn;
	boolean isborrowed;

	static {
		totalnoofbboks = 0;
	}
	{
		totalnoofbboks++;
	}

	oop(String isbn , String title, String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	oop(String isbn){
		this(isbn, title:"Unknown", author:"Unknown");
	}

	static int gettotalnoofbooks(){
		return totalnoofbboks;
	}

	void borrowBook(){
		if(isborrowed){
			System.out.println("Book is already borrowed");
		}
		else{
			this.isborrowed = true;
			System.out.println("Enjoy the Book");
		}
	}

	void returnbook(){
		if(isborrowed){
			this.isborrowed = false;
			System.out.println("Hope you enjoyed.");
		}
		else
		{
			System.out.println("This book is already in the liberary");
		}
	}

	public static void main(String[] args) {
		oop designofthings = new oop(isbn:"1", title:"Design", author:"Author");
		oop mybook = new oop(isbn:"2");
		System.out.println(oop.gettotalnoofbooks());
		designofthings.borrowBook();
		mybook.borrowBook();
		designofthings.borrowBook();
		designofthings.returnbook();
		designofthings.returnbook();
	}
}





