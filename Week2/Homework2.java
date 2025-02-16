import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Homework2 {
    public static void main(String[] args) {
        String birthdayString = System.getenv("BIRTHDAY");


        if (birthdayString == null) {
            System.out.println("BIRTHDAY environment variable is not set.");
            return; 
        }

        
        LocalDate birthday = LocalDate.parse(birthdayString, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate today = LocalDate.now(); 

        // Compare today's date with the birthday
        if (today.isEqual(birthday)) {
            System.out.println("Happy birthday!");
        } else {
            System.out.println("Not your birthday.");
        }

    
        long daysAlive = today.toEpochDay() - birthday.toEpochDay();
        System.out.println("Days alive so far: " + daysAlive);

    
        if (daysAlive > 0 && daysAlive % 1000 == 0) {
            System.out.println("Round number!");
        }
    }
}
