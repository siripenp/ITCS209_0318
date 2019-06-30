package exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class NumberFormat {
	public static void main(String[] args) {
		double val = 20.12545;
		System.out.println("Original double: " + val);			// 20.12545
		
		// 1) printf
        System.out.printf("\ndouble : %.2f", val);				// 20.13
     		
     	// 2) String.format
        System.out.println("\ndouble : " + String.format("%.2f", val));	// 20.13
        
		// 3) DecimalFormat
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println("\ndouble : " + df.format(val));		// 20.13
		
		// 4) DecimalFormat with RoundingMode
		DecimalFormat df2 = new DecimalFormat("#.##");
		
		// DecimalFormat, default is RoundingMode.HALF_EVEN
        df2.setRoundingMode(RoundingMode.DOWN);
        System.out.println("\ndouble : " + df2.format(val));  	//20.12

        df2.setRoundingMode(RoundingMode.UP);
        System.out.println("\ndouble : " + df2.format(val));  	//20.13
        
        // 5) BigDecimal
        BigDecimal bd = new BigDecimal(val).setScale(2, RoundingMode.HALF_UP);
        double newInput = bd.doubleValue();
        System.out.println("double : " + newInput);				// 20.13
		
	}
	
}
