package Static_NonStatic;

//

public class Static { 
	static int ward = 10;
	static String address = "sfdas";
	
	static void show()
	{
		System.out.println(ward+"\t"+address);
	}
	
	public static void main(String[] args) {
		
		Static.show();		
	}	
	}
