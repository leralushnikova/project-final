package com.javarush.jira.bugtracking.task.to;

import com.javarush.jira.common.to.BaseTo;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class TaskToTag extends BaseTo {

    @NotNull
    private Set<String> tags;

    public TaskToTag(Long id, Set<String> tags) {
        super(id);
        this.tags = tags;
    }
}
