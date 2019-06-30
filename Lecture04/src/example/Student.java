package example;

public class Student {
	
	// Fields or attributes
	private String name;
	private int id;
	private double gpa;
	private boolean regis;
	private char gender;
	
	// Constructor method
	public Student(String n, int id, double gpa, 
			boolean r, char g) {
		this.name = n;
		this.id = id;
		this.gpa = gpa;
		this.regis = r;
		this.gender = g;
	}
	
	// Getter method: getName()
	public String getName() {
		return this.name;
	}
	
	// Getter method: getID()
	public int getID() {
		return this.id;
	}
	
	// getRegisStatus()
	public String getRegisStatus() {
		
		if(regis) {
			return "Registered";
		} else {
			return "Not registered yet";
		}
	}
	
	// Setter method: setName()
	public void setName(String x) {
		this.name = x;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student myInfo = new Student("Siripen", 123, 3.5, true, 'F');
		
	}

}
