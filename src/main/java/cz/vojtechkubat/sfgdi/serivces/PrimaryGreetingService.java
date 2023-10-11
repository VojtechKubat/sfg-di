package cz.vojtechkubat.sfgdi.serivces;

import cz.vojtechkubat.pets.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY bean";
    }
}
