package constructors;

public class Cycle {
	
	public static void main(String[] args) {	
	
	
	Details fc = new Details("dhanush", 45);
	System.out.println(fc.name+"\t"+fc.roll);
	Details fc2= new Details("vivek", 44);
	System.out.println(fc2.name+"\t"+fc2.roll);
}
}