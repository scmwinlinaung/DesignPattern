package FactoryPatterTest;

public class OperationSystemFactory {
    public Alcohol getInstance(String alcohol) {
        if (alcohol.equals("Tequila")) {
            return new Tequila();
        } else if (alcohol.equals("Rum")) {
            return new Rum();
        } else {
            return new Whiskey();
        }
    }
}