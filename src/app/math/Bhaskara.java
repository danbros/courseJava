package app.math;

/**
 * < A class/function than receive the value of "a, b, c" and return the value of X1 and X2 (double)
 *
 *@author danbros
 * @version 1.0
 */

public class Bhaskara { 
	
	
	private int a;
	private	int b;
	private	int c;
	private double delta;
	
	//CONSTRUCTOR
	public Bhaskara(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//METODS
	public double delta () {
		return delta = (b * b) + (-4 * (a * c));
	}
	
	
	public double bhask1 () {
		return ((-(b) + Math.sqrt(delta)) / 2 * a);
	}
	
	public double bhask2 () {
		return ((-(b) - Math.sqrt(delta)) / 2 * a);
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}
	
	public double expressao(int a, int b, int c) {
		return (a * a) + b + c;
	}
	//GET/SET
	
}
