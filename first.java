package PROVA;
import java.util.Scanner;
public class first { //NOME DA CLASSE

	public static void main(String[] args) { //NOME DA CLASSE PRINCIPAL
		Scanner ler = new Scanner (System.in);

		int A, B, SOMAR, SUBTRAIR, DIVIDIR, MULTIPLICAR; //DECLARAÇÃO DE VARIAVEIS

		System.out.println("Qual o primeiro valor da conta?: ");//PERGUNTA
		A = ler.nextInt(); //SALVAR RESPOSTA

		System.out.println("=========================================================");//ESTETICA ELEGANTE

		System.out.println("Qual o segundo valor da conta?: ");//PERGUNTA 
		B = ler.nextInt(); //SALVAR RESPOSTA

		System.out.println("=========================================================");//ESTETICA ELEGANTE

		//EXECUÇÃO DOS DADOS
		SOMAR = (A+B);   //EXECUÇÃO DOS DADOS ADIÇÃO
		SUBTRAIR = (A-B);  //EXECUÇÃO DOS DADOS DA SUBTRAÇÃO
		DIVIDIR = (A/B);   //EXECUÇÃO DOS DADOS DA DIVISÃO
		MULTIPLICAR = (A*B);  //EXECUÇÃO DOS DADOS DA MULTIPLICAÇÃO

		//SAÍDA DE DADOS
		System.out.println("OS VALORES SÃO:"); //SAÍDA DE DADOS
		System.out.println("ADIÇÃO: "+SOMAR);  //SAÍDA DE DADOS
		System.out.println("SUBTRAÇÃO: "+SUBTRAIR);  //SAÍDA DE DADOS
		System.out.println("MULTIPLICAÇÃO: "+MULTIPLICAR);  //SAÍDA DE DADOS
		System.out.println("DIVISÃO: "+DIVIDIR);  //SAÍDA DE DADOS
	}
}
