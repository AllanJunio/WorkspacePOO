package modelo;
//Em uma interface podemos implementar m�todos (publics e sem corpo), que ser�o 
//obrigatoriamente implementados na classe em que a interface fizer uma assinatura
public interface IOperacao {
	// Os m�todos declarados na Interface s�o abstratos, pois eles ser�o comum em
	// todas as classes
	// Na qual ser�o implementados
	public void setNum1(double num1);

	public void setNum2(double num2);

	public double calcula();
}
