package design_pattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject{

    private List<Observer> observerList;
    private double ibmPrice, googlePrice, applePrice;

    public StockGrabber() {
        observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observerList.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int index = observerList.indexOf(deleteObserver);

        System.out.println("Observer : "+(index+1)+" is deleted.");
        observerList.remove(index);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Price changed!, buy stocks now");
        for (Observer observer : observerList) {
            observer.update(ibmPrice,applePrice,googlePrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }
}
