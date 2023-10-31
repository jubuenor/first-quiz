package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink {
    private String name;
    private double price;
    private boolean isFizzy;

    public DrinkImpl(String name, double price, boolean isFizzy) {
        this.name = name;
        this.price = price;
        this.isFizzy = isFizzy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsFizzy() {
        return this.isFizzy;
    }

    public void setIsFizzy(boolean isFizzy) {
        this.isFizzy = isFizzy;
    }

    public boolean isFizzy() {
        return getIsFizzy();
    }
}
