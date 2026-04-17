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

	}
}
