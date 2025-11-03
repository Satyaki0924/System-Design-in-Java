abstract class Animal {
    enum TYPE {
        MAMMAL, BIRD
    }
    public abstract int getNumberOfLegs();
    public abstract TYPE getAnimalType();
}

class GoldenRetriever extends Animal {

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public Animal.TYPE getAnimalType() {
        return TYPE.MAMMAL;
    }

}

class Peacock extends Animal {

    @Override
    public int getNumberOfLegs() {
       return 2;
    }

    @Override
    public Animal.TYPE getAnimalType() {
        return TYPE.BIRD;
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
