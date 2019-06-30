package exercise;

public class Student {
	private String name;
	private int id;
	private double gpa;
	private boolean regis;
	private char gender;
	
	public Student(String n, int stuId, double gpa, 
			boolean regis, char gender) {

		this.name = n;
		this.id = stuId;
		this.gpa = gpa;
		this.regis = regis;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getRegisStatus() {
		if(regis)
			return "Registered";
		else
			return "Not registered yet";
	}
	
	public static void main(String[] args) {
		Student myInfo = new Student("Siripen Pongpaichet", 6188999, 3.59, true, 'F');
		Student friendInfo = new Student("Suppawong Tuarob", 6188000, 3.99, false, 'M');
		System.out.println("My name is " + myInfo.name);
		System.out.println("My name is " + myInfo.getName());
		System.out.println("My ID is " + myInfo.getID());
		System.out.println("My status is " + myInfo.getRegisStatus());
		
		myInfo.setName("Ing");			// Set name to be your nickname
		System.out.println("My name is " + myInfo.getName());
	}

}
