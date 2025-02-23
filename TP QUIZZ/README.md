# Cahier des Charges du Projet QUIZZ

## Présentation Générale

Le projet QUIZZ a pour objectif de créer une plateforme interactive où les utilisateurs peuvent participer à des quizz sur différents sujets. Ce projet est destiné à illustrer l'utilisation des concepts et technologies Spring Boot, et à fournir une API REST pour faciliter l'intégration avec d'autres systèmes ou applications front-end.

## Objectifs du Projet

- Créer une plateforme de quizz interactive.
- Permettre aux utilisateurs de participer à différentes parties de quizz.
- Assurer le suivi des scores des joueurs.
- Gérer la création et l'organisation des questions et des réponses pour chaque quizz.
- Fournir une API REST pour permettre l'intégration avec des applications tierces.

## Fonctionnalités à Implémenter

### Gestion des Parties de Quizz

- Création d'une nouvelle partie de quizz.
- Affichage d'une liste de toutes les parties de quizz disponibles.
- Possibilité de rechercher une partie spécifique par son identifiant.
- Mise à jour des informations d'une partie.
- Suppression d'une partie de quizz.

### Gestion des Joueurs

- Ajout d'un joueur à une partie.
- Retrait d'un joueur d'une partie.
- Suivi des scores des joueurs pour chaque partie.

### Gestion des Questions et Réponses

- Création et gestion d'une liste de questions associées à chaque partie de quizz.
- Ajout de réponses possibles pour chaque question.
- Identification de la bonne réponse parmi les choix proposés.

## Contraintes Fonctionnelles

- Le nombre maximum de participants par partie doit être défini et ne doit pas être dépassé.
- Les questions doivent être associées à une ou plusieurs parties de quizz.
- Chaque question doit avoir une ou plusieurs réponses possibles, dont une correcte.
