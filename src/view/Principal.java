package view;

import controller.ControllerMult;

public class Principal {
	public static void main(String[] args) {
		ControllerMult controller = new ControllerMult();
		
		int result = controller.mult(10, 4);
		
		System.out.println(result);
		
	}
}
