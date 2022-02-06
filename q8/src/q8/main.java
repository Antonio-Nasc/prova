package q8;

import java.util.Scanner;
import java.time.LocalTime;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Usuario> usuario = new ArrayList<Usuario>();
		
		System.out.println("Informe seu usuário: ");
		String nomeUsuario = input.next();
		
		System.out.println("Informe sua senha: ");
		String senha = input.next();
		
		usuario.add(new Usuario("Juan", "2222"));
		usuario.add(new Usuario("jogo", "3333"));
		
		for (int i = 0; i < usuario.size(); i++); {
			if (usuario.get(i).getUsuario().equals(nomeUsuario)) && (usuario.get(i).getSenha().equals(senha))) {
				exibeMesangem();
				System.out.println("Acesso liberado!");
				break;
			} else {
				System.out.println("Usuário ou login inválidos");
				break;
			}
		}
		
		public static void exibeMesangem() {
			LocalTime presentTime = LocalTime.now();
			if (presentTime.getHour() <= 5) {
				System.out.println("Boa madrugada! ");
			} else if (presentTime.getHour() < 12) {
				System.out.println("Bom dia! ");
			} else if (presentTime.getHour() < 18) {
				System.out.println("Boa tarde! ");
			} else {
				System.out.println("Boa noite! ");
			}
		}
		
		
	}

}
