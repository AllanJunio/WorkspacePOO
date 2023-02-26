package modelo;
//Declarando a classe como abstrata / e implementando a interface IOperacao
//Uma classe abstrata n�o pode ser instanciada diretamente / e todos os m�todos 
//devem ser abstratos
//Geralmente as classes abstratas s�o as classes m�es, pois ela ir� conter elementos que ser�o comuns em suas
//classes filhas (subclasses) 
public abstract class Operacoes implements IOperacao {
//Modificador de acesso protected > Permite acesso �s classes filhas, mas pro�be acesso de qualquer outro lugar.
//Nos atributos aplicamos o conceito de encapsulamento. Restringindo o acesso aos 
//atributos, deixando apenas a possibilidade de acesso para as classes filhas. 
	protected double num1;
	protected double num2;

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
}
