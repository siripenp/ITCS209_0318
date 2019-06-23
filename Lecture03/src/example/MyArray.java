package example;

public class MyArray {
	public static void main(String[] args){
	   // Create an array.
	   int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
	   
	   // pass the array to showArray.
	   showArray(numbers);
	   System.out.println("---------------------------------------");
	   
	   // Pass the array to the increaseArrayValues.
	   increaseArrayValues(numbers);
	   
	   System.out.println("\nValues inside main");
	   for (int i = 0; i < numbers.length; i++) {
		   System.out.print(numbers[i] + " ");
	   }
	   System.out.println("---------------------------------------");
	   
	   // Copy an array
	   double[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	   
	   // copy reference
	   double[] copy = data;
	   System.out.println("Value of data[1] = " + data[1]);
	   System.out.println("Value of copy[1] = " + copy[1]);
	   data[1] = 1.5;
	   System.out.println("Update value of data[1] to be 1.5");
	   System.out.println("Value of data[1] = " + data[1]);
	   System.out.println("Value of copy[1] = " + copy[1]);
	   
	   System.out.println("---------------------------------------");
	   // copy elements
	   double[] clone = data.clone();
	   System.out.println("Value of data[1] = " + data[1]);
	   System.out.println("Value of clone[1] = " + clone[1]);
	   data[1] = 1.5;
	   System.out.println("Update value of data[1] to be 1.5");
	   System.out.println("Value of data[1] = " + data[1]);
	   System.out.println("Value of clone[1] = " + clone[1]);
	   
	   
	}
	
	/*
	 * The showArray method accepts an array as 
	 * an argument displays its contents.
	 * */ 
	public static void showArray(int[] array) { 
		// Display the array elements.
		System.out.println("Values inside showArray");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " "); 
		}
	} 

	/* 
	 * The increaseArrayValues method accepts an array as 
	 * an argument and increase value of each element by one.
	 * */ 
	public static void increaseArrayValues(int[] array){
		System.out.println("Values inside increaseArrayValues"); 
		for (int i = 0; i < array.length; i++) {
			array[i] += 1;
			System.out.print(array[i] + " ");
		}
	} 


}
