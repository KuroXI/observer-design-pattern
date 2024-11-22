import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<Subscriber> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
        System.out.println(subscriber.name() + " subscribes to news");
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
        System.out.println(subscriber.name() + " unsubscribes from news");
    }

    public void publishNews(String news) {
        System.out.println("Publishing new news: " + news);
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(news);
        }
    }
}
