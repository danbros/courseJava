package section03.entities;

public class Student {
	
	public String nameS;
	public double grade1;
	public double grade2;
	public double grade3;
	double gF;
	
	public double gradeFinal() {
		gF = grade1 + grade2 + grade3;
		return gF;
	}
	
	public String passNo(){
		if(gF >= 60) 
			return "PASS";
		else
			return "FAILED\nMISSING " + (60 - gF) + " POINTS";	
	}
	
	public String toString() {
		return String.format("%.2f", gradeFinal());
	}
}
