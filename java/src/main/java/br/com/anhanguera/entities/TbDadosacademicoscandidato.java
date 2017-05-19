package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_dadosacademicoscandidato database table.
 * 
 */
@Entity
@Table(name="tb_dadosacademicoscandidato")
@NamedQuery(name="TbDadosacademicoscandidato.findAll", query="SELECT t FROM TbDadosacademicoscandidato t")
public class TbDadosacademicoscandidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cpf;

	private String cidadeinstituicao;

	private String curso;

	@Temporal(TemporalType.DATE)
	private Date dtconclusao;

	@Temporal(TemporalType.DATE)
	private Date dtinicio;

	private String nminstituicao;

	//bi-directional one-to-one association to TbDadospessoaiscandidato
	@OneToOne
	@JoinColumn(name="cpf")
	private TbDadospessoaiscandidato tbDadospessoaiscandidato;

	//bi-directional many-to-one association to TbFormacaoacademica
	@ManyToOne
	@JoinColumn(name="idformacaoacademica")
	private TbFormacaoacademica tbFormacaoacademica;

	//bi-directional many-to-one association to TbUf
	@ManyToOne
	@JoinColumn(name="idufinstituicao")
	private TbUf tbUf;

	public TbDadosacademicoscandidato() {
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidadeinstituicao() {
		return this.cidadeinstituicao;
	}

	public void setCidadeinstituicao(String cidadeinstituicao) {
		this.cidadeinstituicao = cidadeinstituicao;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Date getDtconclusao() {
		return this.dtconclusao;
	}

	public void setDtconclusao(Date dtconclusao) {
		this.dtconclusao = dtconclusao;
	}

	public Date getDtinicio() {
		return this.dtinicio;
	}

	public void setDtinicio(Date dtinicio) {
		this.dtinicio = dtinicio;
	}

	public String getNminstituicao() {
		return this.nminstituicao;
	}

	public void setNminstituicao(String nminstituicao) {
		this.nminstituicao = nminstituicao;
	}

	public TbDadospessoaiscandidato getTbDadospessoaiscandidato() {
		return this.tbDadospessoaiscandidato;
	}

	public void setTbDadospessoaiscandidato(TbDadospessoaiscandidato tbDadospessoaiscandidato) {
		this.tbDadospessoaiscandidato = tbDadospessoaiscandidato;
	}

	public TbFormacaoacademica getTbFormacaoacademica() {
		return this.tbFormacaoacademica;
	}

	public void setTbFormacaoacademica(TbFormacaoacademica tbFormacaoacademica) {
		this.tbFormacaoacademica = tbFormacaoacademica;
	}

	public TbUf getTbUf() {
		return this.tbUf;
	}

	public void setTbUf(TbUf tbUf) {
		this.tbUf = tbUf;
	}

}