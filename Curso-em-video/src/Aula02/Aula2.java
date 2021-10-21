package Aula02;

public class Aula2 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta(); //instancia um objeto da classe Canelta, ou seja, cria um objeeto chamado c1, atraves da classe caneta
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.tampar();
		c1.rabiscar();
		c1.status(); //chamada do metodo
	
		Caneta c2 = new Caneta();
		c2.cor = "Verde";
		c2.ponta = 0.5f;
		c2.tampada = false;
		c2.destampar();
		c2.rabiscar();
	}	
	

}
