package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

public class HelloWorldServiceSpanishImp implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Holla amigo";
    }
}
