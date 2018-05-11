# JADe
Projet IN404 - 2018

Auteurs: GOODMAN David (21401471) & JACQUET Julien (21400579)

Ce projet a eu pour but de développer un jeu d'exploration de donjon ([Rogue-like](https://fr.wikipedia.org/wiki/Rogue-like)).

##Note :
L'élève Anis Bouziane qui était le troisième membre de notre groupe a cessé toute communication depuis le vendredi 4 mai
(m�me lorsqu'on lui téléphone ou envoie des messages) sans avoir rendu la moindre partie de son projet. Nous considérons donc qu'il ne fait
plus partie de notre groupe et souhaiterions qu'il ne soit pas noté avec nous. Suite à sa disparition mystérieuse nous avons du fournir des
efforts considérables pour combler le manque d'un tier de notre projet dans les délais.

##Manuel Technique :
Vous pouvez trouver ci-joint l'UML de l'idée de notre projet. "UMLprojet.png"
L'idée principale de notre projet était de diviser notre projet en grands axes et pour chacun de ces axes de faire un package, ensuite il suffisait
de ce repartir les packages à créer équitablement.

    *Package world : Contient toutes les classes nécéssaires à la génération du monde.
    Notre monde est composé de cases (Panes) qui peuvent etre soit du sol, soit un mur, soit une bordure.
    Dans la classe WorldGenerator se trouve la partie concernant la génération aléatoire. Pour faire bref la génération est
    proche du "jeu de la vie". C'est a dire qu'on selectionne une case et en fonction de ce qui entoure la case on fait
    grossir ou supprime la case.
    World regroupe les éléments du monde.
    LootMap sert a disposer de maniere aléatoire des elements de Loot dans le Monde.

    *Ecriture/Lecture : sont les classes qui gèrent la sauvegarde et le chargement d'une partie.
    Pour sauvegarder on va directement ecrire l'instance de l'objet World dans un fichier, pour charger on ira lire dans ce m�me fichier metant
    à jour notre monde avec l'objet sauvegardé.

    *Package creature: Contient toutes les classes en rapport avec les créatures, on considère que les NPC et le Joueur sont
    des créatures.
    Dans le sous package player on a ce qui concerne uniquement le joueur, et dans le sous package npc on a ce qui coucerne les NPC.
    Chaque type de NPC est représenté par une classe différente.




##Parties Manquantes :
*Un membre.

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