package designPattern.adapter;

public class PenAdapter implements Pen {
	
	PilotPen pp = new PilotPen();

	@Override
	public void write(String write) {
		pp.write(write);
	}
	
	

}
