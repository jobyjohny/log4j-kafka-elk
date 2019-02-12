package com.joby.demojoby;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class Timer {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Timer.class);

    public void log() throws InterruptedException {
        while(true) {
            logger.info("Inside scheduleTask - Sending logs to Kafka at " + DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalDateTime.now()));
            Thread.sleep(3000);
        }
    }

}