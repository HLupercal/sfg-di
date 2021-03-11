package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }
}
