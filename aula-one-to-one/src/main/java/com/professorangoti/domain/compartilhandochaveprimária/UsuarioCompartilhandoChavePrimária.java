package com.professorangoti.domain.compartilhandochaveprimária;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class UsuarioCompartilhandoChavePrimária {
	@Id
	private Integer id;

	private String nome;

	@OneToOne
	@PrimaryKeyJoinColumn
	private EnderecoCompartilhandoChavePrimária enderecoDeEntrega;

	public UsuarioCompartilhandoChavePrimária() {
		super();
	}

	public UsuarioCompartilhandoChavePrimária(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnderecoCompartilhandoChavePrimária getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(EnderecoCompartilhandoChavePrimária enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

}
