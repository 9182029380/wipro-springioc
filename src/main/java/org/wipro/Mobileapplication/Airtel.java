package org.wipro.Mobileapplication;

public class Airtel implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from Airtel");

    }

    @Override
    public void data() {
        System.out.println("Browsing from Airtel");

    }
}
