create table BodyParts
(
id serial primary key,
name varchar(100) not null,
urlgif varchar (300)
);
insert into BodyParts ( name, urlgif)
values ( 'knee','src/main/resources/Gif/knee1.gif' );
insert into BodyParts ( name, urlgif)
values ( 'knee','src/main/resources/Gif/knee2.gif' );
insert into BodyParts ( name, urlgif)
values ( 'knee','src/main/resources/Gif/knee3.gif' );
insert into BodyParts ( name, urlgif)
values ( 'knee','src/main/resources/Gif/knee4.gif' );
insert into BodyParts ( name, urlgif)
values ( 'knee','src/main/resources/Gif/knee5.gif' );
insert into BodyParts ( name, urlgif)
values ( 'knee','src/main/resources/Gif/knee6.gif' );
insert into BodyParts ( name, urlgif)
values ( 'shoulder','src/main/resources/Gif/shoulder1.gif' );
insert into BodyParts ( name, urlgif)
values ( 'shoulder','src/main/resources/Gif/shoulder2.gif' );
insert into BodyParts ( name, urlgif)
values ( 'shoulder','src/main/resources/Gif/shoulder3.gif' );
insert into BodyParts ( name, urlgif)
values ( 'back','src/main/resources/Gif/back1.gif' );
insert into BodyParts ( name, urlgif)
values ( 'back','src/main/resources/Gif/back2.gif' );
insert into BodyParts ( name, urlgif)
values ( 'back', 'src/main/resources/Gif/back3.gif');
insert into BodyParts ( name, urlgif)
values ( 'back', 'src/main/resources/Gif/back4.gif');
insert into BodyParts ( name, urlgif)
values ( 'neck', 'src/main/resources/Gif/neck1.gif');
insert into BodyParts ( name, urlgif)
values ( 'neck', 'src/main/resources/Gif/neck2.gif');
insert into BodyParts ( name, urlgif)
values ( 'neck', 'src/main/resources/Gif/neck3.gif');

CREATE table image(
id serial primary key,
name varchar(100),
imageUrl varchar(500)
);
insert into image(name,imageUrl)values('back','src/main/resources/ImageResourse/back.png');
insert into image(name,imageUrl) values('knee','src/main/resources/ImageResourse/knee.png');
insert into image(name,imageUrl) values('neck','src/main/resources/ImageResourse/neck.png');
insert into image(name,imageUrl) values('shoulder','src/main/resources/ImageResourse/shoulder.png');