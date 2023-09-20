package cz.vojtechkubat.sfgdi.serivces;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingSerivce implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
