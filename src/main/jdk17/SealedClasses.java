/**
 Sealed classes/interfaces restrict which classes can extend or implement them. This provides:
 - Controlled inheritance: Only specified classes can be subclasses, preventing unwanted extensions.
 - Exhaustiveness: Useful in switch statements, as the compiler knows all possible subclasses.
 - API safety: Maintainers can evolve code safely, while external developers can't create unexpected implementations.
 - Better maintainability: Changes to the hierarchy are explicit and controlled.
**/

sealed interface Canis permits Lupus, Familiaris {
    String getCommonName();
}

static final class Lupus implements Canis {
    public String getCommonName(){
        return "Wolf";
    }
}
static final class Familiaris implements Canis {
    public String getCommonName(){
        return "Dog";
    }
}

void main(){
    Canis wolf = new Lupus();
    Canis dog = new Familiaris();

    System.out.printf("I am a %s.%n", wolf.getCommonName());
    System.out.printf("I am a %s.%n", dog.getCommonName());
}
