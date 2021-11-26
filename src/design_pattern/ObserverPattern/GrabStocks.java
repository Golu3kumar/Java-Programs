package design_pattern.ObserverPattern;

public class GrabStocks {
    public static void main(String[] args) {

        // creating stockGrabber that publish update and responsible for creating observer
        StockGrabber stockGrabber = new StockGrabber();

        // creating our first observer
        Observer teekam = new StockObserver(stockGrabber,"Teekam");

        stockGrabber.setIbmPrice(345.00);
        stockGrabber.setApplePrice(456.78);

        Observer golu = new StockObserver(stockGrabber,"Golu");

        stockGrabber.setGooglePrice(989.23);

        // deleting observer
        stockGrabber.unregister(golu);

        stockGrabber.setIbmPrice(506.45);

    }
}
