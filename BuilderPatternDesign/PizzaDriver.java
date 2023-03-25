package BuilderPatternDesign;

public class PizzaDriver {
    public static void main(String[] args) {

        
        Pizza pizza1 = new PizzaBuilder().addTopping("Onions")
                                        .addTopping("Pesto")
                                        .addTopping("Extra Cheese")
                                        .setChain("Pizza Hut")
                                        .setSize("Large")
                                        .createPizza();
        Pizza pizza2 = new PizzaBuilder().addTopping("Onions")
                                        .addTopping("Pesto")
                                        .setChain("Pizza Hut")
                                        .setSize("Small")
                                        .createPizza();

        Pizza pizza3 = new PizzaBuilder().addTopping("Onions")
                                        .addTopping("Pesto")
                                        .addTopping("Extra Cheese")
                                        .addTopping("Pepperoni")
                                        .addTopping("Chicken")
                                        .addTopping("Olives")
                                        .addTopping("Spicy Pork")
                                        .addTopping("Spinach")
                                        .setChain("Little Caesars")
                                        .setSize("Medium")
                                        .createPizza();

        Pizza pizza4 = new PizzaBuilder().addTopping("Onions")
                                        .addTopping("Pesto")
                                        .addTopping("Extra Cheese")
                                        .addTopping("Pepperoni")
                                        .addTopping("Chicken")
                                        .addTopping("Olives")
                                        .setChain("Little Caesars")
                                        .setSize("Small")
                                        .createPizza();
        
        Pizza pizza5 = new PizzaBuilder().addTopping("Onions")
                                        .setChain("Dominos")
                                        .setSize("Small")
                                        .createPizza();

        Pizza pizza6 = new PizzaBuilder().addTopping("Onions")
                                        .addTopping("Ham and Pineapple")
                                        .addTopping("Chicken")
                                        .setChain("Dominos")
                                        .setSize("Large")
                                        .createPizza();

                        
        System.out.println("PizzaHut");
        pizza1.eat();
        pizza2.eat();

        System.out.println("Little Caesars");
        pizza3.eat();
        pizza4.eat();

        System.out.println("Dominos");
        pizza5.eat();
        pizza6.eat();
    }
}