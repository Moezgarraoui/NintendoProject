package test;


import java.util.List;
import model.Client;
import model.Adresse;
import model.Boutique;


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

	}

}
