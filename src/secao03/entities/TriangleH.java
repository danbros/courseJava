package secao03.entities;

public class TriangleH {
	
	public double a;
	public double b;
	public double c;
	
	public double areaT() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	
	
}