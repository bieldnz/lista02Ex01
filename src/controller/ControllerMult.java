package controller;

public class ControllerMult {
	
	public ControllerMult() {
		super();
	}
	
	public int mult(int a, int b) {
		
		if(a > 1) {
			int result = b + mult(a - 1, b);
			return result;
		}else {
			return b;
		}
		
	}

}

