package edu.purdue.cs59000_12.undergradExample.generated_source_code;

public class Oven {
  public Oven() {}

  public Pizza cook(ToppedDough toppedDough, int cookTime) {
    Pizza pizza = Pizza.createPizza(toppedDough, cookTime);
    return pizza;
  }
}
