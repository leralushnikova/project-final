---------  users ----------------------
delete
from USER_ROLE;
delete
from CONTACT;
delete
from PROFILE;

delete
from ACTIVITY;
create sequence ACTIVITY_ID_SEQ;
alter
    sequence ACTIVITY_ID_SEQ restart with 1;

delete
from TASK;
create sequence TASK_ID_SEQ;
alter
    sequence TASK_ID_SEQ restart with 1;

delete
from SPRINT;
create sequence SPRINT_ID_SEQ;
alter
    sequence SPRINT_ID_SEQ restart with 1;

delete
from PROJECT;
create sequence PROJECT_ID_SEQ;
alter
    sequence PROJECT_ID_SEQ restart with 1;

delete
from USERS;
create sequence USERS_ID_SEQ;
alter
    sequence USERS_ID_SEQ restart with 1;

insert into USERS (EMAIL, PASSWORD, FIRST_NAME, LAST_NAME, DISPLAY_NAME)
values ('user@gmail.com', '{noop}password', 'userFirstName', 'userLastName', 'userDisplayName'),
       ('admin@gmail.com', '{noop}admin', 'adminFirstName', 'adminLastName', 'adminDisplayName'),
       ('guest@gmail.com', '{noop}guest', 'guestFirstName', 'guestLastName', 'guestDisplayName'),
       ('manager@gmail.com', '{noop}manager', 'managerFirstName', 'managerLastName', 'managerDisplayName');
