package chifoumi;

public class Joueur {
    private String nom;
    private int score;
    IHMSaisie saisie;

    Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
        this.saisie = new IHMSaisie(nom);
    }

    public void crediter() {
        this.score ++;
    }

    public Choix choisir() {
        return this.saisie.proposerChoix();
    }

    public int getScore() {
        return this.score;
    }

    public void ecrireScore() {
        System.out.printf("Le score de %s est: %d\n", this.nom, this.score);
    }

    public String getNom() {
        return nom;
    }
}
