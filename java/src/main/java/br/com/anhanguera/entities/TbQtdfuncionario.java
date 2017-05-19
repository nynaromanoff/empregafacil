package br.com.anhanguera.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_qtdfuncionario database table.
 * 
 */
@Entity
@Table(name="tb_qtdfuncionario")
public class TbQtdfuncionario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idqtdfuncionario;

	private String dsqtdfuncionario;


	public TbQtdfuncionario() {
	}

	public int getIdqtdfuncionario() {
		return this.idqtdfuncionario;
	}

	public void setIdqtdfuncionario(int idqtdfuncionario) {
		this.idqtdfuncionario = idqtdfuncionario;
	}

	public String getDsqtdfuncionario() {
		return this.dsqtdfuncionario;
	}

	public void setDsqtdfuncionario(String dsqtdfuncionario) {
		this.dsqtdfuncionario = dsqtdfuncionario;
	}
}