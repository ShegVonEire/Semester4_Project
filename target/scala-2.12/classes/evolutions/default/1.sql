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

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  category                      varchar(255),
  constraint pk_category primary key (id)
);

create table genre (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  genre                         varchar(255),
  constraint pk_genre primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  category_id                   bigint,
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null,
  constraint pk_product primary key (id)
);

alter table books add constraint fk_books_genre_id foreign key (genre_id) references genre (id) on delete restrict on update restrict;
create index ix_books_genre_id on books (genre_id);

alter table product add constraint fk_product_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_product_category_id on product (category_id);


# --- !Downs

alter table books drop constraint if exists fk_books_genre_id;
drop index if exists ix_books_genre_id;

alter table product drop constraint if exists fk_product_category_id;
drop index if exists ix_product_category_id;

drop table if exists books;

drop table if exists category;

drop table if exists genre;

drop table if exists product;

