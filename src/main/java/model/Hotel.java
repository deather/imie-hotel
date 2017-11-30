package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String nom;
	private List<Personnel> personnels;
	private List<Etage> etages;

	public Hotel(String nom) {
		this.nom = nom;
		this.etages = new ArrayList<>();
	}

	public String getNom() {
		return this.nom;
	}

	public List<Etage> getEtages() {
		return this.etages;
	}

	public void add(Etage e) {
		this.etages.add(e);
	}

	public void add(Personnel p) {
		this.personnels.add(p);
	}

	public void delete(Etage e) {

	}

	public void delete(Personnel p) {

	}

}
