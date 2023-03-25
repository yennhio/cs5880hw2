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

        AirbusFactory airbus2 = new AirbusFactory();
        airbus2.build();
        airbus2.repair();
        airbus2.restore();

        BertramFactory bertram = new BertramFactory();
        bertram.build();
        bertram.repair();
        bertram.restore();

        MastercraftFactory master = new MastercraftFactory();
        master.build();
        master.repair();
        master.restore();
        
        SearayFactory searay = new SearayFactory();
        searay.build();
        searay.repair();
        searay.restore();
        
    }
}
