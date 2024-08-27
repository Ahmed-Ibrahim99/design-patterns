package com.amaghrabi.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create the subject (news agency)
        NewsAgency newsAgency = new NewsAgency();

        // Create some observers (subscribers)
        Subscriber subscriber1 = new Subscriber("Alice");
        Subscriber subscriber2 = new Subscriber("Bob");

        // Register observers with the subject
        newsAgency.registerObserver(subscriber1);
        newsAgency.registerObserver(subscriber2);

        // Publish some news, all subscribers will be notified
        newsAgency.setNews("Breaking News: Java is awesome!");

        // Bob unsubscribes
        newsAgency.removeObserver(subscriber2);

        // Publish more news, only Alice will be notified
        newsAgency.setNews("More news: Java design patterns are powerful!");
    }
}