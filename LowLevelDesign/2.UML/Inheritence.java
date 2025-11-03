abstract class Animal {
    enum AnimalType {
        MAMMAL, BIRD
    }
    public abstract int getNumberOfLegs();
    public abstract AnimalType getAnimalType();
}

class GoldenRetriever extends Animal {

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public Animal.AnimalType getAnimalType() {
        return AnimalType.MAMMAL;
    }

}

class Peacock extends Animal {

    @Override
    public int getNumberOfLegs() {
       return 2;
    }

    @Override
    public Animal.AnimalType getAnimalType() {
        return AnimalType.BIRD;
    }
    
}


public class Inheritence {
    public static void main(String[] args) {
        GoldenRetriever theo = new GoldenRetriever();
        System.err.println("Theo: " + theo.getNumberOfLegs() + " - " + theo.getAnimalType());
        Peacock birdie = new Peacock();
        System.err.println("Birdie: " + birdie.getNumberOfLegs() + " - " + birdie.getAnimalType());
    }
}
