package exercise;

public class StudentInfo {
	public static void main(String[] args) {
		String myName = "Siripen Pongpaichet";
		int myID = 6188999;
		double myGPA = 3.59;
		boolean myRegis = true;
		char myGender = 'F';
		
		System.out.println("My name is " + myName + " (" + myGender +")");
		System.out.println("My ID is " + myID);
		System.out.println("My current GPS is " + myGPA);
		System.out.println("My registration status is " + myRegis);
		

		String friendName = "Suppawong Tuarob";
		int friendID = 6188000;
		double friendGPA = 3.99;
		boolean friendRegis = false;
		char friendGender = 'M';
		
		System.out.println("His name is " + friendName + " (" + friendGender +")");
		System.out.println("His ID is " + friendID);
		System.out.println("His current GPS is " + friendGPA);
		System.out.println("His registration status is " + friendRegis);

	}
}
