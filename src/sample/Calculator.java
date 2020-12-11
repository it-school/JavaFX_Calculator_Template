package sample;

public class Calculator
{
	double number1;
	double number2;
	double memory;
	Operation operation;
	String result;

	public Calculator()
	{
		this.operation = Operation.noOp;
	}

	public double getMemory()
	{
		return memory;
	}

	public void setMemory(double memory)
	{
		this.memory = memory;
	}

	public void addMemory(double number)
	{
		memory += number;
	}

	public void minusMemory(double number)
	{
		memory -= number;
	}

	public Operation getOperation()
	{
		return operation;
	}

	public void setOperation(Operation operation)
	{
		this.operation = operation;
	}

	public double getNumber1()
	{
		return number1;
	}

	public void setNumber1(double number1)
	{
		this.number1 = number1;
	}

	public double getNumber2()
	{
		return number2;
	}

	public void setNumber2(double number2)
	{
		this.number2 = number2;
	}

	public String getResult()
	{
		return result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}

	public void calculate()
	{
		switch (operation) {
			case plus:
				this.result = this.number1 + this.number2 + "";
				break;
			case minus:
				this.result = this.number1 - this.number2 + "";
				break;
			case multiply:
				this.result = this.number1 * this.number2 + "";
				break;
			case divide:
				if (this.number2 != 0) {
					this.result = this.number1 / this.number2 + "";
				}
				else {
					this.result = "Division by zero!";
				}
				break;
			case squareRoot:
				this.result = Math.sqrt(this.number1) + "";
				break;
			default:
				result = "This operation is not defined";
		}
	}

	public void clear()
	{
		this.result = "";
		this.number1 = 0;
		this.number2 = 0;
		this.operation = Operation.noOp;
	}

}
