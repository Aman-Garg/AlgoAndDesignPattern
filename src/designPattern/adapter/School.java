package designPattern.adapter;

public class School {
	
	public static void main(String args[]) {
		
		//PilotPen pilotPen = new PilotPen();
		PenAdapter pa = new PenAdapter();
		Assingment as = new Assingment();
		as.setP(pa);
		
		as.writeAssignment("I am Praticing design pattern");
	}

}
