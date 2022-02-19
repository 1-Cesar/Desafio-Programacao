package br.com.desafio;

import java.util.Scanner;

/**
 * @author Cesar Augusto
 * @since 16/02/2022
 * @version v1
 * @category Desafio de Programa��o Capgemini
 */
public class Segundo {

	public static void main(String[] args) {

		// Scanner para captura de dados
		Scanner leia = new Scanner(System.in);

		// Cria��o da v�riavel senha do tipo String
		String senha;

		// Exibi��o de mensagem no console solicitando entrada de senha
		System.out.println("Digite uma senha: ");
		// Leitura da informa��o fornecida
		senha = leia.nextLine();
		// Estrutura de decis�o para verificar se foi digitado uma senha em branco.
		if (senha.isEmpty() || " ".equals(senha)) {
			// Estrutura de repeti��o solicitando novamente entrada correta de senha
			do {
				// Exibi��o de mensagem com destaque em vermelho no console, informando o
				// usu�rio sobre a senha inv�lida
				System.err.println("Senha Inv�lida. Por favor, digite uma senha.");
				// Leitura da nova entrada de senha
				senha = leia.nextLine();
				// Condi��o para permanecer no Loop
			} while (senha.isEmpty() || " ".equals(senha));
		}
		//Verifica se a senha digitado � maior ou igual a 6
		if (senha.length() >= 6) {
			//Quebra de linha
			System.out.println();
			//Utiliza��o de Regex para verificar se a senha � forte
			if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9a-zA-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console que a senha atende aos requisitos de uma senha forte
				System.out.println("Parab�ns !!! Sua senha � Forte.");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando um n�mero");
				System.out.println("Sugest�o: " + senha + "1");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra minuscula");
				System.out.println("Sugest�o: " + senha + "a");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra maiuscula");
				System.out.println("Sugest�o: " + senha + "A");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando um caracter especial");
				System.out.println("Sugest�o: " + senha + "@");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando um n�mero e uma letra minuscula");
				System.out.println("Sugest�o: " + senha + "1a");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra minuscula e uma letra maiuscula");
				System.out.println("Sugest�o: " + senha + "Ba");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra maiuscula e um numero");
				System.out.println("Sugest�o: " + senha + "A1");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando um caracter especial");
				System.out.println("Sugest�o: " + senha + "@");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando um numero e um caracter especial");
				System.out.println("Sugest�o: " + senha + "@1");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra minuscula e um caracter especial.");
				System.out.println("Sugest�o: " + senha + "@a");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra maiuscula e um caracter especial.");
				System.out.println("Sugest�o: " + senha + "@A");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*[a-z])[a-z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra maiuscula, uma letra minuscula e um caracter especial.");
				System.out.println("Sugest�o: " + senha + "@1A");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*[A-Z])[A-Z]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra minuscula, um numero e um caracter especial.");
				System.out.println("Sugest�o: " + senha + "@1a");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*\\d)[0-9]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra minuscula, uma letra maiuscula e um caracter especial.");
				System.out.println("Sugest�o: " + senha + "@Ba");
			}
			//Utiliza��o de Regex para verificar se a senha � forte
			else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{6,}$")) {
				//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
				System.err.println("Voc� pode tornar sua senha segura adicionando uma letra minuscula, uma letra maiuscula e um numero.");
				System.out.println("Sugest�o: " + senha + "1Ba");
			} 
			
		}
		//Caso a senha seja melhor do que 6 � executado este bloco
		else {
			//Quebra de linha
			System.out.println();
			//Cria��o da vari�vel falta para armazenar quantos digitos faltam para uma senha forte
			int falta;
			//Imprime no console quantos digitos s�o necess�rios para 6 caracteres
			System.out.println(falta = (6 - senha.length()));
			//condi��o desenvolvida para sa�da baseada na quantidade de caracteres ausentes. Bem como, sugest�o personalizada.
			if (falta == 5) {
				//Utiliza��o de Regex para verificar se a senha � forte			
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero");
					System.out.println("Sugest�o: " + senha + "1@asq");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "a@asq");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "A@asq");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "@@asq");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero e uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "1a@as");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "Ba@aQ");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugest�o: " + senha + "A1@aS");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "@2Asq");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugest�o: " + senha + "@1@as");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@a@Bs");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@A@a1");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1A7a");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1a@a");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)[0-9]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@Ba4s");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{1,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugest�o: " + senha + "1Ba0@");
				}
			}
			//condi��o desenvolvida para sa�da baseada na quantidade de caracteres ausentes. Bem como, sugest�o personalizada.
			else if (falta == 4) {
				//Utiliza��o de Regex para verificar se a senha � forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero");
					System.out.println("Sugest�o: " + senha + "1aeR");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "a1@R");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "A2@R");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "@1aR");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero e uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "1a@A");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "Ba1f");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugest�o: " + senha + "A124");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "@a12");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugest�o: " + senha + "@114");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@aB4");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@A12");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1Af");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1ag");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)[0-9]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@Ba1");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{2,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugest�o: " + senha + "1B@a");
				}
			}
			//condi��o desenvolvida para sa�da baseada na quantidade de caracteres ausentes. Bem como, sugest�o personalizada.
			else if (falta == 3) {
				//Utiliza��o de Regex para verificar se a senha � forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero");
					System.out.println("Sugest�o: " + senha + "1sA");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "a@1");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "A@b");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "&ab");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero e uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "1aB");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "Ba1");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugest�o: " + senha + "A13");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "@aB");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugest�o: " + senha + "@1a");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@a4");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@A3");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1A");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1a");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)[0-9]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@Ba");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{3,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugest�o: " + senha + "1Ba");
				}
			}
			//condi��o desenvolvida para sa�da baseada na quantidade de caracteres ausentes. Bem como, sugest�o personalizada.
			else if (falta == 2) {
				//Utiliza��o de Regex para verificar se a senha � forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero");
					System.out.println("Sugest�o: " + senha + "1a@S");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "a@1d");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "A@ad");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "@12d");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um n�mero e uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "1afD");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "Ba3d");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um numero");
					System.out.println("Sugest�o: " + senha + "A13d");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um caracter especial");
					System.out.println("Sugest�o: " + senha + "@123D");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles um numero e um caracter especial");
					System.out.println("Sugest�o: " + senha + "@134");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@a3F");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@Ad1");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1Ad");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1af");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)[0-9]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@Ba1");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{4,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracteres. Dentre eles uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugest�o: " + senha + "1B@a");
				}
			}
			//condi��o desenvolvida para sa�da baseada na quantidade de caracteres ausentes. Bem como, sugest�o personalizada.
			else if (falta == 1) {
				//Utiliza��o de Regex para verificar se a senha � forte
				if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[a-zA-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um n�mero");
					System.out.println("Sugest�o: " + senha + "1@adA");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[0-9A-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "a@a1d");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$%^&*()-+])[0-9a-z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "A@frS");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um caracter especial");
					System.out.println("Sugest�o: " + senha + "@2dA1");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()-+])[A-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um n�mero e uma letra minuscula");
					System.out.println("Sugest�o: " + senha + "1a@ad");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[!@#$%^&*()-+])[0-9!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula e uma letra maiuscula");
					System.out.println("Sugest�o: " + senha + "Ba@re");
				} 
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[!@#$%^&*()-+])[a-z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula e um numero");
					System.out.println("Sugest�o: " + senha + "A1@1s");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um caracter especial");
					System.out.println("Sugest�o: " + senha + "@123A");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo um numero e um caracter especial");
					System.out.println("Sugest�o: " + senha + "@1sAd");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[A-Z])[0-9A-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@asDa");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)(?=.*[a-z])[0-9a-z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@A123");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[a-z])[a-z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra maiuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1Aet");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[A-Z])[A-Z]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula, um numero e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@1aSa");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*\\d)[0-9]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha segura adicionando " + falta + " caracter. Incluindo uma letra minuscula, uma letra maiuscula e um caracter especial.");
					System.out.println("Sugest�o: " + senha + "@BaDa");
				}
				//Utiliza��o de Regex para verificar se a senha � forte
				else if (senha.matches("^(?=.*[!@#$%^&*()-+])[!@#$%^&*()-+]{5,}$")) {
					//Imprime no console saida personalizada informando qual caracter falta para uma senha forte e uma poss�vel sugest�o de senha
					System.err.println("Voc� pode tornar sua senha mais segura adicionando " + falta + " caracter. Incluindo uma letra minuscula, uma letra maiuscula e um numero.");
					System.out.println("Sugest�o: " + senha + "1Ba@a");
				}
			}
		//fechando leitura de dados	
		leia.close();
	}

	}
}
