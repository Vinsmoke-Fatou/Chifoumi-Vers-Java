package chifoumi;

import java.util.Scanner;

public class LanceJeu {
    static void main(String[] args) {
       String nom1, nom2;
       int score;
       Scanner sc = new Scanner(System.in);
       System.out.print("Nom Joueur 1 : ");
       nom1 = sc.next();
       System.out.print("Nom Joueur 2 : ");
       nom2 = sc.next();
       System.out.print("Score à atteindre : ");
       score = sc.nextInt();

       new Jeu(nom1, nom2, score);
    }
}
