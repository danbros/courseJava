package secao03.entities;

public class Retangle {
	public double height;
	public double width;
	
	public String area() {
		return String.format("%.2f", width * height);
	}
	
// Double.parseDouble(*String)    Double.valueOf("*string")
	
	public String perimeter() {
		return String.format("%.2f", (height + width) * 2);
	}
	
	public String diagonal() {
		return String.format("%.2f", Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
	}
	
	public String toString() {
		return "0";
	}
}
