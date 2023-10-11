package cz.vojtechkubat.sfgdi.serivces;

import cz.vojtechkubat.pets.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Property";
    }
}
