package q7;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		int corretas = 0;
		int erradas = 0;
		
		ArrayList<Perguntas> perguntas = new ArrayList<Perguntas>();
		
		System.out.println("Digite seu nome: ");
		nome = input.next();

		perguntas.add(new Perguntas("Qual o número da camisa que Cristiano Ronaldo usava no real madrid ?", "7"));
		perguntas.add(new Perguntas("Quem é o protagonista do anime One piece? ", "Luffy"));
		
		

		for (int i = 0; i < 2; i++) {
			System.out.println( perguntas.get(i).getPergunta());
			System.out.print("Sua resposta é: ");
			String resposta = input.next();
			if (perguntas.get(i).getResposta().equalsIgnoreCase(resposta)) {
				System.out.println("Resporta correta!\n");
				corretas++;
			} else {
				System.out.println("Resposta errada! ");
				erradas++;
			}
		}
		System.out.println(nome);
		System.out.println("Respostas corretas: " + corretas);
		System.out.println("Respostas erradas: " + erradas);
		input.close();
	}

}
