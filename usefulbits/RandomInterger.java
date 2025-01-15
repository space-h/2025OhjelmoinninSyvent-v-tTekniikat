import java.util.Random;

public class RandomInterger {
    public static void main(String[] args) {
    
        Random r = new Random();

        int value = r.nextInt(100) + 1;

        System.out.println(value);


    }

}