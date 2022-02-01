package com.designpatterns.behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.browse("google.com");
        browser.browse("amazon.com");
        browser.browse("flipkart.com");
        browser.browse("nyka.com");

        browser.getHistory();

        System.out.println(browser.back());
        System.out.println(browser.back());
        System.out.println(browser.back());
        System.out.println(browser.back());



    }
}
