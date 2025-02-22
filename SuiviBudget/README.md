# Cahier des Charges - Application de Suivi de Dépenses et Budget

## 1. Introduction
L'application de suivi des dépenses permet aux utilisateurs d'enregistrer, de suivre et d'analyser leurs transactions financières afin de mieux gérer leur budget.

## 2. Objectifs
- Permettre aux utilisateurs d'ajouter, modifier et supprimer des transactions.
- Catégoriser les dépenses et revenus.
- Générer des statistiques sur les transactions.
- Offrir une API REST pour interagir avec l'application.

## 3. Fonctionnalités

### 3.1. Gestion des Catégories
- Ajouter une nouvelle catégorie de transaction.
- Modifier une catégorie existante.
- Supprimer une catégorie.
- Lister toutes les catégories.

### 3.2. Gestion des Transactions
- Ajouter une transaction (montant, catégorie, type, date, description).
- Modifier une transaction existante.
- Supprimer une transaction.
- Lister toutes les transactions.
- Filtrer les transactions par période, catégorie ou type (revenu/dépense).

### 3.3. Génération de Statistiques
- Calcul du solde total (revenus - dépenses).
- Total des dépenses et revenus par mois.
- Dépenses par catégorie.

## 4. Modèle de Données

### 4.1. Catégorie
```yaml
- id (Long, auto-incrémenté)
- nom (String, unique, non nul)
- description (String, optionnel)
```

### 4.2. Transaction
```yaml
- id (Long, auto-incrémenté)
- montant (Double, non nul)
- type (Enum : REVENUE, DEPENSE, non nul)
- date (LocalDate, non nul)
- description (String, optionnel)
- categorie_id (FK vers Catégorie, non nul)
```

## 5. Endpoints API REST

### 5.1. Catégories
| Méthode | Endpoint          | Description                        |
|---------|------------------|------------------------------------|
| GET     | /api/categories  | Récupérer toutes les catégories   |
| POST    | /api/categories  | Ajouter une nouvelle catégorie    |
| PUT     | /api/categories/{id} | Modifier une catégorie       |
| DELETE  | /api/categories/{id} | Supprimer une catégorie      |

### 5.2. Transactions
| Méthode | Endpoint          | Description                          |
|---------|------------------|--------------------------------------|
| GET     | /api/transactions | Récupérer toutes les transactions   |
| POST    | /api/transactions | Ajouter une nouvelle transaction    |
| PUT     | /api/transactions/{id} | Modifier une transaction     |
| DELETE  | /api/transactions/{id} | Supprimer une transaction    |
| GET     | /api/transactions/filter?type={type}&categorie={id}&dateStart={date}&dateEnd={date} | Filtrer les transactions |

### 5.3. Statistiques
| Méthode | Endpoint          | Description                           |
|---------|------------------|--------------------------------------|
| GET     | /api/statistics/total | Récupérer le solde total          |
| GET     | /api/statistics/monthly | Dépenses et revenus par mois  |
| GET     | /api/statistics/category | Dépenses par catégorie        |



## 7. Scénarios d’Utilisation
### 7.1. Ajouter une transaction
1. L'utilisateur envoie une requête **POST** à `/api/transactions` avec les détails de la transaction.
2. L’API enregistre la transaction dans la base de données et retourne une confirmation.

### 7.2. Consulter le solde total
1. L'utilisateur envoie une requête **GET** à `/api/statistics/total`.
2. L'API retourne le montant total des revenus moins les dépenses.

### 7.3. Filtrer les transactions
1. L'utilisateur envoie une requête **GET** à `/api/transactions/filter?type=DEPENSE&dateStart=2024-01-01&dateEnd=2024-02-01`.
2. L'API retourne la liste des transactions correspondant aux filtres.

## 8. Évolutions Possibles
- Ajout d’un **système de budget prévisionnel**.
- Ajout d’un **système de notifications** en cas de dépassement de budget.
- Implémentation d’un **frontend** pour interagir avec l’API (React, Angular, Vue.js).

---

### 📌 Ce cahier des charges définit les bases de l’application et servira de référence pour le développement.

Le projet peut être enrichi avec de nouvelles fonctionnalités selon les besoins ! 🚀
