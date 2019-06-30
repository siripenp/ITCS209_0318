package exercise;

public class StudentTester {
	public static void main(String[] args) {
		
		// Working with Scope of the variables
		// The following section work if and only if the instance fields have "public" access
		
//		Student a = new Student(6188999, "Siripen Pongpaichet", "siripen.pon@mu.ac.th");
//		System.out.println("ID: " + a.id);
//		System.out.println("Name: " + a.fullname);
//		System.out.println("Email: " + a.email);
		
		Student a = new Student(6188999, "Siripen Pongpaichet", "siripen.pon@mu.ac.th");
		System.out.println(a.toString());
		a.changeName("Siripen IngIng", "siripen.ing@mu.ac.th");
		System.out.println(a.toString());
		
		a.changeName("Siri Pong");
		System.out.println(a.toString());
		
	}
	
}
