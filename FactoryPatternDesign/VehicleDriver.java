package FactoryPatternDesign;

public class VehicleDriver {
    
    public static void main(String[] args) {

        TeslaFactory tesla = new TeslaFactory();
        tesla.build();
        tesla.repair();
        tesla.restore();

        HondaFactory honda = new HondaFactory();
        honda.build();
        honda.repair();
        honda.restore();

        PorscheFactory porsche = new PorscheFactory();
        porsche.build();
        porsche.repair();
        porsche.restore();

        AirbusFactory airbus = new AirbusFactory();
        airbus.build();
        airbus.repair();
        airbus.restore();
        
        BoeingFactory boeing = new BoeingFactory();
        boeing.build();
        boeing.repair();
        boeing.restore();
        
        EmbraerFactory embraer = new EmbraerFactory();
        embraer.build();
        embraer.repair();
        embraer.restore();

        TeslaFactory tesla2 = new TeslaFactory();
        tesla2.build();
        tesla2.repair();
        tesla2.restore();

        
    }
}
