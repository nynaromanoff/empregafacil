package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_mensagensrecebidascandidato database table.
 * 
 */
@Entity
@Table(name="tb_mensagensrecebidascandidato")
@NamedQuery(name="TbMensagensrecebidascandidato.findAll", query="SELECT t FROM TbMensagensrecebidascandidato t")
public class TbMensagensrecebidascandidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idmensagem;

	private String assunto;

	private String mensagem;

	private byte situacao;

	//bi-directional many-to-one association to TbDadosempresa
	@ManyToOne
	@JoinColumn(name="origem")
	private TbDadosempresa tbDadosempresa;

	//bi-directional many-to-one association to TbDadospessoaiscandidato
	@ManyToOne
	@JoinColumn(name="destinatario")
	private TbDadospessoaiscandidato tbDadospessoaiscandidato;

	public TbMensagensrecebidascandidato() {
	}

	public int getIdmensagem() {
		return this.idmensagem;
	}

	public void setIdmensagem(int idmensagem) {
		this.idmensagem = idmensagem;
	}

	public String getAssunto() {
		return this.assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public byte getSituacao() {
		return this.situacao;
	}

	public void setSituacao(byte situacao) {
		this.situacao = situacao;
	}

	public TbDadosempresa getTbDadosempresa() {
		return this.tbDadosempresa;
	}

	public void setTbDadosempresa(TbDadosempresa tbDadosempresa) {
		this.tbDadosempresa = tbDadosempresa;
	}

	public TbDadospessoaiscandidato getTbDadospessoaiscandidato() {
		return this.tbDadospessoaiscandidato;
	}

	public void setTbDadospessoaiscandidato(TbDadospessoaiscandidato tbDadospessoaiscandidato) {
		this.tbDadospessoaiscandidato = tbDadospessoaiscandidato;
	}

}