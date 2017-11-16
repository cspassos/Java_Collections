package br.com.caic.arrayMetodos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		//O set não aceita elementos repetidos
		Collection<String> alunos = new HashSet<>();
		
		//Tenho dois Caic, mas ele vai mostrar epanas um
		alunos.add("Caic Souza");
		alunos.add("Caic Souza");
		alunos.add("Jhonata Kolen");
		alunos.add("Caroline Souza");
		alunos.add("Eduardo Mendes");
		alunos.add("Nardo Mendes");
		alunos.add("Victor Nada");
		
		System.out.println("Saber se o Caic esta matriculado");
		//Saber se o Caic Esta matriculado
		boolean caicEstaMatriculado = alunos.contains("Caic Souza");
		System.out.println(caicEstaMatriculado);
		
		System.out.println("  ");
		System.out.println("forEach");
		System.out.println("  ");
		
		//Esses doi foreEach fazem a mesma coisa
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("  ");
		System.out.println("Outro forEach");
		System.out.println("  ");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
	}
}
