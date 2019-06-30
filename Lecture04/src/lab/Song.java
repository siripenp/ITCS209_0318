package lab;

public class Song {
	
	// Task 1: Write Song's attribute
	// YOUR CODE GOES HERE
	private String title;
	private double duration;
	
	// Task 2: Create Constructor Method
	// YOUR CODE GOES HERE
	public Song(String t, double d) {
		this.title = t;
		this.duration = d;
	}
	
	// Task 3: Create Getter Methods
	// getTitle() to get song's title
	// YOUR CODE GOES HERE
	public String getTitle() {
		return this.title;
	}
	
	// getDuration() to get song's duration
	// YOUR CODE GOES HERE
	public double getDuration() {
		return this.duration;
	}
	
	// Task 4: Create Setter Methods
	// setTitle(String t) to set song's title
	// YOUR CODE GOES HERE 
	public void setTitle(String t) {
		this.title = t;
	}
	
	// setDuration(double d) to set song's duration
	// YOUR CODE GOES HERE
	public void setDuration(double d) {
		this.duration = d;
	}
	
	// showSong() method is already provided
	public void showSong() {
		System.out.println(this.title + " (" + String.format("%.2f", this.duration) +")");
	}
	
	/*
	 * main method
	 */
	public static void main(String[] args) {
		
		Song myFavSong = new Song("Perfect", 4.21);
		System.out.println("My favorite song is " + myFavSong.getTitle());
		System.out.println("The duration of my favorite song is " + myFavSong.getDuration());
		System.out.println("------------------------------------------------------------");
		
		// call method setTitle and setDuration to update the value of myFavSong, then call showSong()
		// YOUR CODE GOES HERE
		myFavSong.setTitle("Anywhere");
		myFavSong.setDuration(3.35);
		
		System.out.print("My new favorite song is ");
		myFavSong.showSong();
		System.out.println("------------------------------------------------------------");
		
		// Ask your friend for his/her favorite song
		// Create a song object named myFriendSong and display that song
		// YOUR CODE GOES HERE
		Song myFriendSong = new Song ("Find you", 3.38);
		System.out.print("My friend's favorite song is ");
		myFriendSong.showSong();
		
	}

}
