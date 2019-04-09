# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table books (
  id                            bigint auto_increment not null,
  title                         varchar(255),
  isbn13                        integer not null,
  publisher                     varchar(255),
  description                   varchar(1024),
  stock                         integer not null,
  price                         double not null,
  pages                         integer not null,
  genre_id                      bigint,
  constraint pk_books primary key (id)
);

create table feedback (
  id                            bigint auto_increment not null,
  email                         varchar(255),
  name                          varchar(255),
  country                       varchar(255),
  message                       varchar(1024),
  constraint pk_feedback primary key (id)
);

create table genre (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  genre                         varchar(255),
  constraint pk_genre primary key (id)
);

alter table books add constraint fk_books_genre_id foreign key (genre_id) references genre (id) on delete restrict on update restrict;
create index ix_books_genre_id on books (genre_id);


# --- !Downs

alter table books drop constraint if exists fk_books_genre_id;
drop index if exists ix_books_genre_id;

drop table if exists books;

drop table if exists feedback;

drop table if exists genre;

