package exercise;

public class Student {
	
	public int id;
//	public String fullname;
//	public String email;	
	private String fullname;
	private String email;
	
	public Student(int id, String fullname, String email) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
	}
	
	public Student(int id, String fullname) {
		this.id = id;
		this.fullname = fullname;
		this.email = generateEmail();
	}
	
	public void changeName(String newName, String newEmail) {
		this.fullname = newName;
		this.email = newEmail;
	}
	
	public void changeName(String newName) {
		this.fullname = newName;
		this.email = generateEmail();
	}
	
	public String generateEmail() {
		int space = fullname.indexOf(" ");
		String firstName = fullname.substring(0, space).toLowerCase();
		String lastName = fullname.substring(space + 1, space + 4).toLowerCase();
		String email =  firstName + "." + lastName + "@mu.ac.th";
		return email;
	}
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Student))
			return false;
		Student s = (Student) o;
		boolean eq = false;
		if(this.id == s.id) 
			eq = true;
		return eq;
		//return this.id == s.id;
	}
	
	public String toString() {
		return "[" + id + "] "+ this.fullname + " (" + this.email +")";
	}
}
