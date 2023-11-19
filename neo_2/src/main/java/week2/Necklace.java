package week2;

public class Necklace {
    private double length;
    private int initialPrice;
    private double weight;
    private String material;
    private String production;

    public double getLength() {
        return length;
    }
    public int getInitialPrice() {
        return initialPrice;
    }

    public int calculatePrice() {
        return (int)((initialPrice / weight) * 0.30 + initialPrice);
    }
    public int calculateProfit() {
        int price = calculatePrice();
        return calculatePrice() - initialPrice;
    }

    public double getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getProduction() {
        return production;
    }

}
