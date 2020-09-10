package com.company.Observer;

public class Main {
    public static void main(String[] args) {

        AuctionedItem item = new Car(1000f);
        Auctioneer gallardo = new Auctioneer(2000f);
        item.registerObserver(gallardo);
        Auctioneer francescoli = new Auctioneer(36000f);
        item.registerObserver(francescoli);

        ((Car)item).changePrice(35000f);
        item.removeObserver(gallardo);
        ((Car)item).changePrice(45000f);
    }
}
