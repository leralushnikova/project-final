package com.javarush.jira.profile.internal.web;

import com.javarush.jira.AbstractControllerTest;
import com.javarush.jira.JiraRushApplication;
import com.javarush.jira.login.AuthUser;
import com.javarush.jira.login.User;
import com.javarush.jira.login.internal.UserRepository;
import com.javarush.jira.profile.ProfileTo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = JiraRushApplication.class)
class ProfileRestControllerTest extends AbstractControllerTest {

    @Autowired
    protected ProfileRestController profileRestController;

    @Autowired
    private UserRepository userRepository;

    @Test
    void should_ProfileTo_get_notNull() {
        User user = userRepository.findById(1L).get();
        AuthUser authUser = new AuthUser(user);
        ProfileTo profileTo = profileRestController.get(authUser);
        assertNotNull(profileTo);
    }

    @Test
    void should_ProfileTo_get_Equals() {
        ProfileTo profileTo = profileRestController.get(1L);
        User user2 = userRepository.findById(1L).get();
        AuthUser authUser2 = new AuthUser(user2);
        ProfileTo profileTo2 = profileRestController.get(authUser2);
        assertEquals(profileTo, profileTo2);
    }

    @Test
    void should_ProfileTo_update_notNull() {
        User user = userRepository.findById(1L).get();
        user.setFirstName("John");
        user.setFirstName("Doy");
        AuthUser authUser = new AuthUser(user);
        ProfileTo profileTo = profileRestController.get(authUser);
        profileRestController.update(profileTo, 1L);
        ProfileTo profileTo2 = profileRestController.get(1L);
        assertEquals(profileTo, profileTo2);
    }



}