package lesson_5.ITC_1.Task_1;

public enum Beverages {
    Sprite("Sprite", 55, 0.33f),
    Coca_cola("Coca-cola", 50, 0.33f),
    Fanta("Fanta", 65, 0.5f),
    SEVENUP("7UP", 55, 0.33f),
    Moutain_DEW("Moutain Dew", 55, 0.5f),
    Mirinda("Mirinda", 55, 0.33f),
    Pepsi("Pepsi", 75, 0.5f),
    Burn("Burn", 87, 0.33f),
    Red_Bull("Red Bull", 105, 0.5f),
    BonAqua("BonAqua", 40, 0.5f);

    private int price;
    private String name;
    private float volume;
    private int count = 5;

    Beverages(String name, int price, float volume) {
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
