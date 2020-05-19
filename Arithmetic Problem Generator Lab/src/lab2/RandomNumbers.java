package lab2;

public class RandomNumbers {
	int x = (int)(Math.random() * 9);
	int y = (int)(Math.random() * 9);
	int sign = (int)(Math.random() * 2); //1 = addition, 2 = subtraction
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSign() {
		return sign;
	}
	
	public RandomNumbers() {
		
	}
	
	public String problemGenerator() {
		String result;
		if (sign == 1) {
			result = x + " + " + y;
		} else {
			if (x >= y) {
				result = x + " - " + y;
			} else {
				result = y + " - " + x;
			}
		}
		return result;
	}
	
}
