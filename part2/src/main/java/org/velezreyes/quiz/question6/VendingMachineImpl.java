package org.velezreyes.quiz.question6;

import java.util.Dictionary;
import java.util.Hashtable;

public class VendingMachineImpl implements VendingMachine {
  private double currentMoney;
  private Dictionary<String, DrinkImpl> drinks = new Hashtable<String, DrinkImpl>();

  public VendingMachineImpl() {
    this.currentMoney = 0;
    this.drinks.put("ScottCola", new DrinkImpl("ScottCola", 0.75, true));
    this.drinks.put("KarenTea", new DrinkImpl("KarenTea", 1.0, false));
  }

  public double getCurrentMoney() {
    return this.currentMoney;
  }

  public void setCurrentMoney(double currentMoney) {
    this.currentMoney = currentMoney;
  }

  public void insertQuarter() {
    this.currentMoney += 0.25;
  }

  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    DrinkImpl drink = this.drinks.get(name);
    if (drink == null) {
      throw new UnknownDrinkException();
    }
    if (this.currentMoney >= drink.getPrice()) {
      this.currentMoney -= drink.getPrice();
      return drink;
    } else {
      throw new NotEnoughMoneyException();
    }
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }
}
