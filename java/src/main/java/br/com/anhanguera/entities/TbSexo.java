package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_sexo database table.
 * 
 */
@Entity
@Table(name="tb_sexo")
public class TbSexo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idsexo;

	private String dssexo;

	public TbSexo() {
	}

	public int getIdsexo() {
		return this.idsexo;
	}

	public void setIdsexo(int idsexo) {
		this.idsexo = idsexo;
	}

	public String getDssexo() {
		return this.dssexo;
	}

	public void setDssexo(String dssexo) {
		this.dssexo = dssexo;
	}

}