package Static_NonStatic;

public class practice2 {

	 static int x = 40;
	 static int y = 20;

	public void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		practice2 pc1 = new practice2();
		System.out.println(pc1.x + "\t" +pc1.y);
		pc1.sum();

		practice2 pc2 = new practice2();
		pc2.y = 15;
		System.out.println(pc2.x + "\t" + pc2.y);
		pc2.sum();

		practice2 pc3 = new practice2();
		System.out.println(pc3.x + "\t" + pc3.y);
		pc3.sum();
		
		System.out.println("last value of y is "+pc3.y);

	}

}
