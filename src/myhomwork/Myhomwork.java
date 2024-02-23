/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhomwork;


/**
 *
 * @author qudratullah
 */
public class Myhomwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        // Order a cheese pizza
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ordered Pizza: " + cheesePizza.name);

        // Order a pepperoni pizza
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
        System.out.println("Ordered Pizza: " + pepperoniPizza.name);
        // TODO code application logic here
    }
    
}

//


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mainclass;

/**
 *
 * @author qudratullah
 */


abstract class Pizza {
    String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}


class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
    }
}

class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
    }
}


class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}

class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Invalid pizza type");
        }

        return pizza;
    }
}



