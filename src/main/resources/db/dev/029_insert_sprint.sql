insert into SPRINT (status_code, startpoint, endpoint, code, project_id)
values ('active', null, null, 'Sprint-2', 1),
       ('finished', '2023-04-09 08:05:10', '2023-04-29 16:48:34', 'Sprint-1', 2),
       ('finished', '2023-04-03 12:14:11', '2023-04-18 17:03:41', 'Sprint-2', 2),
       ('active', '2023-04-05 14:25:43', '2023-06-10 13:00:00', 'Sprint-3', 2),
       ('active', null, null, 'Sprint-1', 4);
alter
    sequence SPRINT_ID_SEQ restart with 1000;