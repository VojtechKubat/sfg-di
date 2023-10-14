package cz.vojtechkubat.pets;

public class CatService implements PetService {

    @Override
    public String saySomething() {
        return "Meow meow";
    }
}
