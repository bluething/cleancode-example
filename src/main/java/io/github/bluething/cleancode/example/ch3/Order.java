package io.github.bluething.cleancode.example.ch3;

public class Order {
    private long expirationDate;

    public void setExpirationDate(long time) {
        this.expirationDate = time;
    }

    public long getExpirationDate(){
        return expirationDate;
    }
}
