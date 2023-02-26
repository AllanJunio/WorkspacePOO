package modelo;

//A interface "IOperacao" é implementada na classe multiplicação
//Fazendo com que todos os métodos que fazem parte da interface serem implementados na classe
public class Multiplicacao extends Operacoes {
	public double calcula() {
		double mult = num1 * num2;
		return mult;
	}
}
