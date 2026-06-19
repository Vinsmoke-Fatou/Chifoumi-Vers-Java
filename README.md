# Chifoumi – Java Console Game

## Overview
This console application is a Java-based implementation of the traditional Rock-Paper-Scissors game (Chifoumi). It allows a user to compete against the computer through an interactive textual interface, structured according to Object-Oriented Programming (OOP) principles.

## Features

- Player Management:
  _Captures human user choices via secure inputs within the console.
  _Automated, pseudo-random generation of actions for the virtual player (the machine).

- Arbitrage and Game Logic:
  _Instant evaluation of confrontation rules (rock beats scissors, paper beats rock, scissors beat paper).
  _Automatic detection of ties, wins, or losses.

- User Experience:
  _Clean textual interface displaying the respective choices of each player.
  _Dynamic announcement of round results directly in the terminal.

## Project Architecture

The project is organized into a Java package structured as follows:

Chifoumi-Vers-Java/
├── src/
│   └── chifoumi/      # Package containing application classes
│       ├── Main.java  # Entry point and game loop management
│       ├── Jeu.java   # Rule engine and match management
│       └── Joueur.java# Modeling and behavior of participants
└── Chifoumi.iml       # Environment configuration file (IntelliJ IDEA)

---
Academic project created to demonstrate object-oriented design in Java.
