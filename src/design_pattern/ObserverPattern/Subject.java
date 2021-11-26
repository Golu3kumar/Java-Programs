package design_pattern.ObserverPattern;

// Observer Pattern : The Observer Design Pattern is a software design pattern in which an object, called the subject
//                    , maintains a list of its dependents, called observer, and notify them automatically of any
//                     any state changes, usually by calling one of their methods.
public interface Subject {

    void register(Observer o);

    void unregister(Observer o);

    void notifyObserver();

}
