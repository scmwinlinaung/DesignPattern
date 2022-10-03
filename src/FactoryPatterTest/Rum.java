package FactoryPatterTest;

public class Rum implements Alcohol {

    @Override
    public void drink() {
        System.out.println("Rum consumption can give you a healthy and strong heart.");
    }

}