package class_exercise;

public class Score {
	public static void main(String[] args) {
		int score1 = 20, score2 =15;
		int maxScore = getMax(score1, score2);
		System.out.println("Your max score is " + maxScore);
		
		// declare scores array
		int[] scores = new int[5];
		// assign value at index 1 and 2
		scores[1] = 20;
		scores[2] = 15;
		
		// print value of all elements
		for(int i = 0; i < scores.length; i++) {
			System.out.println("Index " + i + " = " + scores[i]);
		}
		
		
	}
	
	public static int getMax(int x, int y) {
		int max = x;
		if (y > max)
			max = y;
		return max;
		
//		if(x>y)
//			return x;
//		else 
//			return y;
//		
	}
}
