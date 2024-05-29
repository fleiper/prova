package PROVA;
import java.util.Scanner;
public class fourtastic { //NOME DA CLASSE

	public static void main(String[] args) { //NOME DA CLASSE PRINCIPAL
		Scanner ler = new Scanner (System.in);
		int soma = 0;  //VARIAVEL
		for (int number=0; number<=15; number++) { //VARIAVEL +1 ATÉ SER IGUAL A 15
			System.out.println("digite um valor:"); //VALOR DECLARADO PELO USUÁRIO
			number = ler.nextInt(); //VALOR GUARDADO
			soma = soma + number; //VALOR ANTERIOR SOMADO AO NOVO VALOR ACRESCENTADO
			System.out.println("soma: "+soma); //SAÍDA DE DADOS, SOMA 
		}
	}
}