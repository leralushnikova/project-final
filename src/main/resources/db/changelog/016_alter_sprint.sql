--changeset gkislin:change_backtracking_tables

alter table SPRINT rename COLUMN TITLE to CODE;
alter table SPRINT
alter column CODE type varchar (32);
alter table SPRINT
    alter column CODE set not null;
create unique index UK_SPRINT_PROJECT_CODE on SPRINT (PROJECT_ID, CODE);