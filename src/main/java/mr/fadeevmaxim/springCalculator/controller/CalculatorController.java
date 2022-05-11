package mr.fadeevmaxim.springCalculator.controller;
import mr.fadeevmaxim.springCalculator.model.CalculatorModel;
import mr.fadeevmaxim.springCalculator.service.Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
	CalculatorModel calculatorModel = new CalculatorModel();
	
	@Autowired
	private Calculator calculator;
	
	@RequestMapping("/calculator")
	public String getCalculatorPage(Model model) {
		model.addAttribute("calculatorModel",calculatorModel);
		return "calculator";
	}
	
	@RequestMapping(value = "/calculator", params = "addition", method = RequestMethod.POST)
	public String addition(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
		model.addAttribute("result", calculator.addition(calculatorModel));
		return "calculator";
	}
	
	@RequestMapping(value = "/calculator", params = "subtraction", method = RequestMethod.POST)
	public String substraction(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
		model.addAttribute("result", calculator.subtraction(calculatorModel));
		return "calculator";
	}
	
	@RequestMapping(value = "/calculator", params = "multiplication", method = RequestMethod.POST)
	public String multiplication(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
		model.addAttribute("result", calculator.multiplication(calculatorModel));
		return "calculator";
	}
	
	@RequestMapping(value = "/calculator", params = "division", method = RequestMethod.POST)
	public String division(@ModelAttribute("calculatorModel") CalculatorModel calculatorModel, Model model) {
		model.addAttribute("result", calculator.division(calculatorModel));
		return "calculator";
	}
	
}
