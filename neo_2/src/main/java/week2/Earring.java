package week2;

public class Earring {
    private String pieceNumber;
    private int initialPrice;
    private double weight;
    private String material;
    private String production;

    public int getInitialPrice() {
        return initialPrice;
    }
    public java.lang.String getPair() {
        return pieceNumber;
    }
    public int calculatePrice() {
        return (int)((initialPrice / weight) * 0.20 + initialPrice);
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
