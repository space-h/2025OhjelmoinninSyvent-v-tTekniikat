package Week2;

import java.util.Arrays;

public class tuntiesimerkki2 {

        public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " = " + args[i]);
        }

    for (int i = 0; i < args.length; i++) {
        System.out.println(i + " = " + args[i]);
    }

    //System.out.println(Arrays.toString(args));

    int[] numbers = new int[args.length];
    //System.out.println(Arrays.toString(numbers));
    
    for (int i = 0; i < args.length; i++){
        try {
            numbers[i] = Integer.parseInt(args[i]);

        }
        catch (NumberFormatException nfe)
        {
            System.err.println("Not a number: " + args[i]);
        }
    }
    int sum = Arrays.stream(numbers).sum();
    //System.out.println(Arrays.toString(numbers));
    System.out.println(sum);


        }
    }

