package cz.vojtechkubat.sfgdi.serivces;

//@Primary
//@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY bean";
    }
}
