package br.com.caic.arrayMetodos;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}

	@Override
	public String toString() {
		return "Aula [titulo=" + titulo + ", tempo=" + tempo + " minutos]";
	}

	@Override //Ordena os objetos pelo titulo
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
}
