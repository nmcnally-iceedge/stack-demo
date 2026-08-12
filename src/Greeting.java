public record Greeting(String phrase) {
    public Greeting {
        if (phrase == null || phrase.isBlank()) {
            throw new IllegalArgumentException("phrase");
        }
    }
}
