import javax.swing.JOptionPane;

public class Principal {
	private static Operacoes oper = new Operacoes();

	public static void main(String[] args) {

		double resultado = 0;
		int continuar;
		do {
			double num1 = EntradaSaida.solicitaNumero("1�");
			double num2 = EntradaSaida.solicitaNumero("2�");
			int operacao = EntradaSaida.solicitaOperacao();

			switch (operacao) {
			case 1:
				resultado = oper.calculaSoma(num1, num2);
				break;
			case 2:
				resultado = oper.calculaSubtracao(num1, num2);
				break;
			case 3:
				resultado = oper.calculaMultiplicacao(num1, num2);
				break;
			case 4:

				resultado = oper.calculaDivisao(num1, num2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encer rada!");
				System.exit(0);
			}
			EntradaSaida.mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- n�o"));

		} while (continuar == 1);
	}

}
