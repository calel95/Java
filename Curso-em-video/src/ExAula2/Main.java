package ExAula2;

public class Main {

	public static void main(String[] args) {
		Radio r1 = new Radio();

        r1.marca = "JBL";
        r1.modelo = "Extreme 3";
        r1.ano = 2022;
        r1.ligado = true;

        r1.status();
        r1.ligar();
        r1.escutar();

	}

}
