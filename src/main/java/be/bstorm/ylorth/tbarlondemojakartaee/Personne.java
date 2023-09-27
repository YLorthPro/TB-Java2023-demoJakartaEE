package be.bstorm.ylorth.tbarlondemojakartaee;

import java.time.LocalDate;

public class Personne {
    public String nom;
    public String prenom;
    public LocalDate age;

    @Override
    public String toString() {
        return "Je m'appelle "+prenom+" "+nom+ " et j'ai " + (LocalDate.now().getYear()-age.getYear()) +" ans";
    }
}
