package br.com.caic.arrayMetodos;

public class TestaBuscaAlunosNoCurso {

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
		
		System.out.println("Quem é o aluno com matricula 258156?");
		Aluno aluno = javaColecoes.buscaMatriculado(258156);
		System.out.println("aluno : " + aluno); 
		
	}
}
