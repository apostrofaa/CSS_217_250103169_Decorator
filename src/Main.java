interface Pizza {
    double getCost();
    String getDescription();
}
class PlainPizza implements Pizza {
    @Override
    public double getCost() {
        return 5.0;
    }
    @Override
    public String getDescription() {
        return "Plain Dough & Sauce";
    }
}
abstract class ToppingDecorator implements Pizza {
    protected final Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double getCost() {
        return pizza.getCost();
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Cheese";
    }
}
class Olives extends ToppingDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Black Olives";
    }
}
class Pineapple extends ToppingDecorator {
    public Pineapple(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sweet Pineapple";
    }
}
public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new PlainPizza();
        myPizza = new Cheese(myPizza);
        myPizza = new Olives(myPizza);
        myPizza = new Pineapple(myPizza);
        System.out.println("--- Your Order Details ---");
        System.out.println("Order: " + myPizza.getDescription());
        System.out.printf("Total: $%.2f%n", myPizza.getCost());
    }
}