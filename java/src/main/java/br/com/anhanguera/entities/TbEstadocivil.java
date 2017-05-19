package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_estadocivil database table.
 * 
 */
@Entity
@Table(name="tb_estadocivil")
public class TbEstadocivil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idestadocivil;

	private String dsestadocivil;


	public TbEstadocivil() {
	}

	public int getIdestadocivil() {
		return this.idestadocivil;
	}

	public void setIdestadocivil(int idestadocivil) {
		this.idestadocivil = idestadocivil;
	}

	public String getDsestadocivil() {
		return this.dsestadocivil;
	}

	public void setDsestadocivil(String dsestadocivil) {
		this.dsestadocivil = dsestadocivil;
	}

	}

