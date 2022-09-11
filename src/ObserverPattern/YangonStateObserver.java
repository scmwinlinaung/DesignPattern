package ObserverPattern;

public class YangonStateObserver extends Observer {
    public YangonStateObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(
                "It is Yangon State and total vote count is : " + subject.getVoteCount());
    }
}
