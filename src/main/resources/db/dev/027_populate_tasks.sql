-- populate tasks
delete
from TASK;
alter
    sequence TASK_ID_SEQ restart with 1;
delete
from SPRINT;
alter
    sequence SPRINT_ID_SEQ restart with 1;
delete
from PROJECT;
alter
    sequence PROJECT_ID_SEQ restart with 1;
delete
from ACTIVITY;
alter
    sequence ACTIVITY_ID_SEQ restart with 1;