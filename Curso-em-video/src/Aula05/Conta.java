package Aula05;

public class Conta {
	
//ATRIBUTOS
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
//MÉTODOS
	
	public void estadoAtual() {
		System.out.println("\n");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		
		if(this.getTipo() == "CP") {
			this.saldo = 150;
		}
		else {
			this.setSaldo(50); //mostrando as duas formas que pode fazer, usando de forma direta e usando os metodos set.
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() != 0) {
			System.out.println("Precisa deixar a conta com saldo ZERO para fechar a conta!");	
		}
		else {
			setStatus(false);
			System.out.println("Conta fechada!");
		}
	}
	
	public void depositar(double saldo) {
		if (this.isStatus() == true) {
			this.setSaldo(this.getSaldo() + saldo);
			//this.saldo = this.saldo + saldo; FORMA DE FAZER SEM USAR GET E SET
			System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
	}
		else {
			System.out.println("ERRO: Conta não ativa!");
		}
	}
	
	public void sacar(double s) {
		if (this.isStatus() == true && this.getSaldo() >= s) {
			this.setSaldo(this.getSaldo() - s);
			System.out.println("Saque realizado com sucesso na conta " + this.getDono());
		}
		else {
			System.out.println("Não é possível sacar!");
		}
		
	}
	
	public void pagarMensal() {
		
		if (this.isStatus() == true && this.getTipo() == "CC" && this.getSaldo() >=12 ) {
				this.setSaldo(getSaldo() - 12);
				System.out.println("Mensalidade paga realizado com sucesso da conta " + this.getDono());
		}
		
		else if (this.isStatus() == true && this.getTipo() == "CC" && this.getSaldo() >=20){
			this.setSaldo(getSaldo() - 20);
			System.out.println("Mensalidade paga realizado com sucesso da conta " + this.getDono());
			}
		else{
			
		System.out.println("Não é possível pagar mensalidade!");
		}
	}
	
//MÉTODOS ESPECIAIS
	public void Conta() {
		this.saldo = 0;
		this.status = false;
		
		//this.setSaldo(0);
		//this.status(true);
		
	}
	

	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
