package lab2;

public class RandomNumbers {
	//instance variables
	int x = (int)(Math.random() * 9);
	int y = (int)(Math.random() * 9);
	int sign = (int)(Math.random() * 2); //1 = addition, 2 = subtraction
	
	//getter methods
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSign() {
		return sign;
	}
	
	//constructor
	public RandomNumbers() {
		
	}
	
	//prints out a random arithmetic problem (either addition or subtraction), based on numbers 0 through 9, with only positive solutions
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
