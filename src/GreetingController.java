public class GreetingController {
    private final GreetingService service = new GreetingService();

    public String get() {
        return service.current().phrase();
    }
}
