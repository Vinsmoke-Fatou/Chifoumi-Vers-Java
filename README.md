# Simulateur Java Chifoumi

Cette application est une implémentation en Java du jeu classique Pierre-Papier-Ciseaux. Elle a été conçue pour appliquer les principes fondamentaux de la programmation orientée objet, tels que l'encapsulation et la logique de contrôle.

## Objectifs du projet

- Programmation Orientée Objet : Utilisation de classes pour structurer la logique du jeu et les interactions.
- Logique conditionnelle : Gestion des règles du jeu et détermination des résultats (victoire, défaite ou égalité).
- Interaction console : Capture des entrées utilisateur et génération de choix aléatoires pour la machine.

## Fonctionnalités

- Choix utilisateur via la console.
- Génération aléatoire du choix de l'ordinateur.
- Comparaison automatique des choix et affichage du gagnant.
- Gestion des erreurs de saisie utilisateur.

## Structure du projet

Chifoumi-Java/
├── src/
│   ├── Main.java           # Point d'entrée de l'application
│   ├── Jeu.java            # Logique principale et gestion des règles
│   └── Joueur.java         # Modélisation des entités (Humain et Machine)
└── README.md

## Installation et exécution

1. Cloner le dépôt :
   git clone https://github.com/Vinsmoke-Fatou/Chifoumi-Vers-Java.git
   cd Chifoumi-Vers-Java

2. Compiler le code source :
   javac -d bin src/*.java

3. Exécuter l'application :
   java -cp bin Main

## Technologies utilisées

- Java Standard Edition (SE)
- Console système pour l'interface utilisateur

---
Projet réalisé dans le cadre de l'apprentissage de la programmation orientée objet.
