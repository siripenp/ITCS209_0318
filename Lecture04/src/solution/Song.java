package solution;

// Starting Java File for Students (Lab 05)

public class Song {
	
	private String title;
	private double duration;
	
	public Song(String t, double d) {
		this.title = t;
		this.duration = d;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double getDuration() {
		return this.duration;
	}
	
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setDuration(double d) {
		this.duration = d;
	}
	
	public void showSong() {
		System.out.println(this.title + " (" + String.format("%.2f", this.duration) +")");
	}

}
