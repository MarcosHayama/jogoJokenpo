package jokenpo;

import java.util.Scanner;

public class JogoJokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//n esse system in é um dispositivo de leitura de entrada (teclado)
		
		//Variáveis para a randomização do computador
		int min = 1;
		int max = 3;
		// Variável copiada pois não entendi nada
		int escolhaDoComputador = (int)Math.floor(Math.random()*(max-min+1)+min); 
				
		System.out.println("Jokenpo");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");		
		System.out.println("\nPara jogar, escolha entre os números 1 e 3 ");	
		
		System.out.println("\nEscolha sua opção:");
		int escolhaDoUsuario = leitor.nextInt();
		
		
		if (escolhaDoUsuario == 1) {
			System.out.println("Você escolheu Pedra");
		} else if (escolhaDoUsuario == 2) {
			System.out.println("Você escolheu Papel");	
		}  else if (escolhaDoUsuario == 3) {
			System.out.println("Você escolheu Tesoura");
		}  
		  
	    if (escolhaDoComputador == 1) {
	    	System.out.println("\nComputador escolheu Pedra");
		} else if (escolhaDoComputador == 2) {
			System.out.println("\nComputador escolheu Papel");	
		}  else if (escolhaDoComputador == 3) {
			System.out.println("\nComputador escolheu Tesoura");
		  }
	   //quebra
	    if (escolhaDoUsuario == escolhaDoComputador) {
	    	System.out.println("\nVocês empataram essa rodada");
		} else if (escolhaDoUsuario == 1 && escolhaDoComputador == 3) {
			System.out.println("\nVocê ganhou essa rodada");
		} else {
			System.out.println("\nComputador ganhou essa rodada");
			}
		}
	}
