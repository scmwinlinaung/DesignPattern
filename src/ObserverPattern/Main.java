package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new MandalayStateObserver(subject);
        new ShanStateObserver(subject);
        new YangonStateObserver(subject);

        System.out.println("First state change: 100");
        subject.setVoteCount(100); // update vote count
        System.out.println("Second state change: 200");
        subject.setVoteCount(200);
    }
}
