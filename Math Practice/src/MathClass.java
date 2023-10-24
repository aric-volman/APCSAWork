import java.util.function.Function;

public class MathClass {

	public static void main(String[] args) {
		// Math methods are accessible through Math Class!
		// +, -, /, *, % -> no Math methods needed
		
		//Square root
		System.out.println(Math.sqrt((double)64));
		
		System.out.println(Math.pow(2,  9));
		
		int x1 = 3;
		int y1 = 5;
		int x2 = 80;
		int y2 = 50;
		
		// Use Math methods to find the distance
		
		System.out.println(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
		
		// Bowling ball at a height of 100 m
		// 100 m = 1/2at^2
		// System.out.println(Math.sqrt(100.0/(0.5*9.81)));
		
		System.out.println(definiteIntegralOfE(0.0, 1.0));
		
		int res6 = Math.abs(-391212); // Abs
		
		int range = 7;
		int min = 3;
		//  System.out.println((int)(Math.random() * (range + 1)) + min);

	}
	
	public static double definiteIntegralOfE(double lim1, double lim2) {
		double dt = 0.0001;
		double result = 0;
		for (double i = lim1; i <= lim2; i += dt) {
			result += Math.exp(i);
		}
		
		return result;
	}
}
