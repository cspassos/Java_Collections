package br.com.caic;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println("Aulas: " + aulas);

		String primeiraAula = aulas.get(0);
		System.out.println("Primeira Aula: " + primeiraAula);
		
		System.out.println();
		
		System.out.println("for normal:");
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula " + i + ": " + aulas.get(i));
		}

		System.out.println();

		System.out.println("forEach:");

		for (String aula : aulas) {
			System.out.println(aula);
		}

		System.out.println();

		System.out.println("forEach java 8:");
		aulas.forEach(aula -> {
			System.out.println("percorrendo: " + aula);
		});
		
		System.out.println();
		
		System.out.println("Ordenando lista com Collections, A-Z: ");
		
		aulas.add("A aula um é essa!");
		Collections.sort(aulas);
		
		System.out.println("Depois de ordenado: " + aulas);
	}
}
