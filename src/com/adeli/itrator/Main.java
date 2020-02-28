package com.adeli.itrator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("www.google.com");
        browseHistory.push("www.yahoo.com");
        browseHistory.push("www.ask.com");

        Iterator iterator = browseHistory.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
