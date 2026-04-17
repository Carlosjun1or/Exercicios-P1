package br.edu.fatecpg.tecprog.exerciciop1.model;

public class Farmacia {
	private String[] nomesMedicamentos;
	private int[] diasParaVencimento;
	private double[] precos;
	private int quantidade;

	public Farmacia(String[] nomes, int[] dias, double[] precos) {
		this.nomesMedicamentos = nomes;
		this.diasParaVencimento = dias;
		this.precos = precos;
		this.quantidade = nomes.length;
	}

	public void listarMedicamentos() {
		System.out.println("=== Medicamentos ===");
		for (int i = 0; i < this.quantidade; i++) {
			System.out.println(this.nomesMedicamentos[i] + " | Dias: " + this.diasParaVencimento[i] + " | Preço: R$"
					+ this.precos[i]);
		}
	}

	public void calcularMediaDiasVencimento() {
		int soma = 0;
		for (int i = 0; i < this.quantidade; i++)
			soma += this.diasParaVencimento[i];
		System.out.println("\nMédia de Dias para Vencimento: " + soma / this.quantidade + "\n");
	}

	public void listarProximosVencer() {
		System.out.println("=== Próximos de Vencer ===");
		for (int i = 0; i < this.quantidade; i++) {
			if (this.diasParaVencimento[i] < 5) {
				System.out.println(this.nomesMedicamentos[i] + " | Dias restantes: " + this.diasParaVencimento[i]);
			}
		}
	}

	public void aplicarDescontoProximosVencer() {
		System.out.println("\n\n=== Desconto de Vencer ===");
		for (int i = 0; i < this.quantidade; i++) {
			if (this.diasParaVencimento[i] < 5) {
				this.precos[i] *= 0.5;
				System.out.println(this.nomesMedicamentos[i] + " | Dias: " + this.diasParaVencimento[i] + " | Novo Preço: R$"
						+ this.precos[i]);
			}
		}
		System.out.println("Desconto de 50% aplicado!");
	}

	public void adicionarMedicamento(String nome, int dias, double preco) {
		nomesMedicamentos[quantidade] = nome;
		diasParaVencimento[quantidade] = dias;
		precos[quantidade] = preco;
		quantidade++;
	}

	public void venderMedicamento(String nome) {
		for (int i = 0; i < quantidade; i++) {
			if (nomesMedicamentos[i].equalsIgnoreCase(nome)) {
				for (int j = i; j < quantidade - 1; j++) {
					nomesMedicamentos[j] = nomesMedicamentos[j + 1];
					diasParaVencimento[j] = diasParaVencimento[j + 1];
					precos[j] = precos[j + 1];
				}
				quantidade--;
				System.out.println(nome + " vendido com sucesso!");
				return;
			}
		}
		System.out.println("Medicamento não encontrado.");
	}
}