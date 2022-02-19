package br.com.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Cesar Augusto
 * @since 15/02/2022
 * @version v1
 * @category Desafio de Programa��o Capgemini
 */
public class Primeiro {

	public static void main(String[] args) {
		
		//Scanner para captura de entrada de dados
		Scanner leia = new Scanner(System.in);
		
		//Utiliza��o de Lista para constru��o da estrutura de asteriscos
		List<String> asterisco = new ArrayList<>();
	 
		//Exibi��o de mensagem no console, solicitando entrada de dados
		System.out.print("Digite um n�mero: ");
		//Leitura da entrada de dados
		int numero = leia.nextInt();
	 
		//Utiliza��o de um for para popular a Lista com os asteriscos
		for (int i = 0; i < numero; i++) {
			asterisco.add(" ".repeat(numero - i - 1) + "*".repeat(i + 1));
		}

		//Utiliza��o de Foreach para mostrar os itens da Lista no console 
		for (String cont : asterisco ) {
			System.out.println(cont);
		}
		
		//Fechando o Scanner leia.
		leia.close();
	}

}
