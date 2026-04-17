package br.edu.fatecpg.tecprog.exerciciop1.model;

public class Aluno {
	private String nome;
	private int matricula;
	private double notaFinal;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public double getNotaFinal() {
		return notaFinal;
	}
}
