---task 1------
INSERT INTO ACTIVITY(AUTHOR_ID, TASK_ID, UPDATED, COMMENT, TITLE, DESCRIPTION, ESTIMATE, TYPE_CODE, STATUS_CODE,
                     PRIORITY_CODE)
values (6, 1, '2023-05-15 09:05:10', null, 'Data', null, 3, 'epic', 'in_progress', 'low'),
       (5, 1, '2023-05-15 12:25:10', null, 'Data', null, null, null, null, 'normal'),
       (6, 1, '2023-05-15 14:05:10', null, 'Data', null, 4, null, null, null), ---task 118----
       (11, 118, '2023-05-16 10:05:10', null, 'UI tab of tasks', null, 4, 'task', 'in_progress', 'normal'),
       (5, 118, '2023-05-16 11:10:10', null, 'UI tab of tasks', null, null, null, null, 'high'),
       (11, 118, '2023-05-16 12:30:10', null, 'UI tab of tasks', null, 2, null, null, null);