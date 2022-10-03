package FactoryPatterTest;

public class Whiskey implements Alcohol {

    @Override
    public void drink() {
        System.out.println(
                "According to multiple studies, a glass of whisky a day can help reduce your risk of heart disease and heart failure");

    }
}