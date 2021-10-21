package Aula03;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Est� tampada? " + this.tampada);
		System.out.println("Modelo? " + this.modelo);
		System.out.println("Ponta? " + this.ponta);
		System.out.println("Carga? " + this.carga);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("N�o pode riscar com a caneta tampada!");
			}
		else {
			System.out.println("Rabiscando...");
		}
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
}
