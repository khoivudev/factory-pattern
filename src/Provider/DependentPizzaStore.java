package Provider;

import Product.*;
import Factory.*;

public class DependentPizzaStore {
    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
        PizzaIngredientFactory chicagoIngredientFactory = new ChicagoPizzaIngredientFactory();

        if(style.equals("NY")) {
            if(type.equals("cheese")) {
                pizza = new CheesePizza(nyIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            } else if (type.equals("veggie")) {
                pizza = new VeggiePizza(nyIngredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            } else if (type.equals("clam")) {
                pizza = new ClamPizza(nyIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
            } else if (type.equals("pepperoni")) {
                pizza = new PepperoniPizza(nyIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        } else if(style.equals("Chicago")) {
            if(type.equals("cheese")) {
                pizza = new CheesePizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            } else if (type.equals("veggie")) {
                pizza = new VeggiePizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            } else if (type.equals("clam")) {
                pizza = new ClamPizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
            } else if (type.equals("pepperoni")) {
                pizza = new PepperoniPizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
            }
        } else {
            System.out.println("Error: invalid type of pizza");
        }

        return pizza;
    }

}
