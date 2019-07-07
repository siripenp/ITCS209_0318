package exercise;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Siri Pong", 123, 3.59, true, 'F'));
		list.add(new Student("Alex Sing", 124, 3.29, false, 'M'));
		list.add(new Student("John Smith", 125, 2.10, true, 'M'));
		list.add(new Student("Penguin Lovely", 126, 2.50, false, 'F'));
		
		int index = findStudent(list, 125);
		System.out.println("Found at index " + index);
	}
	
	public static int findStudent(ArrayList<Student> list, int id) {
		int idx = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getID() == id) {
				idx = i;
			}
		}
		return idx;
	}
}
