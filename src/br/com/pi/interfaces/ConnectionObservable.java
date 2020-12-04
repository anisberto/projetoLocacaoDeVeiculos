package br.com.pi.interfaces;

public interface ConnectionObservable {

    void addConnectionObserver(ConnectionObserver connectionObserver);
    void removeConnectionObserver(ConnectionObserver connectionObserver);
    void notifyObservers();
}
