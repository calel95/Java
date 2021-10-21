package Aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	/*public Caneta() { // o metodo construtor tem que ter o mesmo nome da classe
		this.cor = "Azul";
		this.ponta = 0.8f;
	}
	*/
	
	public Caneta(String m, String c, float p) {
		this.setModelo(m);
		this.cor = c;
		this.setPonta(p);
		this.tampar();
	
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("cor: " + this.cor);
		System.out.println("tampada: " + this.tampada);
		
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
	}

	
	}

