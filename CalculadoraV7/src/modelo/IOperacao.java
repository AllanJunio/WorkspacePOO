package modelo;
//Em uma interface podemos implementar métodos (publics e sem corpo), que serão 
//obrigatoriamente implementados na classe em que a interface fizer uma assinatura
public interface IOperacao {
	// Os métodos declarados na Interface são abstratos, pois eles serão comum em
	// todas as classes
	// Na qual serão implementados
	public void setNum1(double num1);

	public void setNum2(double num2);

	public double calcula();
}
