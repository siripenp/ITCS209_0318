package exercise;

public class StudentComparison {
	public static void main(String[] args) {
		Student a = new Student(6188999, "Siripen Ing", "siripen.pon@mu.ac.th");
		Student b = new Student(6188999, "Siripen IngIng");
		Student c = a;
		
		System.out.println(a == b);			// false
		System.out.println(a == c);			// true
		System.out.println(b == c);			// false
		System.out.println(a.equals(b));	// true
		System.out.println(a.equals(c));	// true
		System.out.println(b.equals(c));	// true
	}
}
