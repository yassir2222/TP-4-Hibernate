Voici un fichier `README.md` complet pour le projet `TP-4-Hibernate`.

Ce `README` est basé sur la convention de nommage (`TP-4-Hibernate`) qui suggère un projet académique (Travaux Pratiques) utilisant **Java** et la librairie d'Object-Relational Mapping **Hibernate**, probablement configuré avec **Maven** ou **Gradle**.

---

# TP-4-Hibernate

## 🚀 Présentation du Projet

Ce projet est le **Travaux Pratiques n°4 (TP-4)** et sert d'introduction pratique au framework d'Object-Relational Mapping (ORM) **Hibernate**. L'objectif principal est de maîtriser les concepts fondamentaux d'Hibernate pour la persistance des données dans une base de données relationnelle en utilisant Java.

Le TP couvre généralement :
*   La configuration d'Hibernate (`hibernate.cfg.xml`).
*   La définition des classes d'entité (POJOs) et leur mapping.
*   L'exécution des opérations CRUD (Create, Read, Update, Delete) sur la base de données.
*   L'utilisation des sessions Hibernate pour gérer la persistance.

## 🛠 Technologies Utilisées

*   **Langage :** Java
*   **ORM :** Hibernate Core
*   **Build Tool :** Maven (ou Gradle, si le projet utilise une structure Maven standard)
*   **Base de Données :** [À compléter : ex. MySQL, PostgreSQL, H2, etc.]
*   **JDBC Driver :** Le driver correspondant à la base de données choisie.

## 📁 Structure du Projet (Conventionnel Maven)

Le projet suit la structure standard d'un projet Maven/Java :

```
TP-4-Hibernate/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/yassir/tp4/
│   │   │       ├── model/      # Classes d'Entité (POJOs) avec annotations ou mapping XML
│   │   │       │   └── [Ex: Produit.java, Etudiant.java]
│   │   │       ├── dao/        # Couche d'Accès aux Données (DAO)
│   │   │       │   └── [Ex: ProduitDAO.java]
│   │   │       └── Main.java   # Classe principale pour l'exécution et la démonstration
│   │   └── resources/
│   │       └── hibernate.cfg.xml # Fichier de configuration d'Hibernate
├── pom.xml                     # Fichier de configuration Maven
└── README.md                   # Ce fichier
```

## ⚙️ Configuration

Avant de lancer le projet, vous devez configurer la connexion à votre base de données.

### 1. Configuration de la Base de Données

Modifiez le fichier de configuration **`src/main/resources/hibernate.cfg.xml`** pour y inclure les paramètres de votre base de données :

```xml
<property name="hibernate.connection.driver_class">[Ex: com.mysql.cj.jdbc.Driver]</property>
<property name="hibernate.connection.url">[Ex: jdbc:mysql://localhost:3306/tp4_db]</property>
<property name="hibernate.connection.username">[Votre Nom d'Utilisateur]</property>
<property name="hibernate.connection.password">[Votre Mot de Passe]</property>

<!-- Facultatif : Afficher les requêtes SQL dans la console -->
<property name="show_sql">true</property>

<!-- DDL : Crée la structure de la base de données au démarrage (à utiliser avec précaution) -->
<property name="hibernate.hbm2ddl.auto">update</property>
```

### 2. Dépendances (pom.xml)

Assurez-vous que le fichier `pom.xml` contient les dépendances nécessaires pour Hibernate Core et le driver JDBC de votre base de données.

## 🚀 Comment Exécuter le Projet

### Prérequis

*   Java Development Kit (JDK) (version 8 ou supérieure recommandée)
*   Maven (installé et configuré)
*   Un serveur de base de données (ex: MySQL, PostgreSQL) fonctionnel.

### Étapes de Lancement

1.  **Cloner le dépôt** :
    ```bash
    git clone https://github.com/yassir2222/TP-4-Hibernate.git
    cd TP-4-Hibernate
    ```

2.  **Installer les dépendances Maven** :
    Cette commande télécharge toutes les librairies requises (Hibernate, Driver JDBC, etc.).
    ```bash
    mvn clean install
    ```

3.  **Exécuter l'application** :
    Le point d'entrée du programme se trouve dans la classe `Main.java`.
    ```bash
    mvn exec:java -Dexec.mainClass="com.yassir.tp4.Main"
    ```
    *Note: Assurez-vous d'adapter le chemin du package (`com.yassir.tp4.Main`) si celui-ci est différent dans votre projet.*

Le programme devrait alors se connecter à la base de données, exécuter les opérations CRUD définies dans la classe `Main`, et afficher les résultats dans la console.

## 🤝 résultat
### fichier test.java
<img width="1834" height="664" alt="image" src="https://github.com/user-attachments/assets/1c37aca6-6de6-4445-8f13-18918057eb51" />

### fichier MachineServiceTest.java
<img width="1861" height="504" alt="image" src="https://github.com/user-attachments/assets/c2ce539f-1390-4442-a278-236f11cfe443" />

### fichier SalleServiceTest.java
<img width="1842" height="616" alt="image" src="https://github.com/user-attachments/assets/74a9673c-6fe8-4188-bc69-91ef2c23b9c1" />


