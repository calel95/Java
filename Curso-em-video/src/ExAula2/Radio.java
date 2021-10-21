package ExAula2;

public class Radio {
	String modelo;
    String marca;
    int ano;
    boolean ligado;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano + "\n");
    }
    void escutar(){
        if (this.ligado == true){
            System.out.println("Pode escutar!!");
        }
        else{
            System.out.println("O rádio está desligado!!");
        }
    }

    void ligar(){
        this.ligado = true;
    }
    void desligar(){
        this.ligado = false;
    }

}
