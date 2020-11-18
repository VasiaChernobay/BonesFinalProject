CREATE TABLE body(
id serial primary key,
name varchar(100),
gifUrl varchar(500)
);
insert into body(name,gifUrl) values ('knee1','src/main/resources/Gif/knee1.gif');
insert into body(name,gifUrl) values ('knee2','src/main/resources/Gif/knee2.gif');
insert into body(name,gifUrl) values ('knee3','src/main/resources/Gif/knee3.gif');
insert into body(name,gifUrl) values ('neek1','src/main/resources/Gif/neek1.gif');
insert into body(name,gifUrl) values ('neek2','src/main/resources/Gif/neek2.gif');
insert into body(name,gifUrl) values ('neek3','src/main/resources/Gif/neek3.gif');
insert into body(name,gifUrl) values ('shoulder1''src/main/resources/Gif/shoulder1.gif');
insert into body(name,gifUrl) values ('shoulder2''src/main/resources/Gif/shoulder2.gif');

CREATE table image(
id serial primary key,
name varchar(100),
imageUrl varchar(500)
);
insert into image(name,imageUrl)values('neck','src/main/resources/ImageResourse/neck.png');
insert into image(name,imageUrl) values('back','src/main/resources/ImageResourse/back.png');
insert into image(name,imageUrl) values('shoulder','src/main/resources/ImageResourse/shoulder.png');
insert into image(name,imageUrl) values('knee','src/main/resources/ImageResourse/knee.png');