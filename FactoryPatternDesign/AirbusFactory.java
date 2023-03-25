package FactoryPatternDesign;


public class AirbusFactory extends AirplaneFactory {

    private static AirbusFactory instance;

    public static AirbusFactory getInstance() {
        if (instance == null) {
            instance = new AirbusFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Airbus built a plane");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Airbus restored a plane");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Airbus repaired a plane");
        return null;
    }
    
}
