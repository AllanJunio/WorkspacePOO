import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double resultado = 0;
		int continuar;
		do {
			// Chamando o método da classe EntradaSaida e enviando o paâmetro String
			double num1 = EntradaSaida.solicitaNumero("1ª");
			double num2 = EntradaSaida.solicitaNumero("2ª");
//Chamando o método da classe EntradaSaida que solicita a operação 			
			int operacao = EntradaSaida.solicitaOperacao();
//Diferente da OT anterior aqui vamos acessar os métodos usando a estrutura get/set, por isso não instanciamos o objeto no inicio do programa. 
			// Para usarmos somente quando necessário, iremos instanciar cada classe em cada
			// case escolhido .
			switch (operacao) {
			// Aqui instanciamos a classe Soma, enviamos como parâmetro o num1 e num2
			// (Variáveis desta classe principal) como parâmetro.

			case 1:
				Soma soma = new Soma();
				soma.setNum1(num1);
				soma.setNum2(num2);
				// Depois de enviarmos os dois números como parâmetros, eles vão ser calculado
				// na classe soma e a variavél resultado irá receber
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
					num2 = EntradaSaida.solicitaNumero("2ª");
				}
				Divisao divi = new Divisao();
				divi.setNum1(num1);
				divi.setNum2(num2);
				resultado = divi.calcula();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada!");
				System.exit(0);
			}
			EntradaSaida.mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- não"));

		} while (continuar == 1);
	}

}
