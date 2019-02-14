package edu.purdue.cs59000_12.undergradExample.generated_source_code;

public class Customer {
  static void main(
      String[]
          args) { // Because customer1 is an actor with no message being recieved to set off chain
                  // of messages,
    // we assume that Customer is an application with a main method that sets off chain.
    PizzaOrder pizzaOrder = new PizzaOrder();
    Chef pizzaChef = new Chef();

    Pizza finishedPizza = pizzaChef.foodOrder(pizzaOrder);
  }
}
