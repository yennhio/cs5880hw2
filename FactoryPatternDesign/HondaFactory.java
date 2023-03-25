package FactoryPatternDesign;


public class HondaFactory extends CarFactory {

    private static HondaFactory instance;

    public static HondaFactory getInstance() {
        if (instance == null) {
            instance = new HondaFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Honda built a car");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Honda restored a car");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Honda repaired a car");
        return null;
    }
    
}
