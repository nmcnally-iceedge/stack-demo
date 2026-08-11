public class QuoteController {
    private final QuoteService service = new QuoteService();
    private final QuoteFormatter formatter = new QuoteFormatter();

    public String get() {
        return formatter.format(service.current());
    }
}
