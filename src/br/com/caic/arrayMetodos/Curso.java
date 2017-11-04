package br.com.caic.arrayMetodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); //faz com que a lista seja apenas de leitura
	} //toda vez que tentar modificar a lista ele nao vai deixar ou remover ....
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
}
