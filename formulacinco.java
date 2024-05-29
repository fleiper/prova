package PROVA;
import java.util.Scanner;
public class formulacinco {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String estacionamento[] = new String[7];

		for(int carro=0; carro <=6; carro++) {
		System.out.println("qual carro você vai estacionar?: ");
		estacionamento[carro]= ler.next();
	}

	for(int carro=0; carro <=6; carro++) {
	System.out.println("o carro está estacionado no " +carro+" esse carro é um "+estacionamento[carro]);
}



}
}