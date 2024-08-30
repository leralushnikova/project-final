package com.javarush.jira.bugtracking.task;

import com.javarush.jira.bugtracking.Handlers;
import com.javarush.jira.bugtracking.task.mapper.TaskToTagMapper;
import com.javarush.jira.bugtracking.task.to.TaskToTag;
import com.javarush.jira.common.error.NotFoundException;
import com.javarush.jira.common.util.Util;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class TagService {

    private final TaskRepository taskRepository;
    private final TaskToTagMapper taskToTagMapper;

    @Transactional
    public TaskToTag getTags(Long id) {
        Task task = Util.checkExist(id, taskRepository.findById(id));
        return taskToTagMapper.toTo(task);
    }

    @Transactional
    public TaskToTag createTag(Long id, String tag) {
        Task task =  Util.checkExist(id, taskRepository.findById(id));
        task.getTags().add(tag);
        return taskToTagMapper.toTo(task);
    }

    @Transactional
    public void updateTag(Long id, String oldTag, String newTag) {
        Task task = Util.checkExist(id, taskRepository.findById(id));
        Set<String> tags = task.getTags();
        boolean flag = false;
        for(String tag : tags) {
            if(tag.equals(oldTag)) {
                tags.remove(tag);
                tag = newTag;
                tags.add(tag);
                flag = true;
                break;
            }
        }
        if(!flag) {
            throw new NotFoundException("oldTag don't find");
        }
    }

    @Transactional
    public void deleteTag(Long id, String tag) {
        Task task = Util.checkExist(id, taskRepository.findById(id));
        String s = task.getTags().stream().filter(str -> str.equals(tag)).findAny().orElseThrow(() -> new NotFoundException("tag don't find"));
        task.getTags().remove(s);
    }
}
