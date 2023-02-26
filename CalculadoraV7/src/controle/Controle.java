package controle;

import visualizacao.EntradaSaida;
import javax.swing.JOptionPane;
import modelo.Divisao;
import modelo.Soma;
import modelo.Multiplicacao;
import modelo.Subtracao;
import modelo.Operacoes;

public class Controle {
public void exibeMenu() {
	double resultado = 0;
	int continuar;
	Operacoes oper = null;
	do {
		// Chamando o método da classe EntradaSaida e enviando o paâmetro String
		double num1 = EntradaSaida.solicitaNumero("1ª");
		double num2 = EntradaSaida.solicitaNumero("2ª");
		// Chamando o método da classe EntradaSaida que solicita a operação
		int operacao = EntradaSaida.solicitaOperacao();
		// Diferente da OT anterior aqui vamos acessar os métodos usando a estrutura
		// get/set, por isso não instanciamos o objeto no inicio do programa.
		// Para usarmos somente quando necessário, iremos instanciar cada classe em cada
		// case escolhido .
		switch (operacao) {
		// Aqui instanciamos a classe Soma, enviamos como parâmetro o num1 e num2
		// (Variáveis desta classe principal) como parâmetro.
		// A partri desta versão, passamos a criar somente 1 objeto na memória, que
		// engloba todos os cauculos
		case 1:
			oper = new Soma();
			// Depois de enviarmos os dois números como parâmetros, eles vão ser calculado
			// na classe soma e a variavél resultado irá receber
			// o resultado da soma
			break;
		case 2:
			oper = new Subtracao();
			break;
		case 3:
			oper = new Multiplicacao();

			break;
		case 4:
			while (num2 == 0) {
				num2 = EntradaSaida.solicitaNumero("2ª");
			}
			oper = new Divisao();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada!");
			System.exit(0);
		}
		oper.setNum1(num1);
		oper.setNum2(num2);
		resultado = oper.calcula();
		EntradaSaida.mostraResultado(resultado, operacao);
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- não"));

	} while (continuar == 1);
}
}
