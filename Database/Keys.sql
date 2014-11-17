set foreign_key_checks = 0;

alter table spiller
add primary key (cpr),
add foreign key (klubNavn) references klub;		

-- Primary og foreign key spiller

alter table klub
add primary key (klubNavn),
add foreign key (divisionsnummer) references division;

-- Primary og foreign key klub

alter table division
add primary key (divisionsnummer),
add foreign key (periode) references sæson;

-- Primary og foreign key division

alter table sæson
add primary key (periode);

-- Primary og foreign key sæson

alter table tuneringsrunde
add primary key (rundenummer);

-- Primary og foreign key turneringsrunde

alter table dommer
add primary key (navn); 

-- Primary og foreign key dommer

alter table kamprapport
add primary key (udehold, hjemmehold),
add foreign key (divisionsnummer) references division,
add foreign key (periode) references sæson,
add foreign key (navn) references dommer;

-- Primary og foreign key kamprapport
