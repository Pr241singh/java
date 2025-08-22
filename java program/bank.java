package bank;

class Account{
	public String name;
	protected String email;
	private String password;

	public String getPassword(){
		return this.password;
	}

	public String setPass(String pass){
		return this.password = pass;
	}
}

public class bank{
	public static void main(String[] args) {
		Account account1 = new Account();
		account1.name = "Apna college";
		account1.email = "ps7379791@gmail.com";
		account1.setPass("abcd");
		System.out.println(account1.getPassword());
	}
}
