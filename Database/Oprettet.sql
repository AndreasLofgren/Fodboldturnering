drop database if exists fodboldturnering;
create database fodboldturnering;
use fodboldturnering;

drop table if exists spiller;
create table spiller
(
navn			varchar(20),
alder			int,
antalMål		int,
antalKampe		int,
maksMål			int,
samletPoint		int,
advarsler		int,
udvisninger		int,
bedømmelse		int
) 
Engine = InnoDB;

drop table if exists klub;
create table klub
(
klubNavn		varchar(25),
adresse			varchar(35),
sejre			int,
pointSum		int,
sæsonPlacering	int,
antalMål		int,
trænerNavn		varchar(25)
)
Engine = InnoDB;

drop table if exists division;
create table division
(
divisionsnummer	int
)
Engine = InnoDB;

drop table if exists sæson;
create table sæson
(
periode			varchar(20)
)
Engine = InnoDB;

drop table if exists kamprapport;
create table kamprapport
(
spilledag		varchar(20),
tidspunkt		varchar(20),
hjemmehold		varchar(20),
udehold			varchar(20),
sted			varchar(20),
scoredeMål		int,
antalTilskuere	int
)
Engine = InnoDB;

drop table if exists dommer;
create table dommer
(
navn			varchar(25),
bedømmelse		int
)
Engine = InnoDB; 

drop table if exists tuneringsrunde;
create table turneringsrunde
(
rundenummer		int
)
Engine = InnoDB;






