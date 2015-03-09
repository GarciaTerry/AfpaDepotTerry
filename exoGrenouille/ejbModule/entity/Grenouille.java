package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Grenouille implements IGrenouille, Serializable {
	
	@Version
	private static final long serialVersionUID = 1L;
	
	@Id
	int code;
	String nom;
	
	public Grenouille() {
		super();
	}

	public Grenouille(int code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}

	@Override
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Grenouille [code=" + code + ", nom=" + nom + "]";
	}

}
