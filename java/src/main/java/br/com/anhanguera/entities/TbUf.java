package br.com.anhanguera.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the tb_uf database table.
 * 
 */
@Entity
@Table(name="tb_uf")
public class TbUf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int iduf;

	private String dsuf;

	public TbUf() {
	}

	public int getIduf() {
		return this.iduf;
	}

	public void setIduf(int iduf) {
		this.iduf = iduf;
	}

	public String getDsuf() {
		return this.dsuf;
	}

	public void setDsuf(String dsuf) {
		this.dsuf = dsuf;
	}


}