package Task3;

import java.util.Hashtable;
import java.util.Scanner;

public class HashtableTask {
    public static void main(String[] args){

        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("Horodyskyi", "+380681197741");
        hashtable.put("Ivanenko", "+380758723830");
        hashtable.put("Sternenko", "+380673529073");

        System.out.println("Enter lastname");
        Scanner scanner = new Scanner(System.in);
        System.out.println(hashtable.get(scanner.nextLine()));

    }
}
