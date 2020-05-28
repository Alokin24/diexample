package guru.springframework.config;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImp;
import guru.springframework.services.HelloWorldServiceSpanishImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile( {"default", "english"} )
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImp();
    }

    @Profile("spanish")
    @Bean
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImp();
    }
}
