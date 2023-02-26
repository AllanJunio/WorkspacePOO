
public class Soma implements IOperacao {
	private double num1;
	private double num2;

//Usamos o "this" para referenciar que estamos falando da vari�vel da classe 
	public double getNum1() {
		return this.num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return this.num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	// Aqui realizamos o calculo com as vari�veis da classe que j� receberam os
	// valores enviados como pa�metro da classe principal .
	// Por meio dos m�todos (get/set)
	// para refatorar (renomear) algo que j� est� pronto em nosso c�digo, como por
	// exemplo
	// o m�todos abaixo. Usamos o comando Alt+shift+R
	public double calcula() {
		double soma = num1 + num2;
		return soma;
	}

}
