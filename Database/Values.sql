use fodboldturnering;

delete from Spiller;
insert into Spiller
values 
('0000000001', 'Peter', 'Møller', 0, 0, 0, 0 ,0 ,0, 0, 0, 'Aab');


delete from Klub;
insert into klub
values 
('Aab', null, 0, 0, 0, 0, 0, 0, 0, 'Træner1',1),
('FC Midtjylland', null, 0, 0, 0, 0, 0, 0, 0, 'Træner2',1),
('OB', null, 0, 0, 0, 0, 0, 0, 0, 'Træner3',1),
('FC Nordsjælland', null, 0, 0, 0, 0, 0, 0, 0, 'Træner4',1),
('FC Vestsjælland', null, 0, 0, 0, 0, 0, 0, 0, 'Træner5',1),
('FC København', null, 0, 0, 0, 0, 0, 0, 0, 'Træner6',1),
('Hobro', null, 0, 0, 0, 0, 0, 0, 0, 'Træner7',1),
('Brøndby IF', null, 0, 0, 0, 0, 0, 0, 0, 'Træner8',1),
('Esbjerg FB', null, 0, 0, 0, 0, 0, 0, 0, 'Træner9',1),
('Randers FC', null, 0, 0, 0, 0, 0, 0, 0, 'Træner10',1),
('Silkeborg', null,  0, 0, 0, 0, 0, 0, 0, 'Træner11',1),
('Sønderjyske', null, 0, 0, 0, 0, 0, 0, 0, 'Træner12',1),
('AB', null, 0, 0, 0, 0, 0, 0, 0, 'Træner13',1),
('AC Horsens', null, 0, 0, 0, 0, 0, 0, 0, 'Træner14',1),
('AGF', null, 0, 0, 0, 0, 0, 0, 0, 'Træner15',1),
('Brønshøj', null, 0, 0, 0, 0, 0, 0, 0, 'Træner16',1),
('FC Roskilde', null, 0, 0, 0, 0, 0, 0, 0, 'Træner17',2),
('Fredericia', null, 0, 0, 0, 0, 0, 0, 0, 'Træner18',2),
('HB Køge', null, 0, 0, 0, 0, 0, 0, 0, 'Træner19',2),
('Lyngby', null, 0, 0, 0, 0, 0, 0, 0, 'Træner20',2),
('Skive', null, 0, 0, 0, 0, 0, 0, 0, 'Træner21',2),
('Vejle Boldklub', null, 0, 0, 0, 0, 0, 0, 0, 'Træner22',2),
('Vendsyssel FF', null, 0, 0, 0, 0, 0, 0, 0, 'Træner23',2),
('Viborg', null, 0, 0, 0, 0, 0, 0, 0, 'Træner24',2),
('Brabrand', null, 0, 0, 0, 0, 0, 0, 0, 'Træner25',2),
('FC Sydvest', null, 0, 0, 0, 0, 0, 0, 0, 'Træner26',2),
('Jammerbugt FC', null, 0, 0, 0, 0, 0, 0, 0, 'Træner27',2),
('Kjellerup', null, 0, 0, 0, 0, 0, 0, 0, 'Træner28',2),
('Kolding B', null, 0, 0, 0, 0, 0, 0, 0, 'Træner29',2),
('Kolding IF', null, 0, 0, 0, 0, 0, 0, 0, 'Træner30',2),
('Marienlyst', null, 0, 0, 0, 0, 0, 0, 0, 'Træner31',2),
('Middelfart', null, 0, 0, 0, 0, 0, 0, 0, 'Træner32',2),
('Næsby', null, 0, 0, 0, 0, 0, 0, 0, 'Træner33',3),
('Næstved', null, 0, 0, 0, 0, 0, 0, 0, 'Træner34',3),
('Obber IGF', null, 0, 0, 0, 0, 0, 0, 0, 'Træner35',3),
('Ringkøbing', null, 0, 0, 0, 0, 0, 0, 0, 'Træner36',3),
('Skovbakken', null, 0, 0, 0, 0, 0, 0, 0, 'Træner37',3),
('Svendborg', null, 0, 0, 0, 0, 0, 0, 0, 'Træner38',3),
('Thisted', null, 0, 0, 0, 0, 0, 0, 0, 'Træner39',3),
('Varde', null, 0, 0, 0, 0, 0, 0, 0, 'Træner40',3),
('Avedøre', null, 0, 0, 0, 0, 0, 0, 0, 'Træner41',3),
('Frem', null, 0, 0, 0, 0, 0, 0, 0, 'Træner42',3),
('Fremad Amager', null, 0, 0, 0, 0, 0, 0, 0, 'Træner43',3),
('Holbæk', null, 0, 0, 0, 0, 0, 0, 0, 'Træner44',3),
('Hvidovre', null, 0, 0, 0, 0, 0, 0, 0, 'Træner45',3),
('Nykøbing FC', null, 0, 0, 0, 0, 0, 0, 0, 'Træner46',3),
('Rishøj', null, 0, 0, 0, 0, 0, 0, 0, 'Træner47',3),
('Svebølle', null, 0, 0, 0, 0, 0, 0, 0, 'Træner48',3)
;

select * from Spiller;