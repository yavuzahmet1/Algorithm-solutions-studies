package org.example.model;

public class House {
    private HouseSizeType size;
    public int price;

    public House(HouseSizeType size, int price) {
        this.size = size;
        this.price = price;
    }

    public HouseSizeType getSize() {
        return size;
    }

    public void setSize(HouseSizeType size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", price=" + price +
                '}';
    }
}
