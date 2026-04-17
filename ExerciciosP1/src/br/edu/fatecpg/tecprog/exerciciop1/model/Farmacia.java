package br.edu.fatecpg.tecprog.exerciciop1.model;

public class Farmacia {
	private String[] nomesMedicamentos;
	private int[] diasParaVencimento;
	private double[] precos;
	private int quantidade;

	public Farmacia(int tamanho) {
		nomesMedicamentos = new String[tamanho];
		diasParaVencimento = new int[tamanho];
		precos = new double[tamanho];
		quantidade = 0;
	}

	public void adicionarMedicamento(String nome, int dias, double preco) {
		nomesMedicamentos[quantidade] = nome;
		diasParaVencimento[quantidade] = dias;
		precos[quantidade] = preco;
		quantidade++;
	}

	public void listarMedicamentos() {
		System.out.println("=== Medicamentos ===");
		for (int i = 0; i < quantidade; i++) {
			System.out.println(nomesMedicamentos[i] + " | Dias: " + diasParaVencimento[i] + " | Preço: R$" + precos[i]);
		}
	}

	public double calcularMediaDias() {
		int soma = 0;
		for (int i = 0; i < quantidade; i++)
			soma += diasParaVencimento[i];
		return (double) soma / quantidade;
	}

	public void listarProximosVencer() {
		System.out.println("=== Próximos de Vencer ===");
		for (int i = 0; i < quantidade; i++) {
			if (diasParaVencimento[i] < 5) {
				System.out.println(nomesMedicamentos[i] + " | Dias restantes: " + diasParaVencimento[i]);
			}
		}
	}

	public void aplicarDescontoProximosVencer() {
		for (int i = 0; i < quantidade; i++) {
			if (diasParaVencimento[i] < 5) {
				precos[i] = precos[i] * 0.5;
			}
		}
		System.out.println("Desconto de 50% aplicado!");
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