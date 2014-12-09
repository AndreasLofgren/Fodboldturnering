set foreign_key_checks = 0;
use fodboldturnering;

alter table sæson
add primary key (periode);

-- Primary og foreign key sæson

alter table division
add primary key (divisionsnummer),
add column periode varchar(20),
add foreign key (periode) references sæson (periode);

-- Primary og foreign key division

alter table klub
add primary key (klubNavn),
add column divisionsnummer int,
add foreign key (divisionsnummer) references division (divisionsnummer);

-- Primary og foreign key klub

alter table spiller
add primary key (cpr),
add column klubNavn varchar(25),
add foreign key (klubNavn) references klub (klubNavn);		

-- Primary og foreign key spiller

alter table dommer
add primary key (navn); 

-- Primary og foreign key dommer

alter table kamprapport
add primary key (udehold, hjemmehold),
add column divisionsnummer int,
add column periode varchar(20),
add column navn varchar(25),
add foreign key (divisionsnummer) references division (divisionsnummer),
add foreign key (periode) references sæson (periode),
add foreign key (navn) references dommer (navn);

-- Primary og foreign key kamprapport
