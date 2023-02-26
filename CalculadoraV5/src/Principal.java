import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double resultado = 0;
		int continuar;
		do {
			// Chamando o m�todo da classe EntradaSaida e enviando o pa�metro String
			double num1 = EntradaSaida.solicitaNumero("1�");
			double num2 = EntradaSaida.solicitaNumero("2�");
//Chamando o m�todo da classe EntradaSaida que solicita a opera��o 			
			int operacao = EntradaSaida.solicitaOperacao();
//Diferente da OT anterior aqui vamos acessar os m�todos usando a estrutura get/set, por isso n�o instanciamos o objeto no inicio do programa. 
			// Para usarmos somente quando necess�rio, iremos instanciar cada classe em cada
			// case escolhido .
			switch (operacao) {
			// Aqui instanciamos a classe Soma, enviamos como par�metro o num1 e num2
			// (Vari�veis desta classe principal) como par�metro.

			case 1:
				Soma soma = new Soma();
				soma.setNum1(num1);
				soma.setNum2(num2);
				// Depois de enviarmos os dois n�meros como par�metros, eles v�o ser calculado
				// na classe soma e a variav�l resultado ir� receber
				// o resultado da soma
				resultado = soma.calcula();
				break;
			case 2:
				Subtracao sub = new Subtracao();
				sub.setNum1(num1);
				sub.setNum2(num2);
				resultado = sub.calcula();
				break;
			case 3:
				Multiplicacao multi = new Multiplicacao();
				multi.setNum1(num1);
				multi.setNum2(num2);
				resultado = multi.calcula();
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2�");
				}
				Divisao divi = new Divisao();
				divi.setNum1(num1);
				divi.setNum2(num2);
				resultado = divi.calcula();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada!");
				System.exit(0);
			}
			EntradaSaida.mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- n�o"));

		} while (continuar == 1);
	}

}
