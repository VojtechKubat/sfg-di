package cz.vojtechkubat.sfgdi.serivces;

import cz.vojtechkubat.pets.GreetingService;
import org.springframework.stereotype.Service;

//@Service // -> GreetingServiceConfig.java
public class ConstructorGreetingSerivce implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
