package test;


import java.util.List;

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
		
		Jeu jeu1 = new Jeu(null, null, null);
        Jeu jeu2 = new Jeu(null, null, null);
        Jeu jeu3 = new Jeu(null, null, null);
        Jeu jeu4 = new Jeu(null, null, null);
        Jeu jeu5 = new Jeu(null, null, null);
	}}



