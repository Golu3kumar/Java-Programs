package design_pattern.ObserverPattern;

public class StockObserver implements Observer{

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;
    private String observerName;


    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber,String observerName) {
        this.stockGrabber = stockGrabber;
        this.observerName = observerName;
        System.out.println("New Observer : "+observerName);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printPrices();
    }

    private void printPrices() {
        System.out.println("Observer name: "+observerName);
        System.out.println("IBM: "+ibmPrice);
        System.out.println("Apple: "+applePrice);
        System.out.println("Google: "+googlePrice);
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
