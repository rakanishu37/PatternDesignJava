package com.company.Observer;

import java.util.ArrayList;
import java.util.List;

public class Car implements AuctionedItem {
    private Float price;
    private List<AuctionObserver> subscribers;

    public Car(Float price) {
        this.price = price;
        subscribers = new ArrayList<>();
    }

    public void changePrice(Float newPrice) {
        price = newPrice;
        notifySubscribers();
    }

    public Float getPrice() {
        return price;
    }

    @Override
    public void registerObserver(AuctionObserver auctionObserver) {
        subscribers.add(auctionObserver);
    }

    @Override
    public void removeObserver(AuctionObserver auctionObserver) {
        subscribers.remove(auctionObserver);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update(getPrice()));
    }
}
