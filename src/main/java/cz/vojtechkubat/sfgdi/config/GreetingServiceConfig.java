package cz.vojtechkubat.sfgdi.config;

import cz.vojtechkubat.pets.I18nEnglishGreetingService;
import cz.vojtechkubat.pets.I18nSpanishGreetingService;
import cz.vojtechkubat.sfgdi.serivces.ConstructorGreetingSerivce;
import cz.vojtechkubat.sfgdi.serivces.PrimaryGreetingService;
import cz.vojtechkubat.sfgdi.serivces.PropertyInjectedGreetingService;
import cz.vojtechkubat.sfgdi.serivces.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean        // tady neni nutne pouzit jmeno, pokud je stejne jako metoda
    I18nEnglishGreetingService i18nService() {
        return new I18nEnglishGreetingService();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

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
