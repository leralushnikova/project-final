--changeset gkislin:users_add_on_delete_cascade

/*alter table ACTIVITY
drop constraint FK_ACTIVITY_USERS,
    add constraint FK_ACTIVITY_USERS foreign key (AUTHOR_ID) references USERS (ID) on delete cascade;*/

/*alter table USER_BELONG
drop constraint FK_USER_BELONG,
    add constraint FK_USER_BELONG foreign key (USER_ID) references USERS (ID) on delete cascade;*/

/*alter table ATTACHMENT
drop constraint FK_ATTACHMENT,
    add constraint FK_ATTACHMENT foreign key (USER_ID) references USERS (ID) on delete cascade;*/