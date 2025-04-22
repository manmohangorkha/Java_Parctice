package Data_Hiding;

class Class1 {
	private int blc = 999999;
	private String username = "A12345678";
	private String pass = "Qwerty@123";

	public void details(String k, String p) {
		if (!k.equals(username) && !p.equals(pass))

			System.out.println("Wrong username or password");
		else
			System.out.println(blc);

	}
}