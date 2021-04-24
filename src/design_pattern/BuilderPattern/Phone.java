package design_pattern.BuilderPattern;

// this is Phone class that contains some properties of a phone that keep in mind while purchasing.

public class Phone {
    private String companyName;
    private int price;
    private double displaySize;
    private String processor;
    private int ram;
    private int battery;

    //parameterized constructor
    public Phone(String companyName, int price, double displaySize, String processor, int ram, int battery) {
        this.companyName = companyName;
        this.price = price;
        this.displaySize = displaySize;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
    }

    //overriding toString method.
    @Override
    public String toString() {
        return "Phone{" +
                "companyName='" + companyName + '\'' +
                ", price=" + price + "INR "+
                ", displaySize=" + displaySize +"inch "+
                ", processor='" + processor + '\'' +
                ", ram=" + ram + "GB " +
                ", battery=" + battery + "mAH" +
                '}';
    }
}
