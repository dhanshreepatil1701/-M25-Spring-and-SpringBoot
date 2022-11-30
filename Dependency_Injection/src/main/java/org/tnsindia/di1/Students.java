package org.tnsindia.di1;
//Class2
public class Students {
	
	//2.DI in the forms of objects
	Mathcheat math;
	
	//MathCheat m=new MathCheat();
	public void cheating() {
		math.mathcheat();
	}
	//DI using setters
	public void setMath(Mathcheat math) {
		this.math = math;
	}

}