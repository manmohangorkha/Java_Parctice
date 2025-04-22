package Access_Modifiers;  

public class Aclass 
{	
public int pbv = 8; 
protected int prov = 11;
int dfv = 9;  
private int priv = 10;  


public void pbm() {  
System.out.println("This is public method from class A");  
} 
protected void prom() {  
System.out.println("This is protected method from class A");  
}
void dfm() {  
System.out.println("This is Default method from class A");  
}  
private void prim() {  
System.out.println("This is private method from class A");  
}  

public static void main(String[] args) 
{  
Aclass ac = new Aclass();  
ac.pbm();  
System.out.println("The value of public varible of Class A is " + ac.pbv);  
ac.dfm();  
System.out.println("The value of default varible of Class A is " + ac.dfv);  
ac.prim();  
System.out.println("The value of private varible of Class A is " + ac.priv);  
ac.prom();  
System.out.println("The value of private varible of Class A is " + ac.prov);  
}  
}
