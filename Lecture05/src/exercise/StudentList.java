package exercise;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(12, "aa aa", "aa@a.com"));
		list.add(new Student(13, "bb bb", "bb@a.com"));
		list.add(new Student(14, "cc cc", "cc@a.com"));
		list.add(new Student(15, "dd dd", "dd@a.com"));
		
		int index = findStudent(list, 14);
		System.out.println("Found at " + index);
	}
	
	public static int findStudent(ArrayList<Student> list, int id) {
		int idx = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).id == id) {
				idx = i;
			}
		}
		return idx;
	}
}
