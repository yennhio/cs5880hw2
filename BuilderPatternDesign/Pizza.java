package BuilderPatternDesign;
import java.util.ArrayList;

public class Pizza {
    private String chain;
    private String size;
    private ArrayList<String> topping;

    public Pizza(ArrayList<String> topping, String chain, String size) {
        this.topping = topping;
        this.chain = chain;
        this.size = size;
    }

    public void eat() {
        System.out.print(chain + " " + size + ", toppings: ");
        for (int i=0; i<topping.size(); i++){
                System.out.print(topping.get(i) + ", ");
        }
        System.out.println();
    }
}
