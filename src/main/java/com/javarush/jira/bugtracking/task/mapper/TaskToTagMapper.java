package com.javarush.jira.bugtracking.task.mapper;

import com.javarush.jira.bugtracking.task.Task;
import com.javarush.jira.bugtracking.task.to.TaskToTag;
import com.javarush.jira.common.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskToTagMapper extends BaseMapper<Task, TaskToTag> {

    @Override
    TaskToTag toTo(Task task);
}
