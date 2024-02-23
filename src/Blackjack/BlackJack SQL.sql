create table PaquetCartes(
	id_paquetCarte int  primary key,
	taille_paquetCartes int not null
);

create table Carte(
	id_carte int primary key,
	couleur_carte varchar(50),
	valeur_carte int 
);

create table Joueur (
	id_joueur int  ,
	username_joueur varchar(50),
	solde_joueur int ,
	id_main int references Main (id_main)
);

create table Croupier (
	id_croupier int primary key,
	valeurTotalLimit int ,
	id_main int references Main (id_main)
);

create table Main(
	id_main int primary key,
	valeurTotal_main int ,
	nbCartes_main int
);

drop table Croupier;