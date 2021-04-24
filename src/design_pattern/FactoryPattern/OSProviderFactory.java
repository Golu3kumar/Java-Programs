package design_pattern.FactoryPattern;

public class OSProviderFactory {
    // this is os provider class that provides the objects of the different OS implementor class.
    // For hiding the the object creation from the user.
    public OS getInstance(String OS_Name){
        if (OS_Name.equals("Popular"))
            return new Android();
        else if (OS_Name.equals("Secure"))
            return new IOS();
        else
            return new Microsoft();
    }
}
