package exercise;

public class StudentTester {
	public static void main(String[] args) {
		Student myInfo = new Student("Siripen Pongpaichet", 6188999, 3.59, true, 'F');
		Student friendInfo = new Student("Suppawong Tuarob", 6188000, 3.99, false, 'M');
		
		//System.out.println("My name is " + myInfo.name);
		
		// The above statement will cause a compilation error: "The field Student.name is not visible"
		// We cannot access the "name" instance field in Student class using myInfo.name directly
		// because it has access specifier as "private".
		// So it can be accessible within the Student class only
		
		// To access and get the value of the "name" field, we have to call the getter method
		// as shown in the following statement
		System.out.println("My name is " + myInfo.getName());
		
		// Similarly, the "id" field also has "private" access specifier.  
		// To access and get the value of the "id" field in Student class, we have call the getter method
		// as shown in mthe following statement
		System.out.println("My ID is " + myInfo.getID());
		
		
		System.out.println("My status is " + myInfo.getRegisStatus());
		
		myInfo.setName("Ing");			// Set name to be your nickname
		System.out.println("My name is " + myInfo.getName());
	}
}
