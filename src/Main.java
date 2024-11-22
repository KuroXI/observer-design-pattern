public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriberOne = new Subscriber("Ray");
        Subscriber subscriberTwo = new Subscriber("Clifford");
        Subscriber subscriberThree = new Subscriber("Scott");

        newsAgency.subscribe(subscriberOne);
        newsAgency.subscribe(subscriberTwo);
        newsAgency.subscribe(subscriberThree);

        newsAgency.publishNews("Typhoons Nika, Ofel, Pepito leave P478-million damage");

        newsAgency.unsubscribe(subscriberTwo);

        newsAgency.publishNews("Around 4,000 houses in Catanduanes damaged by Pepito's onslaught");
    }
}
