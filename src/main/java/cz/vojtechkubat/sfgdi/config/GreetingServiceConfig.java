package cz.vojtechkubat.sfgdi.config;

import cz.vojtechkubat.sfgdi.serivces.ConstructorGreetingSerivce;
import cz.vojtechkubat.sfgdi.serivces.PropertyInjectedGreetingService;
import cz.vojtechkubat.sfgdi.serivces.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingSerivce constructorGreetingSerivce() {
        return new ConstructorGreetingSerivce();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
