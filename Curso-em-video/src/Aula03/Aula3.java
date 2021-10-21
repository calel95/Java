// - PUBLIC PODE SER ACESSADO DE FORMA FREE, DE QUALQUER LUGAR
// - PRIVATE SOMENTE a propria classe pode mexer
// - PROTECTED - TODO O PACOTE PODE MEXER
// - metodo get(acessor) - envia
// - metodo set(modificador) - recebe
// - metodo construtor - defini tudo que ja vai vir pronto na classe, assim, quando instanciar um objeto, oq tiver no construtor ja vai vir junto

package Aula03;

public class Aula3 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta(); //instancia um objeto da classe Canelta, ou seja, cria um objeeto chamado c1, atraves da classe caneta
		
		c1.modelo = "Bic";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = true;
		
		c1.destampar();
		c1.status(); 
		c1.rabiscar();
	}	
	
}
