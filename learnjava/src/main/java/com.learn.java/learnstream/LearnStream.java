package com.learn.java.learnstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/15
 */
public class LearnStream {

    private static final Logger logger = LoggerFactory.getLogger(LearnStream.class);

    public List<Role> getRole() {
        List<Role> roles = new ArrayList<>();
        int a = 0;
        while (a < 100) {
            roles.add(new Role((long) a, a + ".name"));
            a++;
        }
        return roles;
    }

    public void streamOperator() {
        List<Role> roles = getRole();

        String s = roles.stream()
                .map(role -> "'" + role.getRoleName() + "'")
                .reduce((a, b) -> a)
                .get();
        logger.info(s);
    }

    public static void main(String[] argc) {
        LearnStream learnStream = new LearnStream();
        learnStream.streamOperator();
    }

}
