package cz.vojtechkubat.sfgdi.serivces;

import cz.vojtechkubat.pets.GreetingService;
import org.springframework.stereotype.Service;

//@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
