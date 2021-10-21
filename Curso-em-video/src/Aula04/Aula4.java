package Aula04;

public class Aula4 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("Faber Castel", "Verde", 0.7f); //aqui usando o construtor e passando os parametros
		//Caneta c1 = new Caneta();
		
		//c1.setModelo("BIC"); // usando o acessor é possivel modificar o atributo privado
		//c1.modelo = "BIC"; // acessando direto, se o atributo for do tipo privado, nao e possivel acessar direto
		
		//c1.ponta = 0.5f;
		//c1.setPonta(0.5f);
		c1.status();
	}

}
