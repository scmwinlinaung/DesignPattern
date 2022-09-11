package ObserverPattern;

public class ShanStateObserver extends Observer {
    public ShanStateObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(
                "It is Shan State and total vote count is : " + subject.getVoteCount());
    }
}
