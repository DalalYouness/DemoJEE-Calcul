# 🧮 DemoJEE-Calcul

## 📘 Description du projet
**DemoJEE-Calcul** est une application web JEE simple qui permet d’effectuer des calculs de base.  
Elle illustre la structure typique d’une application **Java EE / Jakarta EE** avec une séparation claire entre la **couche métier** et la **couche web**.

---

## 🧩 Structure du projet

### ⚙️ Couche métier
- **Interface** : Définit les méthodes de calcul.  
- **Implémentation** : Contient la logique métier.  
- **Test unitaire (JUnit)** : Vérifie le bon fonctionnement de la couche métier.

### 🌐 Couche Web
- **Contrôleur (Servlet)** : Reçoit les requêtes HTTP, appelle la couche métier et redirige vers la vue.  
- **Modèle** : Transporte les données nécessaires à l’affichage.  
- **Vue (JSP)** : Affiche le formulaire et le résultat du calcul.  
  > Utilisation de **Bootstrap** pour une interface moderne et responsive.

---

## 🚀 Déploiement des Servlets
L’application illustre **deux types de déploiement** :
- ✅ **Via `web.xml`** — configuration classique.  
- ✅ **Via annotation `@WebServlet`** — configuration par code.

---

## 🧰 Technologies utilisées
- Java EE / Jakarta EE  
- JSP  
- Servlets  
- JUnit  
- Bootstrap  
- Tomcat (serveur de déploiement)

---

## ▶️ Exécution du projet
1. **Importer** le projet dans votre IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.).  
2. **Déployer** sur un serveur Tomcat ou compatible JEE.  
3. **Accéder à l’application** via :  
