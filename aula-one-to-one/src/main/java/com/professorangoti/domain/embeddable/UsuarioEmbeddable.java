package com.professorangoti.domain.embeddable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioEmbeddable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	private EnderecoEmbeddable enderecoDeEntrega;

//	@AttributeOverrides({
//		@AttributeOverride(name = "logradouro", column = @Column(name = "cobrança_logradouro")), 
//		@AttributeOverride(name = "numero", column = @Column(name = "cobrança_numero")), 
//		@AttributeOverride(name = "cep", column = @Column(name = "cobrança_cep")), 
//		@AttributeOverride(name = "cidade", column = @Column(name = "cobrança_cidade"))		
//	})
//	private EnderecoEmbeddable enderecoDeCobranca;

	public UsuarioEmbeddable() {
		super();
	}

	public UsuarioEmbeddable(String nome) {
		super();
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public EnderecoEmbeddable getEnderecoDeCobranca() {
//		return enderecoDeCobranca;
//	}
//
//	public void setEnderecoDeCobranca(EnderecoEmbeddable enderecoDeCobranca) {
//		this.enderecoDeCobranca = enderecoDeCobranca;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnderecoEmbeddable getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public void setEnderecoDeEntrega(EnderecoEmbeddable enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

}
