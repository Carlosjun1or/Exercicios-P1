package br.edu.fatecpg.tecprog.exerciciop1.view;

import br.edu.fatecpg.tecprog.exerciciop1.model.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("---Carro---\n");
		Carro meuCarro = new Carro();
		meuCarro.modelo = "Ford Ka";
		meuCarro.marca = "Ford";
		meuCarro.ano = 2022;

		System.out.println("Modelo: " + meuCarro.modelo + "\nMarca: " + meuCarro.marca + "\nAno: " + meuCarro.ano);

		System.out.println("\n\n---Aluno---\n");
		Aluno meuAluno = new Aluno();
		meuAluno.setNome("Carolina");
		meuAluno.setMatricula(139589102);
		meuAluno.setNotaFinal(10.00);

		System.out.println("Nome: " + meuAluno.getNome() + "\nMatricula: " + meuAluno.getMatricula() + "\nNota Final: "
				+ meuAluno.getNotaFinal());

		System.out.println("\n\n---Farmacia---\n");
		String[] nomes = { "Dipirona", "Ritalina", "Dorflex" };
		int[] dias = { 15, 3, 2 };
		double[] precos = { 9.99, 29.78, 16.55 };
		Farmacia minhaFarmacia = new Farmacia(nomes, dias, precos);
		minhaFarmacia.listarMedicamentos();
		minhaFarmacia.calcularMediaDiasVencimento();
		minhaFarmacia.listarProximosVencer();
		minhaFarmacia.aplicarDescontoProximosVencer();
		minhaFarmacia.venderMedicamento("Dipirona");
	}
}
