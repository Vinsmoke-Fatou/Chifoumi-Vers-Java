package chifoumi;

public class JeuUnTour {
    private Joueur joueur1;
    private Joueur joueur2;

    JeuUnTour(String nom1, String nom2) {
        this.joueur1 = new Joueur(nom1);
        this.joueur2 = new Joueur(nom2);
        jouer();
    }

    public void jouer() {
        tour();
        System.out.println("------- Scores -------");
        this.joueur1.ecrireScore();
        this.joueur2.ecrireScore();
    }

    public void tour() {
        Choix choix1 = this.joueur1.choisir();
        Choix choix2 = this.joueur2.choisir();

        if (choix1 == Choix.CISEAUX) {
            if (choix2 ==  Choix.PAPIER) joueur1.crediter();
            else if  (choix2 ==  Choix.PIERRE) joueur2.crediter();
        }
        else if (choix1 == Choix.PAPIER)  {
            if (choix2 ==  Choix.PIERRE) joueur1.crediter();
            else if  (choix2 ==  Choix.CISEAUX) joueur2.crediter();
        }
        else if (choix1 == Choix.PIERRE)  {
            if (choix2 ==  Choix.CISEAUX) joueur1.crediter();
            else if  (choix2 ==  Choix.PAPIER) joueur2.crediter();
        }
    }

    public void conclure() {
        if (this.joueur1.getScore() > this.joueur2.getScore()) {
            System.out.printf("Le gagnant est %s avec comme score %d\n", this.joueur1.getNom(), this.joueur1.getScore());
        } else if (this.joueur1.getScore() < this.joueur2.getScore()) {
            System.out.printf("Le gagnant est %s avec comme score %d\n", this.joueur2.getNom(), this.joueur2.getScore());
        } else {
            System.out.println("Les joueurs sont à égalité");
        }
    }

}
