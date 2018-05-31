package com.stevanrose.springactiviti.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NotificationComponent {

    private final Logger LOGGER = LoggerFactory.getLogger(NotificationComponent.class);

    public void sendEmailNotification() {
        LOGGER.info("****************** Sending email to applicant *******************");
    }

}
