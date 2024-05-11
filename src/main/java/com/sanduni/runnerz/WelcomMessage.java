package com.sanduni.runnerz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
@Component

public class WelcomMessage {

    public String getWelcomeMessage(){
        return "Welcome to the Spring boot Application";
    }
}
