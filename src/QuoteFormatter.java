public class QuoteFormatter {
    public String format(Quote quote) {
        return "\"" + quote.text() + "\" - " + quote.author();
    }
}
