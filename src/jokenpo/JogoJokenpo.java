package jokenpo;

import java.util.Scanner;

public class JogoJokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int min = 1;
		int max = 3;
		int escolhaDoComputador = (int)Math.floor(Math.random()*(max-min+1)+min); 
		
		int pedra = 1;
		int papel = 2;
		int tesoura = 3;
		
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
	   
	    
	    if (escolhaDoUsuario == escolhaDoComputador) {
	    	System.out.println("\nVocês empataram essa rodada");
		} else if (escolhaDoUsuario == pedra && escolhaDoComputador == papel) {
			System.out.println("\nVocê perdeu essa rodada. Computador ganhou essa. Papel ganha de pedra");
		} else if (escolhaDoUsuario == pedra && escolhaDoComputador == tesoura ){
			System.out.println("\nVocê ganhou essa rodada. Pedra ganha de tesoura");
		} else if (escolhaDoUsuario == tesoura && escolhaDoComputador == papel) {
			System.out.println("\nVocê ganhou essa rodada. Tesoura ganha de papel");
		} else if (escolhaDoUsuario == tesoura && escolhaDoComputador == pedra) {
			System.out.println("\nVocê perdeu essa rodada. Pedra ganha de tesoura.");
		} else if (escolhaDoUsuario == papel && escolhaDoComputador == pedra) {
			System.out.println("\nVocê ganhou essa rodada. Papel ganha de pedra");
		} else {
			System.out.println("\nVocê perdeu essa rodada. Computador ganhou essa. Tesoura ganha de papel");
		}
		
	}
	
	}
