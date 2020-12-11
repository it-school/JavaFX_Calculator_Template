package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller
{
	@FXML
	TextField display;
	@FXML
	Label memoryLabel;

	boolean isNewNumber = true;

	public void numberBtnClick(ActionEvent actionEvent)
	{
		if (isNewNumber)
			display.setText("0");

		String display = this.display.getText().strip();
		//System.out.println(display);
		String number = ((Button) actionEvent.getSource()).getText().strip();
		if (display.equals("0") && number != "0") {
			this.display.setText(number);
		}
		else {
			this.display.setText(display + number);
		}
		isNewNumber = false;
	}

	public void btnCalculateClick(ActionEvent actionEvent)
	{
		Main.calculator.number2 = Double.parseDouble(display.getText());
		Main.calculator.calculate();
		display.setText(Main.calculator.result);
	}

	public void btnOperationClick(ActionEvent actionEvent)
	{
		isNewNumber = true;
		String operation = ((Button) actionEvent.getSource()).getText().strip();
		System.out.println(operation);
		Main.calculator.number1 = Double.parseDouble(display.getText());
		switch (operation) {
			case "%":
				Main.calculator.operation = Operation.div;
				break;
			case "/":
				Main.calculator.operation = Operation.divide;
				break;
			case "*":
				Main.calculator.operation = Operation.multiply;
				break;
			case "-":
				Main.calculator.operation = Operation.minus;
				break;
			case "+":
				Main.calculator.operation = Operation.plus;
				break;
			case "√":
				Main.calculator.operation = Operation.squareRoot;
				Main.calculator.calculate();
				display.setText(Main.calculator.result);
				break;
			case "1/x":
				Main.calculator.operation = Operation.oneX;
				break;
			case "x^y":
				Main.calculator.operation = Operation.pow;
				break;
		}
	}

	public void btnClearClick(ActionEvent actionEvent)
	{
		Main.calculator.clear();
		display.setText("0");
		memoryLabel.setVisible(false);
	}

	public void btnMemoryPlusClick(ActionEvent actionEvent)
	{
		Main.calculator.addMemory(Double.parseDouble(display.getText()));
		memoryLabel.setVisible(Main.calculator.memory != 0 ? true : false);
	}

	public void btnMemoryReadClick(ActionEvent actionEvent)
	{
		display.setText(""+Main.calculator.memory);
	}

	public void btnMemoryStoreClick(ActionEvent actionEvent)
	{
		Main.calculator.memory = Double.parseDouble(display.getText());
		memoryLabel.setVisible(Main.calculator.memory != 0 ? true : false);
	}

}
