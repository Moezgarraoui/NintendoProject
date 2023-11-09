package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<String> achat = new ArrayList(); 
	
	
	public Client(String nom, String prenom, List<String> achat) {
		this.nom = nom;
		this.prenom = prenom;
		this.achat = achat; 
	}
	
	
	public List<String> getAchat() {
		return achat;
	}


	public void setAchat(List<String> achat) {
		this.achat = achat;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", achat=" + achat + "]";
	}



	
	
	
	

}
