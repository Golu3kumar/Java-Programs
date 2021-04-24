package design_pattern.FactoryPattern;

public class IOS implements OS{
    @Override
    public void specs() {
        System.out.println("This is most secure OS i.e. IOS!");
    }
}
