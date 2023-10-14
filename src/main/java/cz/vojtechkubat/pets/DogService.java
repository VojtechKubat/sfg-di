package cz.vojtechkubat.pets;

public class DogService implements PetService {
    @Override
    public String saySomething() {
        return "Bark bark";
    }
}
