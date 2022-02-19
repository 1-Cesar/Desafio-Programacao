package br.com.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Cesar Augusto
 * @since 17/02/2022
 * @version v1
 * @category Desafio de Programação Capgemini
 */
public class Terceiro {

	public static void main(String[] args) {
		//Scanner para leitura da entrada de dados
		Scanner leia = new Scanner (System.in);
		//Criação de variável para guardar a entrada de dado
		String palavra;
		//Criação de Lista para trabalhar com os anagramas
	    ArrayList<String> anagrama = new ArrayList<String>();
		//Exibe mensagem no console solicitando entrada de dado
		System.out.println("Digite uma palavra: ");
			//Leitura da entrada de dado
	    	palavra = leia.next();
		//for para percorrer a palavra digitada		
	    for(int l = 0; l <palavra.length(); l++) {
	    	//for para percorrer a palavra digitada e utilizar o contador para comparar
	        for(int c = 0; c < palavra.length(); c++) {
	        	//compara as letras das palavra de acordo com o indice atual
	            if(palavra.charAt(l) == palavra.charAt(c) && l !=c && l <= c) {
	            	//verifica se a letra da segunda palavra com indice mais 1 é igual a letra do indice da primeira palavra
	                if(palavra.charAt(l) == palavra.charAt(l+1)) {
	                //Criando variável, extraindo e adicionando subtring.	
	                String primeiro= palavra.substring(l, l + 1);
	                String segundo = palavra.substring(l, l + 1);
	                //Populando Lista com as substring's anteriores
	                anagrama.add(primeiro);
	                anagrama.add(segundo);
	                
	                } 
	                else {
	                
	                //Extraindo subtring da palavra digitada com base nos indices do for
	                String terceiro = palavra.substring(l, c);
	                String quarto = palavra.substring(l + 1, c + 1);
	                String quinto = palavra.substring(l, l + 1);
	                String sexto = palavra.substring(l, l + 1);
	                
	                //Populando o anagrama
	                anagrama.add(sexto);
	                anagrama.add(quinto);
	                anagrama.add(terceiro);
	                anagrama.add(quarto);
	                
	                }
	            }
	        }
	    }
	    //Criação de variável para divisão dos anagramas
	    int tamanho = anagrama.size();
	    //Divisão dos pares de anagramas
	    tamanho = tamanho / 2;
	    //Quebra de linha
	    System.out.println();
	    //Quantidade de anagramas
	    System.out.println(tamanho);
	    //Ordenando os anagramas
	    Collections.sort(anagrama);
	    //Exibindo os anagramas no console
	    System.out.println(anagrama);
	    //Fechando leitura de dados    
	    leia.close();
	    
	}
}