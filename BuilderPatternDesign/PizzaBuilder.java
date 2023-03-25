package BuilderPatternDesign;
import java.util.ArrayList;

public class PizzaBuilder {

    private ArrayList<String> topping = new ArrayList<>();
    private String size;
    private String chain;

    public PizzaBuilder() {}

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }


    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }


    public PizzaBuilder addTopping(String newTopping) {
        this.topping.add(newTopping);
        return this;
    }

    public Pizza createPizza() {
        if (size == null) {
            throw new IllegalStateException("Pizza size must be set.");
        }
        return new Pizza(topping, chain, size);
    }




}