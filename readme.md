

Pour changer le pass du serveur ubuntu
redemarrer votre machine une fois votre projet Ajouter, F12
Ensuite ubuntu avanced
Apres choisie l'option 2

Et ensuite Option Root
valide et mettre
mount -o remount,rw /
passwd esic

nouveau mdp : azerty123 par exemple (Desactiver le clavier numérique)

Et fini par Reboot
""""""""""""""""""""""""""""""""""
login : esic
mdp : azerty123


Pour tranferer les fichiers sur notre serveur ubuntu distant, qui nous servira de serveur de test

On installe le ssh
sudo apt install ssh

Apres installer Filezilla sur windows pour le transfert des fichier par SFTP
Apres configuer l'adresse reseau de notre serveur distant dans les cosnfiguration
Dans config --- réseau ---- adapter ----- Action par pont ---- apres choisie le reseau

Et dans la cli faite un reboot

""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
Apres avoir connecter sur le serveur distant avec SFTP Fillezilla

IL va faloir faire un faire un BUILD MAVEN pour recuperer le fichire .jar dans le dossier target

Tapez ip address show pour voir l'adresse ip ou  host à renseigner le dans filezilla sftp

Test le .jar sur le power shell windows pour voir si le .jar s'execute correctement

Maintenant il faudra installer les différentes outils pour que notre application tourne sur le serveur ubuntu distant.
Installer sans préciser les versions
Mode SU
apache2
mysql server
module php pour apache2
phpmyadmin
Java

apt install apache2
sudo apt-get install php libapache2-mod-php php-mysql
sudo apt-get install mysql-server
sudo apt-get install phpmyadmin


Creer un utilisateur MYSQL pour acceder à votre phpmyadmin AVEC GRANT ALL PRIVILEGE ON *.* TO USER CREER à la fin avec les meme user et mot de passe dans le projet
Il faut maintenant pouvoir executé le projet java Esi2DeployProj
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
DEPLOIEMENT MANUEL DU PROJET Esi2DeployProj
Installer le openJDK sur le serveur ubuntu distant

sudo apt-get install openjdk-8-jdk

Envoyer le jar depuis filezilla sur le server distant et lancer le jar en ligne de commande sur Ubuntu
N'oubliez pas de créer la base de donnée

java -jar le_chemin_du_fichier
