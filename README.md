Chifoumi – Jeu Console en Java
Présentation
Cette application console est une adaptation en langage Java du jeu traditionnel Pierre-Feuille-Ciseaux (Chifoumi). Elle permet à un utilisateur de se mesurer à l'ordinateur à travers une interface textuelle interactive, structurée selon les principes de la programmation orientée objet (POO).

Fonctionnalités
Gestion des Joueurs :
_Prise en compte des choix de l'utilisateur humain via des saisies sécurisées dans la console.
_Génération pseudo-aléatoire et automatisée des actions du joueur virtuel (la machine).

Arbitrage et Logique du Jeu :
_Évaluation instantanée des règles de confrontation (la pierre bat les ciseaux, la feuille bat la pierre, les ciseaux battent la feuille).
_Détection automatique des cas d'égalité, de victoire ou de défaite.

Expérience Utilisateur :
_Interface textuelle claire avec affichage des choix respectifs de chaque joueur.
_Annonce dynamique des résultats de la manche dans le terminal.

Architecture du projet
Le projet est organisé sous forme de package Java structuré de la manière suivante :

Plaintext
Chifoumi-Vers-Java/
├── src/
│   └── chifoumi/      # Package contenant les classes de l'application
│       ├── Main.java  # Point d'entrée et gestion de la boucle de jeu
│       ├── Jeu.java   # Moteur de règles et gestion de la partie
│       └── Joueur.java# Modélisation et comportement des participants
└── Chifoumi.iml       # Fichier de configuration de l'environnement (IntelliJ IDEA)
Projet académique réalisé pour illustrer la conception orientée objet en Java.
