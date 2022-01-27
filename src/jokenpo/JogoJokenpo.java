package jokenpo;

import java.util.Scanner;

public class JogoJokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//n esse system in � um dispositivo de leitura de entrada (teclado)
		
		//Vari�veis para a randomiza��o do computador
		int min = 1;
		int max = 3;
		// Vari�vel copiada pois n�o entendi nada
		int escolhaDoComputador = (int)Math.floor(Math.random()*(max-min+1)+min); 
				
		System.out.println("Jokenpo");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");		
		System.out.println("\nPara jogar, escolha entre os n�meros 1 e 3 ");	
		
		System.out.println("\nEscolha sua op��o:");
		int escolhaDoUsuario = leitor.nextInt();
		
		
		if (escolhaDoUsuario == 1) {
			System.out.println("Voc� escolheu Pedra");
		} else if (escolhaDoUsuario == 2) {
			System.out.println("Voc� escolheu Papel");	
		}  else if (escolhaDoUsuario == 3) {
			System.out.println("Voc� escolheu Tesoura");
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
	    	System.out.println("\nVoc�s empataram essa rodada");
		} else if (escolhaDoUsuario == 1 && escolhaDoComputador == 3) {
			System.out.println("\nVoc� ganhou essa rodada");
		} else {
			System.out.println("\nComputador ganhou essa rodada");
			}
		}
	}
