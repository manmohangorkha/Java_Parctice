package Constructor;


class country
{
	
	String Flag;
	int missiles;
	
	public country(String color, int number)
	{
		this.Flag=color;
		this.missiles=number;
	}
	
	public void disply()
	{
		System.out.println("Flags color is " + Flag + "Total no of missiles is " + missiles);
	}


}