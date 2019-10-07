package Behavior_Pattern.Observer_Pattern;


public class LeftShiftObserver extends Observer{
    LeftShiftObserver(Subject subject){
    this.subject = subject;
    this.subject.addObserver(this);

    }
    public void update(){
        System.out.println(subject.getState()*2);
            }
    
}
