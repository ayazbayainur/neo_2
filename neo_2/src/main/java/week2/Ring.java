package week2;

public class Ring {
    private int initialPrice;
    private double weight;
    private double size;
    private String material;
    private String production;

    public int getInitialPrice() {
        return initialPrice;
    }

    public int calculatePrice() {
        return (int)((initialPrice / weight) * 0.25 + initialPrice);
    }
    public int calculateProfit() {
        int price = calculatePrice();
        return calculatePrice() - initialPrice;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getProduction() {
        return production;
    }
}
