package solution;

// Name:
// Student ID: 

public class Playlist {
	public static final int SIZE = 5;
	
	public static void main(String[] args) {
		String[] songs = new String[SIZE];
		double[] durations = new double[SIZE];
		
		songs[0] = "How long";
		songs[1] = "End Game";
		songs[2] = "Perfect";
		songs[3] = "Anywhere";

		durations[0] = 3.30;	// 3 minutes 30 seconds
		durations[1] = 4.11;	// 4 minutes 11 seconds
		durations[2] = 4.21;	// 4 minutes 21 seconds
		durations[3] = 3.35;	// 3 minutes 35 seconds
		
		// Add a new song named "Find you" at index 4
		// Add a new duration 3.38 at index 4
		// Your code goes here
		songs[4] = "Find you";
		durations[4] = 3.38;
		
		// Display songs in the playlist
		showPlaylist(songs, durations);

		// Find the longest song
		int idx = findLongestSong(durations);
		System.out.println("The longest song is " + songs[idx]);
		
		// Find the total duration of this playlist in seconds
		int total = getPlaylistDuration(durations);
		System.out.println("The total duration is " + total + " seconds.");
	}
	
	public static int findLongestSong(double[] durations) {
		int idx = 0;
		for(int i = 1; i < durations.length; i++) {
			if(durations[i] > durations[idx])
				idx = i;
		}
		return idx;
	}
	
	public static int getPlaylistDuration(double[] durations) {
		int sec = 0;
		for(double d: durations) {
			sec += ((int) d * 60) + ((d * 100) % 100);
		}
		return sec;
	}
	
	public static void showPlaylist(String[] songs, double[] durations) {
		for(int i = 0; i < SIZE; i++) {
			System.out.println("[" + (i + 1) +"] " + songs[i] + " (" + durations[i] + ")");
		}
	}
}
