package FactoryPatterTest;

public class Tequila implements Alcohol {

    @Override
    public void drink() {
        System.out.println(
                "Tequila may be a comparatively healthier option than some other types of alcohol because it contains fewer calories, zero sugar, and zero carbohydrates");
    }
}