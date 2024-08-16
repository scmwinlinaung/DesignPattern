package BuilderPatternTest;


public class Main {
    public static void main(String args[]) {
        Factory factory = new Factory();
        SmartPhoneBuilder builder = new SmartPhoneBuilder();
        factory.buildSamsaungS24(builder);
        SmartPhone samsaungS24 = builder.getSmartPhone();
        System.out.println("Samsaung CPU : " + samsaungS24.getCpu().getName());

        factory.buildIphone14(builder);
        SmartPhone iphone14 = builder.getSmartPhone();
        System.out.println("Iphone CPU : " + iphone14.getCpu().getName());

    }
}
