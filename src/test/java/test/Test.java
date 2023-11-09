package test;


import java.util.List;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Jeu ; 

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> achat = null; 
		achat.add("pomme"); 
		achat.add("ballon"); 
		

		Client c1 = new Client("Mbappé", "kylian", achat); 
		Client c2 = new Client("Gall", "France", achat); 

		Adresse a = new Adresse(2, "Rue du Chateaux", "Hyrule");
		Boutique b = new Boutique("Carrefour", a);
		
		Jeu jeu1 = new Jeu(null, null, b);
        Jeu jeu2 = new Jeu(null, null, b);
        Jeu jeu3 = new Jeu(null, null, b);
        Jeu jeu4 = new Jeu(null, null, b);
        Jeu jeu5 = new Jeu(null, null, b);
        

	}}



