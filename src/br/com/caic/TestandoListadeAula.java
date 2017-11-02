package br.com.caic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListadeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("japones - software", 50);
		Aula a2 = new Aula("Aula Taynara Gerenciamento", 20);
		Aula a3 = new Aula("matematica aplicado", 70);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		System.out.println("Lista Ordenada");
		//funciona porque foi adicionado uma metodo compareTo na classe aula;
		Collections.sort(aulas);
		System.out.println("COMPARAR PELO TITULO");
		System.out.println(aulas);
		
		//Fazer comparação pelo tempo de video
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println("COMPARAR PELO TEMPO");
		System.out.println(aulas);
	}
}
