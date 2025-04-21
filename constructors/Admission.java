package constructors;

public class Admission {
	
	public static void main(String[] args) {
		
		Details s1 = new Details("Sham",33);
		System.out.println(s1.name+"\t"+s1.roll);
		Details s2 = new Details("Soham", 44);
		System.out.println(s2.name+"\t"+s2.roll);
		Details s3 = new Details("dhanush", 45);
		System.out.println(s3.name+"\t"+s3.roll);
		Details s4= new Details("vivek", 44);
		System.out.println(s4.name+"\t"+s4.roll);
		
	}

}
