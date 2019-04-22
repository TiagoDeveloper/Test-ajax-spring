package com.tiagodeveloper.model;

import com.tiagodeveloper.enumarator.SetorEnum;

public class Profissao {
	
	private Long id;
	private String nome;
	private SetorEnum setor;
	
	public Profissao() {
		super();
	}

	public Profissao(Long id, String nome, SetorEnum setor) {
		super();
		this.id = id;
		this.nome = nome;
		this.setor = setor;
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
	public SetorEnum getSetor() {
		return setor;
	}
	public void setSetor(SetorEnum setor) {
		this.setor = setor;
	}

}
