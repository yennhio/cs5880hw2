package FactoryPatternDesign;


public class PorscheFactory extends CarFactory {

    private static PorscheFactory instance;

    public static PorscheFactory getInstance() {
        if (instance == null) {
            instance = new PorscheFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Porsche built a car");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Porsche restored a car");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Porsche repaired a car");
        return null;
    }
    
}
