package design_pattern.BuilderPattern;


public class Shop {

    public static void main(String[] args) {
        // Crating object of Phone class.
        // Is it tedious?
        // Yes, because here we have to pass all the properties in the Constructor.
        // What happens if user doesn't want to give a particular specification(property).
        // we need to change our class file but we don't want to do this.
        // So here is the solution
        // We have to create Builder class that provide specification which provided by the user itself.

        // boring way.
        //Phone xiaomi = new Phone("Redmi",8999,5.5,"Snapdragon 665",4,4000);
        //System.out.println(xiaomi);

        // Now creating Builder class object
        // Advantage :
        // 1. we don't pass all the parameter
        // 2. we don't have to maintain the sequence of parameters
        PhoneBuilder builder = new PhoneBuilder();
        builder.setBattery(4500)
                .setPrice(49000)
                .setCompanyName("Sony")
                .setRam(8)
                .setProcessor("Snapdragon 888")
                .setDisplaySize(6.5);

        Phone sony = builder.getPhone();

        System.out.println("Sony Phone Details : "+sony);

        // builder for redmi phone
        builder = new PhoneBuilder();
        builder.setBattery(5000)
                .setCompanyName("Redmi")
                .setRam(6)
                .setProcessor("Dimension 800U")
                .setDisplaySize(6.5);

        Phone redmi = builder.getPhone();

        System.out.println("Redmi phone Details : "+redmi);
    }
}
