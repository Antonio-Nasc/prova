package q9;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		
		String nome;
		
		double salario, bonus, desconto, salarioLiquido;
		int nFuncio;
		System.out.println("Informe o número de funcionários: ");
		nFuncio = input.nextInt();
		
		ArrayList<Funcionario> funcionarios = new ArrayList();
		
		for(int i = 0; i < nFuncio; i++ ) {
			salario = 0; bonus = 0; desconto = 0; salarioLiquido = 0;
			System.out.println("Informe seu nome: ");
			nome = input.next();
			
			System.out.println("Informe o salário: ");
			salario = input.nextDouble();
			
			if(salario <= 1000) {
				bonus = salario * 20 / 100;
				salarioLiquido = salario + bonus;
			} else if (salario <= 2000) {
				bonus = salario * 10 / 100;
				salarioLiquido = salario + bonus;
			} else {
				desconto = salario * 10 / 100;
				salarioLiquido = salario - desconto;
			}
			
			funcionarios.add(new Funcionario(nome, salario, bonus, desconto, salarioLiquido));
		}
		
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i).toString());
			
		}
		
	}

}
