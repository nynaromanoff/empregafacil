package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_logincandidato database table.
 * 
 */
@Entity
@Table(name="tb_logincandidato")
@NamedQuery(name="TbLogincandidato.findAll", query="SELECT t FROM TbLogincandidato t")
public class TbLogincandidato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cpf;

	private String senha;

	public TbLogincandidato() {
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}