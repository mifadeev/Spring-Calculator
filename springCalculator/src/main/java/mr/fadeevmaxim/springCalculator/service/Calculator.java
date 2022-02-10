package mr.fadeevmaxim.springCalculator.service;
import mr.fadeevmaxim.springCalculator.model.CalculatorModel;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
	public double addition(CalculatorModel model) {
		return model.getOneOperand() + model.getTwoOperand();
	}
	public double subtraction(CalculatorModel model) {
		return model.getOneOperand() - model.getTwoOperand();
	}
	public double multiplication(CalculatorModel model) {
		return model.getOneOperand() * model.getTwoOperand();
	}
	public double division(CalculatorModel model) {
		if(model.getOneOperand() == 0) return 0;
		if(model.getTwoOperand() == 0) return 0;
		return model.getOneOperand() / model.getTwoOperand();
	}
}
