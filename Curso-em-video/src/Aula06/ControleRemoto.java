package Aula06;

public class ControleRemoto implements Controlador{
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Métodos Especiais
	public ControleRemoto() {
		this.volume = 5;
		this.ligado = false;
		this.tocando = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//Métodos Abstratos

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume:  " + this.getVolume());
		for (int i = 1; i <= this.getVolume(); i = i + 1) {
			System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() + 1); 
		}
		System.out.println("TV está desligada!");
	}

	@Override
	public void menosVolume() {
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() - 1); 
		}
		System.out.println("TV está desligada!");
	}

	@Override
	public void ligarMudo() {
		if(getLigado() == true && getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(getLigado() == true && getVolume() == 0) {
			this.setVolume(5);
		}
		System.out.println("TV está desligada!");
	}

	@Override
	public void play() {
		if(this.getLigado() == true && this.getTocando() == false) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() == true && this.getTocando() == true) {
			this.setTocando(false);
		}
	}
	
	
	

	
	

}
