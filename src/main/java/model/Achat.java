package model;



import java.time.LocalDate;
import java.util.Date;

public class Achat {
    private Jeu jeu;
    private LocalDate date;
    private double prix;

    
    public Achat(Jeu jeu, LocalDate date, double prix) {
        this.jeu = jeu;
        this.date = date;
        this.prix = prix;
    }

    
    public Jeu getJeu() {
        return jeu;
    }

    
    public LocalDate getDate() {
        return date;
    }

    
    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return "Achat [jeu=" + jeu.getTitre() + ", date=" + date + ", prix=" + prix + "]";
    }
}

