package web;

public class CalculModel {
	
	private double numberOne;
	private double numberTwo;
	private double resultSum;
	public double getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}
	public double getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}
	public double getResultSum() {
		return resultSum;
	}
	public void setResultSum(double resultSum) {
		this.resultSum = resultSum;
	}
	public CalculModel(double numberOne, double numberTwo, double resultSum) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.resultSum = resultSum;
	}
	public CalculModel() {
		super();
	}
	
	
	

}
