package PROVA;
import java.util.Scanner;
public class tripleg { //NOME DA CLASSE

	public static void main(String[] args) { //NOME DA CLASSE PRINCIPAL
		Scanner ler = new Scanner (System.in);

		//entrada de dados
		System.out.println("digite o dia da semana");  //exibição da pergunta
		int dia = ler.nextInt();  //resposta da pergunta é salva aqui //DECLARAÇÃO DA VARIAVEL
		
		
		//execução do código| e saída ao valor ser refente ao salvo para um dia da semana
		switch (dia) {
			
		case 1:
			System.out.println("domingo");  //se for igual a 1 aparecerá esse texto
			break;
			
		case 2:
			System.out.println("segunda-feira");  //se for igual a 2 aparecerá esse texto
			break;
			
		case 3:
			System.out.println("terça-feira");  //se for igual a 3 aparecerá esse texto
			break; 
			
		case 4: 
			System.out.println("quarta-feira");  //se for igual a 4 aparecerá esse texto
			break;
			
		case 5:
			System.out.println("quinta-feira");  //se for igual a 5 aparecerá esse texto
			break;
			
		case 6:
			System.out.println("sexta-feira");  //se for igual a 6 aparecerá esse texto
			break;
			
		case 7: 
			System.out.println("sabado");  //se for igual a 7 aparecerá esse texto
			break;
			
		default:
			System.out.println("dia invalido"); // se for >=8 aparecerá esse texto
		}
	}
}
