package ObserverPattern;

public class MandalayStateObserver extends Observer {
    public MandalayStateObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this); // attach observer to subject
    }

    @Override
    public void update() {
        System.out.println(
                "It is Mandalay State and total vote count is : " + subject.getVoteCount());
    }

}
