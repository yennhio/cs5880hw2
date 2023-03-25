package FactoryPatternDesign;


public class MastercraftFactory extends BoatFactory {

    private static MastercraftFactory instance;

    public static MastercraftFactory getInstance() {
        if (instance == null) {
            instance = new MastercraftFactory();
        }
        return instance;
    }


    @Override
    Fix build() {
        System.out.println("Mastercraft built a boat");
        return null;
    }

    @Override
    Fix restore() {
        System.out.println("Mastercraft restored a boat");
        return null;
    }
    
    @Override
    Fix repair() {
        System.out.println("Mastercraft repaired a boat");
        return null;
    }
    
}
