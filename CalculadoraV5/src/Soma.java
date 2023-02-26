
public class Soma implements IOperacao {
	private double num1;
	private double num2;

//Usamos o "this" para referenciar que estamos falando da variável da classe 
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

	// Aqui realizamos o calculo com as variáveis da classe que já receberam os
	// valores enviados como paâmetro da classe principal .
	// Por meio dos métodos (get/set)
	// para refatorar (renomear) algo que já está pronto em nosso código, como por
	// exemplo
	// o métodos abaixo. Usamos o comando Alt+shift+R
	public double calcula() {
		double soma = num1 + num2;
		return soma;
	}

}
