package solution;

import java.util.ArrayList;

public class SongApp {
	
	public static void main(String[] args) {
		
		ArrayList<Song> songs = new ArrayList<Song>();
		songs.add(new Song("How long", 3.30));
		songs.add(new Song("End Game", 4.11));
		songs.add(new Song("Perfect", 4.21));
		songs.add(new Song("Anywhere", 3.35));
		
		songs.add(4, new Song("Find you", 3.38));
		
		// Display songs in the playlist
		showPlaylist(songs);

		// Find the longest song
		int idx = findLongestSong(songs);
		System.out.println("The longest song is " + songs.get(idx).toString());
		
		// Find the total duration of this playlist in seconds
		int total = getPlaylistDuration(songs);
		System.out.println("The total duration is " + total + " seconds.");
		
	}
	
	public static int findLongestSong(ArrayList<Song> list) {
		int idx = 0;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).getDuration() > list.get(idx).getDuration())
				idx = i;
		}
		return idx;
	}
	
	public static int getPlaylistDuration(ArrayList<Song> list) {
		int sec = 0;
		for(Song s: list) {
			double d = s.getDuration();
			sec += ((int) d * 60) + ((d * 100) % 100);
		}
		return sec;
	}
	
	public static void showPlaylist(ArrayList<Song> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("[" + (i + 1) +"] " + list.get(i).toString());

		}
	}
}
