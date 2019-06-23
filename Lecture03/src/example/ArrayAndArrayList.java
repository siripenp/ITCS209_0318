package example;

import java.util.ArrayList;

public class ArrayAndArrayList {
	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 2;
		array[1] = 4;
		array[2] = 6;
		array[3] = 8;
		array[4] = 10;
		
		for(int x: array) {
			System.out.print(x + ", ");
		}
		System.out.print("\n---------------\n");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		for(Integer x: list) {
			System.out.print(x + ", ");
		}
		System.out.print("\n---------------\n");
		
		System.out.println(find(array, 4));
		System.out.println(find(list, 4));
		
	}
	
	public static int find(int[] numbers, int x) {
		int index = -1;
		for(int i = 0; i < numbers.length; i++) {
			if(x == numbers[i]) {
				index = i;
			}
		}
		return index;
	}
	
	public static int find(ArrayList<Integer> numbers, int x) {
		int index = -1;
		for(int i = 0; i < numbers.size(); i++) {
			if(x == numbers.get(i)) {
				index = i;
			}
		}
		return index;
	}
}
