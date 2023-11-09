package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Hybride;
import model.Jeu ; 

public class Test {

	public static void main(String[] args) {
		
	

	
		Adresse a = new Adresse(2, "Rue du Chateaux", "Hyrule");
		Boutique b = new Boutique("Carrefour", a);
		Jeu jeu1 = new Jeu("titre1", null, b);
        Jeu jeu2 = new Jeu("titre2", null, b);
        Jeu jeu3 = new Jeu("titre3", null, b);
        Jeu jeu4 = new Jeu("titre4", null, b);
        Jeu jeu5 = new Jeu("titre5", null, b);
        Console console1 = new Hybride ("PlayStation 5", 499, LocalDate.now());
        Console console2 = new Hybride("Xbox Series X", 499, LocalDate.now());
        Console console3 = new Hybride("Nintendo Switch", 299, LocalDate.now());
        Console console4 = new Hybride("PlayStation 5", 499, LocalDate.now());
        Console console5 = new Hybride ("PlayStation 5", 499, LocalDate.now());
        
    	List<Achat> achat =new ArrayList(); 
		Achat a1 = new Achat(jeu1, LocalDate.now(), 20.2); 
		achat.add(a1); 
		
		
		Client c1 = new Client("Mbappé", "kylian", achat); 
		Client c2 = new Client("Gall", "France", achat); 
	}}



