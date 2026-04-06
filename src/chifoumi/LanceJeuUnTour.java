package chifoumi;

import java.util.Scanner;

public class LanceJeuUnTour {
    static void main(String[] args) {
        String nom1, nom2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom Joueur 1 : ");
        nom1 = sc.next();
        System.out.print("Nom Joueur 2 : ");
        nom2 = sc.next();
        new JeuUnTour(nom1, nom2);
    }
}
