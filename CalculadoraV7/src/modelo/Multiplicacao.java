package modelo;

//A interface "IOperacao" � implementada na classe multiplica��o
//Fazendo com que todos os m�todos que fazem parte da interface serem implementados na classe
public class Multiplicacao extends Operacoes {
	public double calcula() {
		double mult = num1 * num2;
		return mult;
	}
}
