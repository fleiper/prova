package PROVA;
import java.util.Scanner;
public class second { //NOME DA CLASSE

	public static void main(String[] args) {  //NOME DA CLASSE PRINCIPAL
		Scanner ler= new Scanner (System.in);

		int Area, Base, H; //(H seria de aultura em ingles)  //DECLARAÇÃO DE VARIAVEIS

		System.out.println("A altura do triangulo é de: "); //pergunta sobre o valores
		H = ler.nextInt(); //colocação dos valores 

		System.out.println("==========================================="); //efeite

		System.out.println("O tamanho da base é de: "); //pergunta sobre o valores
		Base = ler.nextInt(); //colocação dos valores 

		Area = (H*Base)/2; //execução do código 

		System.out.println("===========================================");//efeite
		System.out.println("A área desse triangulo é de: "+Area);  //saída de dados

	}

}
