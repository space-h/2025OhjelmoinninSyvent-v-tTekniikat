import java.time.LocalDate;

public class EventTest {
    public static void main(String[] args) {
        Category category = new Category("apple", "macos");

        Event[] softwareReleases = {
            new Event(LocalDate.of(2024, 9, 16), "macOS 15 Sequoia released", category),
            new Event(LocalDate.of(2023, 9, 26), "macOS 14 Sonoma released", category),
            new Event(LocalDate.of(2022, 10, 24), "macOS 13 Ventura released", category),
            new Event(LocalDate.of(2021, 10, 25), "macOS 12 Monterey released", category),
            new Event(LocalDate.of(2020, 11, 12), "macOS 11 Big Sur released", category)
        };

        for (Event event : softwareReleases) {
            System.out.println(event);
        }
    }
}
