package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_dadosempresa database table.
 * 
 */
@Entity
@Table(name="tb_dadosempresa")
public class TbDadosempresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cnpj;

	private String cepempresa;

	private String cidadeempresa;

	private String emailempresa;

	private String enderecoempresa;

	private String ie;

	private String nmempresa;

	private String razaosocial;

	private String siteempresa;

	private String telempresa;

	public TbDadosempresa() {
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCepempresa() {
		return this.cepempresa;
	}

	public void setCepempresa(String cepempresa) {
		this.cepempresa = cepempresa;
	}

	public String getCidadeempresa() {
		return this.cidadeempresa;
	}

	public void setCidadeempresa(String cidadeempresa) {
		this.cidadeempresa = cidadeempresa;
	}

	public String getEmailempresa() {
		return this.emailempresa;
	}

	public void setEmailempresa(String emailempresa) {
		this.emailempresa = emailempresa;
	}

	public String getEnderecoempresa() {
		return this.enderecoempresa;
	}

	public void setEnderecoempresa(String enderecoempresa) {
		this.enderecoempresa = enderecoempresa;
	}

	public String getIe() {
		return this.ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getNmempresa() {
		return this.nmempresa;
	}

	public void setNmempresa(String nmempresa) {
		this.nmempresa = nmempresa;
	}

	public String getRazaosocial() {
		return this.razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getSiteempresa() {
		return this.siteempresa;
	}

	public void setSiteempresa(String siteempresa) {
		this.siteempresa = siteempresa;
	}

	public String getTelempresa() {
		return this.telempresa;
	}

	public void setTelempresa(String telempresa) {
		this.telempresa = telempresa;
	}

	
}