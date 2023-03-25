package FactoryPatternDesign;


public class BertramFactory extends BoatFactory {

    private static BertramFactory instance;

    public static BertramFactory getInstance() {
        if (instance == null) {
            instance = new BertramFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Bertram built a boat");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Bertram restored a boat");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Bertram repaired a boat");
        return null;
    }
    
}
