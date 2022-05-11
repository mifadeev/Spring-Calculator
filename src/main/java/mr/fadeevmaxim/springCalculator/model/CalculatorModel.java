package mr.fadeevmaxim.springCalculator.model;

public class CalculatorModel {
 private String operation;
 private double oneOperand;
 private double twoOperand;
 public CalculatorModel() {
	 
 }
 public CalculatorModel(String operation) {
	 this.operation = operation;
 }
 public CalculatorModel(double oneOperand, double twoOperand) {
	 this.oneOperand = oneOperand;
	 this.twoOperand = twoOperand;
 }
 public void setOneOperand(double oneOperand) {
	 this.oneOperand = oneOperand;
 }
 public double getOneOperand() {
	 return oneOperand;
 }
 public void setTwoOperand(double twoOperand) {
	 this.twoOperand = twoOperand;
 }
 public double getTwoOperand() {
	 return twoOperand;
 }
 public void setOperation(String operation) {
	 this.operation = operation;
 }
 public String getOperation() {
	 return operation;
 }
}
