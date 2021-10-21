package Aula05;

public class Main {

	public static void main(String[] args) {
		Conta p1 = new Conta();
		Conta p2 = new Conta();
		
		p1.setNumConta(1234);
		p1.setDono("Veve");
		p1.abrirConta("CP");
		
		p2.setNumConta(4321);
		p2.setDono("Calel");
		p2.abrirConta("CC");
		
		p1.depositar(500);
		p2.depositar(100);
		
		p2.sacar(150);
		p2.fecharConta();
		
		p1.estadoAtual();
		p2.estadoAtual();

	}

}
