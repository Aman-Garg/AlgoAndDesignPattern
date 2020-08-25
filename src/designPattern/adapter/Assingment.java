package designPattern.adapter;

public class Assingment {

	private Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String write) {
		p.write(write);
	}

}
