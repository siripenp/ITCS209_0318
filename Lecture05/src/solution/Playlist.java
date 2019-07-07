package solution;

import java.util.ArrayList;

public class Playlist {
	private String name;
	private ArrayList<Song> list;
	
	public Playlist(String name) {
		this.name = name;
		this.list = new ArrayList<Song>();
	}
	
	//to calculate total duration and return the value of total duration in second
	public int calTotalDuration() {
		int total = 0;
		for(Song s: list) {
			total += s.getDurationSec();
		}
		return total;
	} 	
	
	// to add a new song into the playlist 
	public void addSong(Song song) {
		list.add(song);
	}
	
	// to add a new song into the playlist at a given position (Note that the index in the playlist starts at ‘0’).
	public void addSongAtIndex(Song song, int index) {
		if(index >= list.size()) {
			System.out.println("Invalid Index");
		} else {
			list.add(index, song);
		}
	}
	
	// to remove an existing song from the playlist at a given index. If the index does not exist, return false, otherwise return true.
	public boolean removeSongByIndex(int index) {
		if(index >= list.size() || index < 0) {
			System.out.println("Invalid Index");
			return false;
		} else {
			list.remove(index);
			return true;
		}
	} 	
	
	// to remove an existing song from the playlist by looking at the song title. If the song does not exist, return false, otherwise return true.
	public boolean removeSongByTitle(String title) {
		boolean found = false;
		for(int i = 0; i < list.size(); i++) {
			if(title.equalsIgnoreCase(list.get(i).getTitle())) {
				list.remove(i);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
		return found;
	} 	
	
	// to rearrange the position of songs in the playlist by moving the song at the given index up by one position.
	public void moveUp(int position) {
		Song s = list.remove(position);
		list.add(position-1, s);
	}	
	
	// to rearrange the position of songs in the playlist by moving the song at the given index down by one position.
	public void moveDown(int position) {
		Song s = list.remove(position);
		list.add(position + 1, s);
	} 
	
	//  to print the playlist on the console in the following format
	public void showPlaylist() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "] " + list.get(i).toString());
		}
	}

}
