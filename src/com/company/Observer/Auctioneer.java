package com.company.Observer;

public class Auctioneer implements AuctionObserver{
    private Float funds;

    public Auctioneer(Float funds) {
        this.funds = funds;
    }

    @Override
    public void update(Float newBid) {
        String message;
        if(newBid > funds) {
            message = String.format("I cant pay %f , it's way too much",newBid);
        } else {
            message = String.format("Oh boy, i can still win this item, let's rise the bid");
        }
        System.out.println(message);
    }
}
