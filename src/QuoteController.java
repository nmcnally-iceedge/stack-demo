public class QuoteController {
    private final QuoteService service = new QuoteService();

    public String get() {
        return service.current().text();
    }
}
