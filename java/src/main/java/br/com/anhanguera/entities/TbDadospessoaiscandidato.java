package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_dadospessoaiscandidato database table.
 * 
 */
@Entity
@Table(name="tb_dadospessoaiscandidato")
@NamedQuery(name="TbDadospessoaiscandidato.findAll", query="SELECT t FROM TbDadospessoaiscandidato t")
public class TbDadospessoaiscandidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cpf;

	private String celcandidato;

	private String cepcandidato;

	private String cidadecandidato;

	@Temporal(TemporalType.DATE)
	private Date dtnascimento;

	private String emailcandidato;

	private String enderecocandidato;

	private String nmcandidato;

	private String rg;

	private String telcandidato;

	//bi-directional one-to-one association to TbCartaapresentacaocandidato
	@OneToOne(mappedBy="tbDadospessoaiscandidato")
	private TbCartaapresentacaocandidato tbCartaapresentacaocandidato;

	//bi-directional one-to-one association to TbDadosacademicoscandidato
	@OneToOne(mappedBy="tbDadospessoaiscandidato")
	private TbDadosacademicoscandidato tbDadosacademicoscandidato;

	//bi-directional many-to-one association to TbEstadocivil
	@ManyToOne
	@JoinColumn(name="idestadocivil")
	private TbEstadocivil tbEstadocivil;

	//bi-directional many-to-one association to TbSexo
	@ManyToOne
	@JoinColumn(name="idsexo")
	private TbSexo tbSexo;

	//bi-directional many-to-one association to TbUf
	@ManyToOne
	@JoinColumn(name="idufcandidato")
	private TbUf tbUf;

	//bi-directional one-to-one association to TbExperienciaprofissionalcandidato
	@OneToOne(mappedBy="tbDadospessoaiscandidato")
	private TbExperienciaprofissionalcandidato tbExperienciaprofissionalcandidato;

	//bi-directional many-to-one association to TbMensagensenviadascandidato
	@OneToMany(mappedBy="tbDadospessoaiscandidato")
	private List<TbMensagensenviadascandidato> tbMensagensenviadascandidatos;

	//bi-directional many-to-one association to TbMensagensrecebidascandidato
	@OneToMany(mappedBy="tbDadospessoaiscandidato")
	private List<TbMensagensrecebidascandidato> tbMensagensrecebidascandidatos;

	public TbDadospessoaiscandidato() {
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelcandidato() {
		return this.celcandidato;
	}

	public void setCelcandidato(String celcandidato) {
		this.celcandidato = celcandidato;
	}

	public String getCepcandidato() {
		return this.cepcandidato;
	}

	public void setCepcandidato(String cepcandidato) {
		this.cepcandidato = cepcandidato;
	}

	public String getCidadecandidato() {
		return this.cidadecandidato;
	}

	public void setCidadecandidato(String cidadecandidato) {
		this.cidadecandidato = cidadecandidato;
	}

	public Date getDtnascimento() {
		return this.dtnascimento;
	}

	public void setDtnascimento(Date dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	public String getEmailcandidato() {
		return this.emailcandidato;
	}

	public void setEmailcandidato(String emailcandidato) {
		this.emailcandidato = emailcandidato;
	}

	public String getEnderecocandidato() {
		return this.enderecocandidato;
	}

	public void setEnderecocandidato(String enderecocandidato) {
		this.enderecocandidato = enderecocandidato;
	}

	public String getNmcandidato() {
		return this.nmcandidato;
	}

	public void setNmcandidato(String nmcandidato) {
		this.nmcandidato = nmcandidato;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelcandidato() {
		return this.telcandidato;
	}

	public void setTelcandidato(String telcandidato) {
		this.telcandidato = telcandidato;
	}

	public TbCartaapresentacaocandidato getTbCartaapresentacaocandidato() {
		return this.tbCartaapresentacaocandidato;
	}

	public void setTbCartaapresentacaocandidato(TbCartaapresentacaocandidato tbCartaapresentacaocandidato) {
		this.tbCartaapresentacaocandidato = tbCartaapresentacaocandidato;
	}

	public TbDadosacademicoscandidato getTbDadosacademicoscandidato() {
		return this.tbDadosacademicoscandidato;
	}

	public void setTbDadosacademicoscandidato(TbDadosacademicoscandidato tbDadosacademicoscandidato) {
		this.tbDadosacademicoscandidato = tbDadosacademicoscandidato;
	}

	public TbEstadocivil getTbEstadocivil() {
		return this.tbEstadocivil;
	}

	public void setTbEstadocivil(TbEstadocivil tbEstadocivil) {
		this.tbEstadocivil = tbEstadocivil;
	}

	public TbSexo getTbSexo() {
		return this.tbSexo;
	}

	public void setTbSexo(TbSexo tbSexo) {
		this.tbSexo = tbSexo;
	}

	public TbUf getTbUf() {
		return this.tbUf;
	}

	public void setTbUf(TbUf tbUf) {
		this.tbUf = tbUf;
	}

	public TbExperienciaprofissionalcandidato getTbExperienciaprofissionalcandidato() {
		return this.tbExperienciaprofissionalcandidato;
	}

	public void setTbExperienciaprofissionalcandidato(TbExperienciaprofissionalcandidato tbExperienciaprofissionalcandidato) {
		this.tbExperienciaprofissionalcandidato = tbExperienciaprofissionalcandidato;
	}

	public List<TbMensagensenviadascandidato> getTbMensagensenviadascandidatos() {
		return this.tbMensagensenviadascandidatos;
	}

	public void setTbMensagensenviadascandidatos(List<TbMensagensenviadascandidato> tbMensagensenviadascandidatos) {
		this.tbMensagensenviadascandidatos = tbMensagensenviadascandidatos;
	}

	public TbMensagensenviadascandidato addTbMensagensenviadascandidato(TbMensagensenviadascandidato tbMensagensenviadascandidato) {
		getTbMensagensenviadascandidatos().add(tbMensagensenviadascandidato);
		tbMensagensenviadascandidato.setTbDadospessoaiscandidato(this);

		return tbMensagensenviadascandidato;
	}

	public TbMensagensenviadascandidato removeTbMensagensenviadascandidato(TbMensagensenviadascandidato tbMensagensenviadascandidato) {
		getTbMensagensenviadascandidatos().remove(tbMensagensenviadascandidato);
		tbMensagensenviadascandidato.setTbDadospessoaiscandidato(null);

		return tbMensagensenviadascandidato;
	}

	public List<TbMensagensrecebidascandidato> getTbMensagensrecebidascandidatos() {
		return this.tbMensagensrecebidascandidatos;
	}

	public void setTbMensagensrecebidascandidatos(List<TbMensagensrecebidascandidato> tbMensagensrecebidascandidatos) {
		this.tbMensagensrecebidascandidatos = tbMensagensrecebidascandidatos;
	}

	public TbMensagensrecebidascandidato addTbMensagensrecebidascandidato(TbMensagensrecebidascandidato tbMensagensrecebidascandidato) {
		getTbMensagensrecebidascandidatos().add(tbMensagensrecebidascandidato);
		tbMensagensrecebidascandidato.setTbDadospessoaiscandidato(this);

		return tbMensagensrecebidascandidato;
	}

	public TbMensagensrecebidascandidato removeTbMensagensrecebidascandidato(TbMensagensrecebidascandidato tbMensagensrecebidascandidato) {
		getTbMensagensrecebidascandidatos().remove(tbMensagensrecebidascandidato);
		tbMensagensrecebidascandidato.setTbDadospessoaiscandidato(null);

		return tbMensagensrecebidascandidato;
	}

}