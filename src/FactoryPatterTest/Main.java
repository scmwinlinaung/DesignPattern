package FactoryPatterTest;

public class Main {
    public static void main(String[] args) {
        OperationSystemFactory operationSystemFactory = new OperationSystemFactory();
        Alcohol tequila = operationSystemFactory.getInstance("Tequila");
        tequila.drink();
        Alcohol whiskey = operationSystemFactory.getInstance("Whiskey");
        whiskey.drink();
        Alcohol rum = operationSystemFactory.getInstance("Rum");
        rum.drink();

    }
}