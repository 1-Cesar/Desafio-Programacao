package br.com.desafio;

import java.util.Scanner;

/**
 * @author Cesar Augusto
 * @since 16/02/2022
 * @version v1
 * @category Desafio de Programação Capgemini
 */
public class Segundo {

	public static void main(String[] args) {

		// Scanner para captura de dados
		Scanner leia = new Scanner(System.in);

		// Criação da váriavel senha do tipo String
		String senha;

		// Exibição de mensagem no console solicitando entrada de senha
		System.out.println("Digite uma senha: ");
		// Leitura da informação fornecida
		senha = leia.nextLine();
		// Estrutura de decisão para verificar se foi digitado uma senha em branco.
		if (senha.isEmpty() || " ".equals(senha)) {
			// Estrutura de repetição solicitando novamente entrada correta de senha
			do {
				// Exibição de mensagem com destaque em vermelho no console, informando o
				// usuário sobre a senha inválida
				System.err.println("Senha Inválida. Por favor, digite uma senha.");
				// Leitura da nova entrada de senha
				senha = leia.nextLine();
				// Condição para permanecer no Loop
			} while (senha.isEmpty() || " ".equals(senha));
		}
		//Verifica se a senha digitado é maior ou igual a 6
		if (senha.length() >= 6) {
			//Quebra de linha
			System.out.println();
			//Utilização de Regex para verificar se a senha é forte
			if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9a-zA-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console que a senha atende aos requisitos de uma senha forte
				System.out.println("Parabéns !!! Sua senha é Forte.");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando um número");
				System.out.println("Sugestão: " + senha + "1");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra minuscula");
				System.out.println("Sugestão: " + senha + "a");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra maiuscula");
				System.out.println("Sugestão: " + senha + "A");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando um caracter especial");
				System.out.println("Sugestão: " + senha + "@");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando um número e uma letra minuscula");
				System.out.println("Sugestão: " + senha + "1a");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra minuscula e uma letra maiuscula");
				System.out.println("Sugestão: " + senha + "Ba");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra maiuscula e um numero");
				System.out.println("Sugestão: " + senha + "A1");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando um caracter especial");
				System.out.println("Sugestão: " + senha + "@");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando um numero e um caracter especial");
				System.out.println("Sugestão: " + senha + "@1");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra minuscula e um caracter especial.");
				System.out.println("Sugestão: " + senha + "@a");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra maiuscula e um caracter especial.");
				System.out.println("Sugestão: " + senha + "@A");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*[a-z])[a-z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra maiuscula, uma letra minuscula e um caracter especial.");
				System.out.println("Sugestão: " + senha + "@1A");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*[A-Z])[A-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra minuscula, um numero e um caracter especial.");
				System.out.println("Sugestão: " + senha + "@1a");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*\\d)[0-9]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra minuscula, uma letra maiuscula e um caracter especial.");
				System.out.println("Sugestão: " + senha + "@Ba");
			}
			//Utilização de Regex para verificar se a senha é forte
			else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
				System.err.println("Você pode tornar sua senha segura adicionando uma letra minuscula, uma letra maiuscula e um numero.");
				System.out.println("Sugestão: " + senha + "1Ba");
			} 
			
		}
		//Caso a senha seja melhor do que 6 é executado este bloco
		else {
			//Quebra de linha
			System.out.println();
			//Criação da variável falta para armazenar quantos digitos faltam para uma senha forte
			int falta;
			//Imprime no console quantos digitos são necessários para 6 caracteres
			System.out.println(falta = (6 - senha.length()));
			//condição desenvolvida para saída baseada na quantidade de caracteres ausentes. Bem como, sugestão personalizada.
			if (falta == 5) {
				//Utilização de Regex para verificar se a senha é forte			
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número");
					System.out.println("Sugestão: " + senha + "1@asq");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugestão: " + senha + "a@asq");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "A@asq");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "@@asq");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número e uma letra minuscula");
					System.out.println("Sugestão: " + senha + "1a@as");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "Ba@aQ");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugestão: " + senha + "A1@aS");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "@2Asq");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugestão: " + senha + "@1@as");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@a@Bs");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@A@a1");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1A7a");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1a@a");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)[0-9]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@Ba4s");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugestão: " + senha + "1Ba0@");
				}
			}
			//condição desenvolvida para saída baseada na quantidade de caracteres ausentes. Bem como, sugestão personalizada.
			else if (falta == 4) {
				//Utilização de Regex para verificar se a senha é forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número");
					System.out.println("Sugestão: " + senha + "1aeR");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugestão: " + senha + "a1@R");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "A2@R");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "@1aR");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número e uma letra minuscula");
					System.out.println("Sugestão: " + senha + "1a@A");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "Ba1f");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugestão: " + senha + "A124");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "@a12");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugestão: " + senha + "@114");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@aB4");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@A12");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1Af");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1ag");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)[0-9]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@Ba1");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugestão: " + senha + "1B@a");
				}
			}
			//condição desenvolvida para saída baseada na quantidade de caracteres ausentes. Bem como, sugestão personalizada.
			else if (falta == 3) {
				//Utilização de Regex para verificar se a senha é forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número");
					System.out.println("Sugestão: " + senha + "1sA");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugestão: " + senha + "a@1");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "A@b");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "&ab");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número e uma letra minuscula");
					System.out.println("Sugestão: " + senha + "1aB");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "Ba1");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugestão: " + senha + "A13");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "@aB");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugestão: " + senha + "@1a");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@a4");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@A3");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1A");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1a");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)[0-9]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@Ba");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugestão: " + senha + "1Ba");
				}
			}
			//condição desenvolvida para saída baseada na quantidade de caracteres ausentes. Bem como, sugestão personalizada.
			else if (falta == 2) {
				//Utilização de Regex para verificar se a senha é forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número");
					System.out.println("Sugestão: " + senha + "1a@S");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugestão: " + senha + "a@1d");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "A@ad");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "@12d");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um número e uma letra minuscula");
					System.out.println("Sugestão: " + senha + "1afD");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "Ba3d");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugestão: " + senha + "A13d");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugestão: " + senha + "@123D");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugestão: " + senha + "@134");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@a3F");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@Ad1");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1Ad");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1af");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)[0-9]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@Ba1");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugestão: " + senha + "1B@a");
				}
			}
			//condição desenvolvida para saída baseada na quantidade de caracteres ausentes. Bem como, sugestão personalizada.
			else if (falta == 1) {
				//Utilização de Regex para verificar se a senha é forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um número");
					System.out.println("Sugestão: " + senha + "1@adA");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula");
					System.out.println("Sugestão: " + senha + "a@a1d");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "A@frS");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um caracter especial");
					System.out.println("Sugestão: " + senha + "@2dA1");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um número e uma letra minuscula");
					System.out.println("Sugestão: " + senha + "1a@ad");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugestão: " + senha + "Ba@re");
				} 
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula e um numero");
					System.out.println("Sugestão: " + senha + "A1@1s");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um caracter especial");
					System.out.println("Sugestão: " + senha + "@123A");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um numero e um caracter especial");
					System.out.println("Sugestão: " + senha + "@1sAd");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@asDa");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@A123");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1Aet");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@1aSa");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*\\d)[0-9]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugestão: " + senha + "@BaDa");
				}
				//Utilização de Regex para verificar se a senha é forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma possível sugestão de senha
					System.err.println("Você pode tornar sua senha mais segura adicionando " + falta + " caracter. Incluindo uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugestão: " + senha + "1Ba@a");
				}
			}
		//fechando leitura de dados	
		leia.close();
	}

	}
}
