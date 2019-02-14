package edu.purdue.cs59000_12.undergradExample.generated_source_code;

public class Chef {
  public Chef() {}

  public Pizza foodOrder(PizzaOrder pizzaOrder) {
    Oven pizzaOven = new Oven();

    Dough pizzaDough = new Dough();

    boolean doughReady = false;
    while (!doughReady) {
      doughReady = pizzaDough.kneadDough();
    }

    ToppedDough toppedDough = new ToppedDough(pizzaDough);

    Pizza cookedPizza;
    if (true) { // CripsyCheese is unspecified in the sequence diagram, so this is essentially a
      // placeholder
      cookedPizza = pizzaOven.cook(toppedDough, 30);
    } else if (false) { // another placeholder
      cookedPizza = pizzaOven.cook(toppedDough, 20);
    }

    Pizza finishedPizza = Pizza.cool(cookedPizza);
    return finishedPizza;
  }
}
