package br.edu.aranoua.ramonsantos.princesas.modelo;

public class Princesas {
	
	private Long id;
	private String nome;
	private String reino;
	private int idade;
	
	public Princesas() {
		super();
	}

	public Princesas(Long id, String nome, String reino, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.reino = reino;
		this.idade = idade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "princesas [id=" + id + ", nome=" + nome + ", reino=" + reino + ", idade=" + idade + "]";
	}
	
	

}
