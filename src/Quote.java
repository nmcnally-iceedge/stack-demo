/** A quote and who said it. */
public record Quote(String text, String author) {
    public Quote {
        if (text == null) throw new IllegalArgumentException("text");
    }
}
