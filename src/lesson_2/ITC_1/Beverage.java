package lesson_2.ITC_1;

public class Beverage {
    private int price;
    private String name;
    private float volume;
    private int count;

    public Beverage(String name, int price, float volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.count = 5;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public float getVolume() {
        return volume;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
