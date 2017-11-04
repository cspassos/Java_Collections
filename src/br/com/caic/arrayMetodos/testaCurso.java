package br.com.caic.arrayMetodos;

import java.util.List;

public class testaCurso {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Sistema de Informação", "Caic Souza Passos");
		
		
		//javaColecoes.getAulas().add(new Aula("teste aula 1", 21));
		//Como criei o metodo adiciona. agora basta fazer assim:
		javaColecoes.adiciona(new Aula("teste aula 1", 21));
		javaColecoes.adiciona(new Aula("teste aula 2", 31));
		javaColecoes.adiciona(new Aula("teste aula 3", 4-1));
		
		
		System.out.println(javaColecoes.getAulas());
		
	}
}
