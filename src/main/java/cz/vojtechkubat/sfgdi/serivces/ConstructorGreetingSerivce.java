package cz.vojtechkubat.sfgdi.serivces;

//@Service // -> GreetingServiceConfig.java
public class ConstructorGreetingSerivce implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
