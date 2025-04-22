package Data_Hiding;

class Bank
{
	private int blnce = 23000000;
	private String pass = "Mona@1999";
	
	public void match(String m1)
	{
		if(m1.equals(pass))
			System.out.println("Your account balance is "+blnce);
		else
			System.out.println("You entered a wrong password, pls enter correct password!");
	}
	
	
}