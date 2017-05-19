package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_formacaoacademica database table.
 * 
 */
@Entity
@Table(name="tb_formacaoacademica")
public class TbFormacaoacademica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idformacaoacademica;

	private String dsformacaoacademica;


	public TbFormacaoacademica() {
	}

	public int getIdformacaoacademica() {
		return this.idformacaoacademica;
	}

	public void setIdformacaoacademica(int idformacaoacademica) {
		this.idformacaoacademica = idformacaoacademica;
	}

	public String getDsformacaoacademica() {
		return this.dsformacaoacademica;
	}

	public void setDsformacaoacademica(String dsformacaoacademica) {
		this.dsformacaoacademica = dsformacaoacademica;
	}


}