package ObserverPattern;

import Task2.Observer;

public interface Subject {
    void removeObserver(Observer o);
    void registerObserver(Observer o);
    void notifyObservers();
}
© 2019 GitHub, Inc.
