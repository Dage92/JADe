# JADe
Projet IN404 - 2018

Auteurs: GOODMAN David (21401471) & JACQUET Julien (21400579)

Ce projet a eu pour but de développer un jeu d'exploration de donjon ([Rogue-like](https://fr.wikipedia.org/wiki/Rogue-like)).

### Note:
L'élève Anis Bouziane qui était le troisième membre de notre groupe a cessé toute communication depuis le vendredi 4 mai
(même lorsqu'on lui téléphone ou envoie des messages) sans avoir rendu la moindre partie de son projet. Nous considérons donc qu'il 
ne fait plus partie de notre groupe et souhaiterions qu'il ne soit pas noté avec nous. Suite à sa disparition mystérieuse nous 
avons du fournir des efforts considérables pour combler le manque d'un tier de notre projet dans les délais.

## Manuel Technique
Vous pouvez trouver ci-joint l'UML de l'idée de notre projet. "UMLprojet.png"
L'idée principale de notre projet était de diviser notre projet en grands axes et pour chacun de ces axes de faire un package, 
ensuite il suffisait de ce repartir les packages à créer équitablement.

* Package world : Contient toutes les classes nécéssaires à la gémwnération du monde.
Notre monde est composé de cases (Panes) qui peuvent etre soit du sol, soit un mur, soit une bordure.
Dans la classe WorldGenerator se trouve la partie concernant la génération aléatoire. Grace a notre génération de niveau on obtient 
un labyrinthe.
World regroupe les éléments du monde.
LootMap sert a disposer de maniere aléatoire des elements de Loot dans le Monde.

* Ecriture/Lecture: sont les classes qui gèrent la sauvegarde et le chargement d'une partie.
Pour sauvegarder on va directement ecrire l'instance de l'objet World dans un fichier, pour charger on ira lire dans ce même 
fichier metant à jour notre monde avec l'objet sauvegardé.

* Package creature: Contient toutes les classes en rapport avec les créatures, on considère que les NPC et le Joueur sont
des créatures.
Dans le sous package player on a ce qui concerne uniquement le joueur, et dans le sous package npc on a ce qui coucerne les NPC.
Chaque type de NPC est représenté par une classe différente.

* Package interface: Contient toutes les classes nécéssaires pour la visualisation graphique du monde.
Window est tout d'abord l'interface principale pour gerer l'interface graphique et est implémenté par toute les autres classes dans 
le package interfaces.
Start est la classe qui permet d'afficher l'état initiale graphique de notre RogueLike. Elle demande à l'utilisateur d'appuyer sur
"Entrer" pour démarer le jeu.
Play est la classe principale de notre jeu. Elle régit la plupart des comportement graphique qui se déroule lors de l'état de jeu.
CharacterCreationUI affiche les implementation de la creation de l'avatar du joueur dans l'interface graphique.
Communication régit et affiche les communication entre les NPC et le joueur.
Help permet d'accéder à un affichage qui indique à la fois les objectifs de jeu mais aussi les commandes et "keybinds".
Interaction affiche les interactions entre le joueur et le monde.
Enfin, Win et Lose représente les deux états de fin possible. L'un (Win) affiche lorsque le joueur gagne alors que l'autre (Lose) 
affiche lorsqu'il perd. Tout deux demande au joueur s'il veut démarer une nouvelle partie.

* Package inventaires: Contient toutes les classes nécéssaires pour la gestion de l'inventaire et la création d'objets utilisables
par le joueur.
Inventaire s'occupe d'ajouter, de retirer, et de déplacer les objets appartenant au joueur.
Loot defini les objets et leurs caractéristiques.
LootCreation permet de générer de nouveaux objets.

## Parties Manquantes
Pour la plupart des parties manquantes le code est présent mais l'implémentation fonctionnelle ne l'ai pas.
* Un membre.
* Deplacement du Joueur.
* Apparition des monstres.
* Apparition des objets.

## Références
* Article Wikipedia [Rogue-like](https://fr.wikipedia.org/wiki/Rogue-like)
* Le tutoriel [roguelike tutorial](http://trystans.blogspot.fr/2016/01/roguelike-tutorial-00-table-of-contents.html)
* La bibliothèque [AsciiPanel](https://github.com/trystan/AsciiPanel) pour gérer la couleur dans un terminal 

## Modèle pour le projet
Ce modèle nécessite l'installation préalable du [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

## Compiler le projet
Le projet se compile en utilisant [gradle](https://gradle.org/).

Aucune installation préalable n'est nécessaire.

       $ ./gradlew build


## Éxécuter l'application
* Décompresser l'une des archives zip ou tar se trouvant dans le répertoire "build/distributions".

       $ ./extract

* Lancer l'application.

       $ ./execute


## Nettoyer le répertoire

       $ ./clean
