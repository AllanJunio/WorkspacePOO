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
		// Chamando o m�todo da classe EntradaSaida e enviando o pa�metro String
		double num1 = EntradaSaida.solicitaNumero("1�");
		double num2 = EntradaSaida.solicitaNumero("2�");
		// Chamando o m�todo da classe EntradaSaida que solicita a opera��o
		int operacao = EntradaSaida.solicitaOperacao();
		// Diferente da OT anterior aqui vamos acessar os m�todos usando a estrutura
		// get/set, por isso n�o instanciamos o objeto no inicio do programa.
		// Para usarmos somente quando necess�rio, iremos instanciar cada classe em cada
		// case escolhido .
		switch (operacao) {
		// Aqui instanciamos a classe Soma, enviamos como par�metro o num1 e num2
		// (Vari�veis desta classe principal) como par�metro.
		// A partri desta vers�o, passamos a criar somente 1 objeto na mem�ria, que
		// engloba todos os cauculos
		case 1:
			oper = new Soma();
			// Depois de enviarmos os dois n�meros como par�metros, eles v�o ser calculado
			// na classe soma e a variav�l resultado ir� receber
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
				num2 = EntradaSaida.solicitaNumero("2�");
			}
			oper = new Divisao();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada!");
			System.exit(0);
		}
		oper.setNum1(num1);
		oper.setNum2(num2);
		resultado = oper.calcula();
		EntradaSaida.mostraResultado(resultado, operacao);
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- n�o"));

	} while (continuar == 1);
}
}
