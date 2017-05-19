package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_cartaapresentacaocandidato database table.
 * 
 */
@Entity
@Table(name="tb_cartaapresentacaocandidato")
@NamedQuery(name="TbCartaapresentacaocandidato.findAll", query="SELECT t FROM TbCartaapresentacaocandidato t")
public class TbCartaapresentacaocandidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cpf;

	private String cartaapresentacao;

	//bi-directional one-to-one association to TbDadospessoaiscandidato
	@OneToOne
	@JoinColumn(name="cpf")
	private TbDadospessoaiscandidato tbDadospessoaiscandidato;

	public TbCartaapresentacaocandidato() {
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCartaapresentacao() {
		return this.cartaapresentacao;
	}

	public void setCartaapresentacao(String cartaapresentacao) {
		this.cartaapresentacao = cartaapresentacao;
	}

	public TbDadospessoaiscandidato getTbDadospessoaiscandidato() {
		return this.tbDadospessoaiscandidato;
	}

	public void setTbDadospessoaiscandidato(TbDadospessoaiscandidato tbDadospessoaiscandidato) {
		this.tbDadospessoaiscandidato = tbDadospessoaiscandidato;
	}

}