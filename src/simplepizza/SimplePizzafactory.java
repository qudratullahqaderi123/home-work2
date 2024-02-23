/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepizza;

/**
 *
 * @author qudratullah
 */
//public class SimplePizzafactory {
//    
//    
//}

///



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package simplepizzafactory;

/**
 *
 * @author qudratullah
 */
public class SimplePizzafactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}

 class PizzaStore {
    SimplePizzafactory factory;

    public PizzaStore(SimplePizzafactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // Other methods here

    public static void main(String[] args) {
        SimplePizzafactory pizzaFactory = new SimplePizzafactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        // Order a cheese pizza
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");

        // Order a pepperoni pizza
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");
    }
}

interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}

class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheese pizza into slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing cheese pizza");
    }
}

class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking pepperoni pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pepperoni pizza into slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing pepperoni pizza");
    }
}

class ClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing clam pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking clam pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting clam pizza into slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing clam pizza");
    }
}

class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting veggie pizza into slices");
    }

    @Override
    public void box() {
        System.out.println("Boxing veggie pizza");
    }
}
