package br.com.caic.arrayMetodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Sistema de Informação", "Caic Souza Passos");
		
		
		//javaColecoes.getAulas().add(new Aula("teste aula 1", 21));
		//Como criei o metodo adiciona. agora basta fazer assim:
		javaColecoes.adiciona(new Aula("C teste aula 1", 21));
		javaColecoes.adiciona(new Aula("B teste aula 2", 31));
		javaColecoes.adiciona(new Aula("A teste aula 3", 41));
		
		
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal() + " minutos");
		
		//Vai funcionar por causa do toString
		System.out.println(javaColecoes);
	}
}
