# Maplr-Hockey

## Installation de la base de données

Après le build de l'application, la base de données sera installée et pourra être visualisé sou sle lien : http://localhost:8080/h2/login.jsp

Les paramètres de connexion sont : 
- Driver Class=org.h2.Driver
- JDBC URL=jdbc:h2:mem:hockeydata
- User Name=sa
- Password=

## Utilisation des Endpoints

Vous retrouverez 3 endpoints : 
- Un GET pour obtenir l'équipe en fonction de l'année dans la base de données en mémoire (H2). Il peut être testé sur Postman en faisant une requête GET avec l'url (http://localhost:8080/api/team/{year})
- Un POST pour t'ajouter en tant que nouveau joueur de l'équipe d'une année dans la base de données en mémoire (H2). Il peut être testé sur Postman en faisant une requête POST avec l'url (http://localhost:8080/api/team/{year})
- Un PUT pour mettre à jour le capitaine d'une année. Il peut être testé sur Postman en faisant une requête PUT avec l'url (http://localhost:8080/api/player/captain/{id})

