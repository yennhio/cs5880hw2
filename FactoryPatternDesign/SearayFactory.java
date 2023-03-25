package FactoryPatternDesign;


public class SearayFactory extends BoatFactory {

    private static SearayFactory instance;

    public static SearayFactory getInstance() {
        if (instance == null) {
            instance = new SearayFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Searay built a boat");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Searay restored a boat");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Searay repaired a boat");
        return null;
    }
    
}
