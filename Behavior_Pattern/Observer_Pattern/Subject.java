package Behavior_Pattern.Observer_Pattern;

import java.util.*;

public class Subject{
    // instance field
    private ArrayList<Observer> observers = new ArrayList<>();

    private int state;
    int getState(){
        return this.state;
    }
    private void setState(int state){
        this.state = state;
        this.notifyAllObserver();

    }
    void addObserver(Observer observer){
    observers.add(observer);
    }
    private void notifyAllObserver(){
        for(Observer observer : observers){
            observer.update();
        }
    }
    public static void main(String[] args){
    Subject subject = new Subject();
    new RightShiftObserver(subject);
    new LeftShiftObserver(subject);
    subject.setState(2);
    subject.setState(4);

    }
}
