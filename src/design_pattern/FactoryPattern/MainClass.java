package design_pattern.FactoryPattern;

public class MainClass {

    public static void main(String[] args) {
        // Here we hide the implementation of object creation.
        OSProviderFactory osProviderFactory = new OSProviderFactory();
        OS getOS = osProviderFactory.getInstance("Secure");
        getOS.specs();
    }
}
