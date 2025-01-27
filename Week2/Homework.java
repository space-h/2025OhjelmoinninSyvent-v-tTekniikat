//set TODAY=2025-01-27
// tai mikä vaa muu env variable
//Command prompt
//tee code . command promptissa

package Week2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Homework {
    public static void main(String[] args) {
        String name = "TODAY";
        System.out.println(name + " = " + System.getenv(name));

        LocalDate now = LocalDate.now();
        System.out.println(now);

        // Get the value of the "TODAY" environment variable
        String envValue = System.getenv(name);
        
        if (envValue != null) {
            // Convert the environment variable (string) to LocalDate
            LocalDate envDate = LocalDate.parse(envValue, DateTimeFormatter.ISO_LOCAL_DATE);

            // Compare the dates
            if (envDate.equals(now)) {
                System.out.println("Success");
            }
        } else {
            System.out.println("Environment variable TODAY is not set.");
        }
    }
}
