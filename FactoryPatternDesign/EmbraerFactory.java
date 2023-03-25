package FactoryPatternDesign;


public class EmbraerFactory extends AirplaneFactory {

    private static EmbraerFactory instance;

    public static EmbraerFactory getInstance() {
        if (instance == null) {
            instance = new EmbraerFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Embraer built a plane");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Embraer restored a plane");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Embraer repaired a plane");
        return null;
    }
    
}
