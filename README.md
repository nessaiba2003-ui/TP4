TP - Stratégies d'Héritage JPA/Hibernate

 Description
Ce TP nous explore les différentes stratégies de mapping d'héritage disponibles dans JPA/Hibernate et de nous apprendrons à implémenter et comparer les trois approches principales pour persister des hiérarchies de classes dans une base de données relationnelle.

 Objectifs Pédagogiques
- Créer un projet Maven avec Hibernate et H2
- Implémenter les trois stratégies d'héritage JPA/Hibernate
- Comprendre les avantages et inconvénients de chaque stratégie
- Tester les opérations CRUD et les requêtes polymorphiques sur les hiérarchies de classes

 Prérequis
- Connaissances de base en Java et POO
- Compréhension des concepts d'héritage
- Notions de bases de données relationnelles
- Maven installé
- JDK 8 ou supérieur

 Technologies Utilisées
- **Java** - Langage de programmation
- **Maven** - Gestion de dépendances
- **Hibernate/JPA** - ORM pour la persistance
- **H2 Database** - Base de données en mémoire

 Stratégie SINGLE_TABLE
- Avantages :
 Performances optimales (pas de JOIN)
 Requêtes polymorphiques simples
 Schema de base de données simple
Inconvénients :
 Colonnes NULL pour les attributs spécifiques
 Contraintes d'intégrité difficiles à appliquer
 Peut devenir problématique pour les grandes hiérarchies

Stratégie JOINED
Avantages :
 Meilleure normalisation de la base de données
 Pas de colonnes NULL
 Contraintes d'intégrité facilitées
 Schema proche du modèle objet
Inconvénients :
 Requêtes avec JOIN (moins performantes)
 Requêtes polymorphiques complexes
 Plus de tables à gérer

 Stratégie TABLE_PER_CLASS
 Avantages :
 Indépendance totale des tables
 Pas de colonnes NULL
 Performances correctes pour les requêtes sur une classe spécifique
Inconvénients :
 Requêtes polymorphiques très complexes (UNION)
 Duplication des attributs de la classe mère
 Les IDs doivent être uniques across toutes les tables

 Utilisez SINGLE_TABLE quand :
 La hiérarchie est simple et peu profonde
 Les classes ont peu d'attributs spécifiques
 Vous faites beaucoup de requêtes polymorphiques
Utilisez JOINED quand :
 Vous avez des contraintes d'intégrité fortes
 La hiérarchie est complexe
 Les attributs spécifiques sont nombreux
Utilisez TABLE_PER_CLASS quand :
 Chaque classe doit être indépendante
 Vous faites peu de requêtes polymorphiques
 Vous voulez éviter les JOIN
 Chaque sous-classe a beaucoup d'attributs
<img width="1598" height="859" alt="Capture d’écran 2026-02-24 065804" src="https://github.com/user-attachments/assets/53d2c649-eb87-452b-9d77-2e760c403d45" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 065955" src="https://github.com/user-attachments/assets/c6ded76c-4705-4148-9bc9-491bdfcaa1db" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070023" src="https://github.com/user-attachments/assets/0ee35090-5f79-4c03-a611-b1c94c028f03" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 065955" src="https://github.com/user-attachments/assets/10ba17a8-d77a-4637-9aeb-2f30a3988dc7" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070047" src="https://github.com/user-attachments/assets/d775c32a-82f0-408a-be4e-862848cf781a" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070047" src="https://github.com/user-attachments/assets/5b24401f-8ce8-4ccb-b09a-b4d55dcbc48e" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070148" src="https://github.com/user-attachments/assets/f775869e-6442-4ebb-a9b2-6a54fdf4c616" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070148" src="https://github.com/user-attachments/assets/88a2e3af-7f8c-403e-8aba-c48839bf4d4c" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070230" src="https://github.com/user-attachments/assets/f5f3e01d-738a-4d91-b6da-e637311e7401" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070257" src="https://github.com/user-attachments/assets/a8816fb6-11d1-4416-b648-473e2ccf8264" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070320" src="https://github.com/user-attachments/assets/ad7c7cfd-d059-452e-b29e-25529dc05e2b" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070320" src="https://github.com/user-attachments/assets/9d74f950-c9ec-4ae4-866d-c6efe211f00e" />


 <img width="1600" height="860" alt="Capture d’écran 2026-02-24 070320" src="https://github.com/user-attachments/assets/6b9328ab-acea-4e33-812d-2a1a99f4266d" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070320" src="https://github.com/user-attachments/assets/c1c0e10d-d588-4dbf-8e24-a61b79a36b81" />


<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070446" src="https://github.com/user-attachments/assets/7dc58083-99d9-451d-bbea-7f6238c2c69e" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070507" src="https://github.com/user-attachments/assets/a7851f1b-18eb-4f98-aeac-885ca6330d05" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070529" src="https://github.com/user-attachments/assets/2c9ea58d-147e-4923-97c3-f8fd7a0f5031" />

<img width="1600" height="860" alt="Capture d’écran 2026-02-24 070549" src="https://github.com/user-attachments/assets/30e0e9af-2674-46bd-8560-1651a63faab2" />
<img width="936" height="315" alt="Capture d’écran 2026-02-25 145901" src="https://github.com/user-attachments/assets/d3b68182-fcfd-4e30-8d5f-b50c963bb8b5" />

 👨🎓 realisee par
NESSAIBA MESSAADIYENE
