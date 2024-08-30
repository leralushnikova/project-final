package com.javarush.jira.bugtracking.task;

import com.javarush.jira.bugtracking.task.to.TaskToTag;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Slf4j
@RestController
@RequestMapping(value = TagController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class TagController {
    public static final String REST_URL = "/api/tags";

    public final TagService tagService;

    @GetMapping("/{id}")
    public TaskToTag getTags(@PathVariable long id) {
        log.info("get tags by taskId={}", id);
        return tagService.getTags(id);
    }

    @PostMapping("/{id}")
    public TaskToTag createTag(@PathVariable long id, @NotBlank @RequestParam String tag) {
        log.info("create tag={} for taskId={}", tag, id);
        return tagService.createTag(id, tag);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id,
                       @NotBlank @RequestParam String oldTag,
                       @NotBlank @RequestParam String newTag){
        tagService.updateTag(id, oldTag, newTag);
    }

    @DeleteMapping("/{id}")
    public void update(@PathVariable long id,
                       @NotBlank @RequestParam String tag){
        tagService.deleteTag(id, tag);
    }
}
