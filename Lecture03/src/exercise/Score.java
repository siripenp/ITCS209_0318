package exercise;

public class Score {

	public static void main(String[] args) {
		
		int score1 = 20, score2 = 15;
		int maxScore = getMax(score1, score2);
		System.out.println("Your max score is " + maxScore);
		
		final int SIZE = 5;
		int[] scores = new int[SIZE];
		scores[1] = 20;
		scores[2] = 15;
		
		for(int i = 0; i < SIZE; i++) {
			System.out.println("Index " + i + " = " + scores[i]);
		}
	}
	
	public static int getMax(int x, int y) {
		if(x > y)
			return x;
		else
			return y;
	}
	
	
	public static int getMax3(int x, int y, int z) {
		int max = x;
		if(y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
		return max;
	}
	
	public static int getMin3(int x, int y, int z) {
		int min = x;
		if(y < min) {
			min = y;
		}
		if(z < min) {
			min = z;
		}
		return min;
	}

}
