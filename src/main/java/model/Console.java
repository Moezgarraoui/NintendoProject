package model;
import java.time.LocalDate;


public abstract class Console {


	protected String nom;
	protected int prix;
	protected LocalDate date;


	public Console(String nom, int prix, LocalDate date) {
		this.nom = nom;
		this.prix = prix;
		this.date = date;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", date=" + date + "]";
	}
	
	
}
