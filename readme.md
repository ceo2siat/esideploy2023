

Pour changer le pass du serveur ubuntu
redemarrer votre machine une fois votre projet Ajouter, F12
Ensuite ubuntu avanced
Apres choisie l'option 2

Et ensuite Option Root
valide et mettre
mount -o remount,rw /
passwd esic

nouveau mdp : azerty123 (Desactiver le clavier numérique)

Et fini par Reboot
""""""""""""""""""""""""""""""""""
login : esic
mdp : azerty123


Pour tranferer les fichiers sur notre serveur ubuntu

On installe le ssh
sudo apt install ssh

Apres installer Filezilla sur windows pour le transfert des fichier par SFTP
Apres configuer l'adresse reseau de notre serveur distant dans les cosnfiguration
Dans congig --- réseau ---- adapter ----- Action par pont ---- apres choisie le reseau

Et dans la cli faite un reboot


Apres avoir connecter sur le serveur distant avec SFTP Fillezilla

IL va faloir faire un faire un BUILD MAVEN pour recuperer le fichire .jar

Tapez ip address show pour voir l'adresse ip ou  host




