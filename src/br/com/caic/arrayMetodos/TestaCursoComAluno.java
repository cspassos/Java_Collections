package br.com.caic.arrayMetodos;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Sistema de Informação", "Caic Souza Passos");
		
		javaColecoes.adiciona(new Aula("C teste aula 1", 21));
		javaColecoes.adiciona(new Aula("B teste aula 2", 31));
		javaColecoes.adiciona(new Aula("A teste aula 3", 41));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 258156);
		Aluno a2 = new Aluno("Guilherme Ramos Barbosa", 000214);
		Aluno a3 = new Aluno("Ramos Souza", 333388);
	
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos matriculados: ");
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
	
		System.out.println("");
		System.out.println("O aluno " + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println("");
		Aluno turini = new Aluno("Rodrigo Turini", 258156);
		System.out.println("O aluno " + turini + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("a1 equals turini?");
		System.out.println(a1.equals(turini));
		
		
		System.out.println("*********************************************************************");
		System.out.println("");
		//metodo antigo antes do java 5, que se usava no lugar do foreach 
		//Utilizando iterator
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

	}
}
