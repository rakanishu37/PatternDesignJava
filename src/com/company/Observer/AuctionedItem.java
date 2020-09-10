package com.company.Observer;

public interface AuctionedItem {
    void registerObserver(AuctionObserver auctionObserver);
    void removeObserver(AuctionObserver auctionObserver);
    void notifySubscribers();
}