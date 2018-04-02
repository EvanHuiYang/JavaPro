package demo.java.markerinterface;

class A implements Cloneable {
	private int i;
	private String s;
	
	public A(int i, String s) {
		this.i = i;
		this.s = s;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public String getS() {
		return s;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class TestA {
	public static void main(String[] args) {
		A a = new A(10, "EvanYang");
		A b = null;
		try {
			b = (A)a.clone();
			System.out.println(b.getI() + ", " + b.getS());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
