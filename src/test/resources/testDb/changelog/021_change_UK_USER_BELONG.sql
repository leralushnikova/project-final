--changeset ishlyakhtenkov:change_UK_USER_BELONG

/*drop index UK_USER_BELONG;
create unique index UK_USER_BELONG on USER_BELONG (OBJECT_ID, OBJECT_TYPE, USER_ID, USER_TYPE_CODE) where ENDPOINT is null;*/