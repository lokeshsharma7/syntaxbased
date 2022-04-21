package inheritance;

public class Employee extends Company{
	public void eName() {
		System.out.println("Lokesh");
		
	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.eName();
	e.cName();	
}
} 
