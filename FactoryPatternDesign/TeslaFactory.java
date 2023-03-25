package FactoryPatternDesign;


public class TeslaFactory extends CarFactory {

    private static TeslaFactory instance;

    public static TeslaFactory getInstance() {
        if (instance == null) {
            instance = new TeslaFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Tesla built a car");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Tesla restored a car");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Tesla repaired a car");
        return null;
    }
    
}
