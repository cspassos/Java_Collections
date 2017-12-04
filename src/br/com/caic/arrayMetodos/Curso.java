package br.com.caic.arrayMetodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
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
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "," + "aulas: " + this.aulas + "]";
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno); 
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno); // para nao ficar comparaando para saber se é essa aluno
		// com o contains ele ja procura se esse aluno esta matriculado
	}
}
