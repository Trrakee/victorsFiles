package edu.purdue.cs59000_12.undergradExample.generated_source_code;

public class Pizza {
  public Pizza() {}

  public static Pizza createPizza(ToppedDough toppedDough, int cookTime) {
    Pizza pizza = new Pizza();
    return pizza;
  }

  public static Pizza cool(Pizza cookedPizza) {
    boolean cooled = false;
    while (!cooled) {
      cooled = coolCycle(cookedPizza);
    }

    return cookedPizza;
  }

  public static boolean coolCycle(Pizza cookedPizza) {
    // method implementation is unspecified
    return true;
  }
}
