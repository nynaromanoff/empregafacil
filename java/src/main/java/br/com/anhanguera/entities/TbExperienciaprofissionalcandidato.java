package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tb_experienciaprofissionalcandidato database table.
 * 
 */
@Entity
@Table(name="tb_experienciaprofissionalcandidato")
@NamedQuery(name="TbExperienciaprofissionalcandidato.findAll", query="SELECT t FROM TbExperienciaprofissionalcandidato t")
public class TbExperienciaprofissionalcandidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cpf;

	private String dsatividades;

	private String dscargo;

	@Temporal(TemporalType.DATE)
	private Date dtadmissao;

	@Temporal(TemporalType.DATE)
	private Date dtsaida;

	private String nmempresa;

	private byte primeiroemprego;

	//bi-directional one-to-one association to TbDadospessoaiscandidato
	@OneToOne
	@JoinColumn(name="cpf")
	private TbDadospessoaiscandidato tbDadospessoaiscandidato;

	public TbExperienciaprofissionalcandidato() {
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDsatividades() {
		return this.dsatividades;
	}

	public void setDsatividades(String dsatividades) {
		this.dsatividades = dsatividades;
	}

	public String getDscargo() {
		return this.dscargo;
	}

	public void setDscargo(String dscargo) {
		this.dscargo = dscargo;
	}

	public Date getDtadmissao() {
		return this.dtadmissao;
	}

	public void setDtadmissao(Date dtadmissao) {
		this.dtadmissao = dtadmissao;
	}

	public Date getDtsaida() {
		return this.dtsaida;
	}

	public void setDtsaida(Date dtsaida) {
		this.dtsaida = dtsaida;
	}

	public String getNmempresa() {
		return this.nmempresa;
	}

	public void setNmempresa(String nmempresa) {
		this.nmempresa = nmempresa;
	}

	public byte getPrimeiroemprego() {
		return this.primeiroemprego;
	}

	public void setPrimeiroemprego(byte primeiroemprego) {
		this.primeiroemprego = primeiroemprego;
	}

	public TbDadospessoaiscandidato getTbDadospessoaiscandidato() {
		return this.tbDadospessoaiscandidato;
	}

	public void setTbDadospessoaiscandidato(TbDadospessoaiscandidato tbDadospessoaiscandidato) {
		this.tbDadospessoaiscandidato = tbDadospessoaiscandidato;
	}

}