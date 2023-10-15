package cz.vojtechkubat.sfgdi.config;

import cz.vojtechkubat.pets.DogService;
import cz.vojtechkubat.pets.PetService;
import cz.vojtechkubat.pets.PetServiceFactory;
import cz.vojtechkubat.sfgdi.repositories.EnglishGreetingRepository;
import cz.vojtechkubat.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import cz.vojtechkubat.sfgdi.serivces.I18nEnglishGreetingService;
import cz.vojtechkubat.sfgdi.serivces.I18nSpanishGreetingService;
import cz.vojtechkubat.sfgdi.serivces.ConstructorGreetingSerivce;
import cz.vojtechkubat.sfgdi.serivces.PrimaryGreetingService;
import cz.vojtechkubat.sfgdi.serivces.PropertyInjectedGreetingService;
import cz.vojtechkubat.sfgdi.serivces.SetterInjectedGreetingService;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({ "dog"})
    @Bean
    PetService dogService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile({ "cat" })
    @Bean
    PetService catService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean        // tady neni nutne pouzit jmeno, pokud je stejne jako metoda
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

//    @Bean
//    ConstructorGreetingSerivce constructorGreetingSerivce() {
//        return new ConstructorGreetingSerivce();
//    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
