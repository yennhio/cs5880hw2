package FactoryPatternDesign;


public class BoeingFactory extends AirplaneFactory {

    private static BoeingFactory instance;

    public static BoeingFactory getInstance() {
        if (instance == null) {
            instance = new BoeingFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Boeing built a plane");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Boeing restored a plane");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Boeing repaired a plane");
        return null;
    }
    
}
