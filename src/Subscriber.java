public record Subscriber(String name) implements NotificationHandler {
    @Override
    public void notify(String news) {
        System.out.println("Subscriber " + name + " received: " + news);
    }
}
