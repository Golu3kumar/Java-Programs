package design_pattern.BuilderPattern;

public class PhoneBuilder {

    private String companyName;
    private int price;
    private double displaySize;
    private String processor;
    private int ram;
    private int battery;

    public PhoneBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(companyName,price,displaySize,processor,ram,battery);
    }
}
