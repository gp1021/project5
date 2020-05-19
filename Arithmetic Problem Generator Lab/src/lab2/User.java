package lab2;

public class User {
	private Window2 _w;
	int x = (int)(Math.random() * 9);
	int y = (int)(Math.random() * 9);
	int sign = (int)(Math.random() * 2);
	int numberOfQuestions;
	String[] options = {"Addition & Subtraction", "Multiplication & Division"};
	//1 = addition, 2 = subtraction
	
	int cnt = 1;
	int correct;
	int incorrect;
	
	public User() {
		_w = new Window2();
		_w.msg1("Welcome to Arithmetic Practice!");
		String x = _w.in("How many questions would you like to do?");
		if (x.equals("exit") || x.equals("Exit")) {
			System.exit(0);
		}
		
		if (_w.option(options) == 0) {
			int numberOfQuestions = Integer.parseInt(x);
			for (int i = 0; i < numberOfQuestions; i++) {
				if (rightOrWrong()) {
					_w.msg1("Correct!");
					correct++;
					cnt++;
				} else {
					_w.msg1("Incorrect!");
					cnt++;
					incorrect++;
				}
			}
			_w.msg1("You finished the exercise!\n"
					+ "You got " + correct + " correct!\n"
					+ "You got " + incorrect + " wrong!\n\n"
					+ tally());
		} else {
			int numberOfQuestions = Integer.parseInt(x);
			for (int i = 0; i < numberOfQuestions; i++) {
				if (rightOrWrong2()) {
					_w.msg1("Correct!");
					correct++;
					cnt++;
				} else {
					_w.msg1("Incorrect!");
					cnt++;
					incorrect++;
				}
			}
			_w.msg1("You finished the exercise!\n"
					+ "You got " + correct + " correct!\n"
					+ "You got " + incorrect + " wrong!\n\n"
					+ tally());
			}
	}
	
	public String tally() {
		double total = correct + incorrect;
		double percent = (correct / total) * 100;
		
		return "Your score was " + percent + "%";
	}
	
	public int getUsersAnswer() {
		String x = _w.in(problemGenerator());
		if (x.equals("exit") || x.equals("Exit")) {
			System.exit(0);
		}
		int y = Integer.parseInt(x);
		return y;
	}
	
	public int getUsersAnswer2() {
		String x = _w.in(problemGenerator2());
		if (x.equals("exit") || x.equals("Exit")) {
			System.exit(0);
		}
		int y = Integer.parseInt(x);
		return y;
	}
	
	public String problemGenerator() {
		String result;
		if (sign == 1) {
			result = cnt + ") " + x + " + " + y;
		} else {
			if (x >= y) {
				result = cnt + ") " + x + " - " + y;
			} else {
				result = cnt + ") " + y + " - " + x;
			}
		}
		return result;
	}
	
	public String problemGenerator2() {
		String result;
		if (sign == 1) {
			result = cnt + ") " + x + " x " + y;
		} else {
			if (x % y == 0) {
				result = cnt + ") " + x + " / " + y;
			} else if (y % x == 0){
				result = cnt + ") " + y + " / " + x;
			} else {
				result = cnt + ") " + x + " x " + y;
			}
		}
		return result;
	}
	
	public boolean rightOrWrong() {
		if (sign == 1) {
			if (getUsersAnswer() == (x+y)) {
				x = (int)(Math.random() * 9);
				y = (int)(Math.random() * 9);
				sign = (int)(Math.random() * 2);
				return true;
			} else {
				x = (int)(Math.random() * 9);
				y = (int)(Math.random() * 9);
				sign = (int)(Math.random() * 2);
				return false;
			}
		} else {
			if (x >= y) {
				if (getUsersAnswer() == (x-y)) {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return true;
				} else {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return false;
				}
			} else {
				if (getUsersAnswer() == (y-x)) {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return true;
				} else {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return false;
				}
			}
		}
	}
	
	public boolean rightOrWrong2() {
		if (sign == 1) {
			if (getUsersAnswer2() == (x*y)) {
				x = (int)(Math.random() * 9);
				y = (int)(Math.random() * 9);
				sign = (int)(Math.random() * 2);
				return true;
			} else {
				x = (int)(Math.random() * 9);
				y = (int)(Math.random() * 9);
				sign = (int)(Math.random() * 2);
				return false;
			}
		} else {
			if (x % y == 0) {
				if (getUsersAnswer2() == (x/y)) {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return true;
				} else {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return false;
				}
			} else if (y % x == 0){
				if (getUsersAnswer2() == (y/x)) {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return true;
				} else {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return false;
				}
			} else {
				if (getUsersAnswer2() == (x*y)) {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return true;
				} else {
					x = (int)(Math.random() * 9);
					y = (int)(Math.random() * 9);
					sign = (int)(Math.random() * 2);
					return false;
				}
			}
		}
	}
	
}
