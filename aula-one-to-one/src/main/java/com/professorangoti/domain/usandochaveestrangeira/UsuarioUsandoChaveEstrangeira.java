package com.professorangoti.domain.usandochaveestrangeira;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UsuarioUsandoChaveEstrangeira {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@OneToOne
	private EnderecoUsandoChaveEstrangeira enderecoDeEntrega;

	public UsuarioUsandoChaveEstrangeira() {
		super();
	}

	public UsuarioUsandoChaveEstrangeira(String nome) {
		super();
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

	public EnderecoUsandoChaveEstrangeira getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(EnderecoUsandoChaveEstrangeira enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

}
