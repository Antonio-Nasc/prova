package q9;

public class Funcionario {
	
	private String nome;
	private double salario, bonus, desconto, salarioLiquido;
	
	public Funcionario(String nome, double salario, double bonus, double desconto, double salarioLiquido) {
		this.nome = nome;
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
		this.salarioLiquido = salarioLiquido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	

}
