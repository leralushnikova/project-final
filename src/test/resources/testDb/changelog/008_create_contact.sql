create table CONTACT
(
    ID    bigint       not null,
    CODE  varchar(32)  not null,
    VAL varchar(256) not null,
    primary key (ID, CODE),
    constraint FK_CONTACT_PROFILE foreign key (ID) references PROFILE (ID) on delete cascade
);