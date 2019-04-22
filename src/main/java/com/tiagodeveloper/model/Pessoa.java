package com.tiagodeveloper.model;

public class Pessoa {

	private Long id;
	private String nome;
	private Integer idade;
	private Profissao profissao;
	
	public Pessoa() {
		super();
	}
	public Pessoa(Long id, String nome, Integer idade, Profissao profissao) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
	
	
}
